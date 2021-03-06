package org.gwtcon.client;

import static com.vaadin.polymer.Polymer.cast;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import com.google.gwt.core.client.Duration;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.shared.GWT;
import com.google.gwt.dom.client.DivElement;
import com.google.gwt.dom.client.ImageElement;
import com.google.gwt.dom.client.NativeEvent;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Random;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.vaadin.polymer.Polymer;
import com.vaadin.polymer.elemental.HTMLElement;
import com.vaadin.polymer.iron.IronListElement;
import com.vaadin.polymer.iron.IronLocalstorageElement;
import com.vaadin.polymer.paper.PaperBadgeElement;
import com.vaadin.polymer.paper.PaperDialogElement;
import com.vaadin.polymer.paper.PaperFabElement;
import com.vaadin.polymer.paper.PaperInputElement;
import com.vaadin.polymer.vaadin.VaadinPouchdbElement;

public class Main extends Composite {

    private static String names[] = new String[] { "Sona", "Boomer", "Terra", "Qwerty", "Ayzoid", "Ac", "Scrappie", "Skip", "Plier", "Grezzer", "Ihuxroid", "Akmoid", "Talus", "Cyb", "Tera", "Ratchet", "Umap", "Akbtron" };

    @JsType(isNative=true)
    interface Prefs {
        @JsProperty String getNickname();
        @JsProperty void setNickname(String s);
    }

    interface MainUiBinder extends UiBinder<HTMLPanel, Main> {}

    private static MainUiBinder uiBinder = GWT.create(MainUiBinder.class);

    @UiField VaadinPouchdbElement db;
    @UiField IronLocalstorageElement store;

    @UiField HTMLElement newThread;
    @UiField PaperInputElement msgInput;
    @UiField IronListElement messages;
    @UiField DivElement nickname;
    @UiField ImageElement avatar;
    @UiField PaperFabElement send;
    @UiField PaperBadgeElement count;

    @UiField PaperInputElement nicknameInput;
    @UiField PaperDialogElement nicknameDialog;

    private JsArray list;
    private Prefs prefs;

    public Main() {
        initWidget(uiBinder.createAndBindUi(this));

        newThread.addEventListener("click", e -> {
            nicknameDialog.open();
        });

        nicknameDialog.addEventListener("iron-overlay-closed", e -> {
            if (Polymer.<Boolean>property(e.getDetail(), "closed")) {
                prefs.setNickname(nicknameInput.getValue());
                reloadPrefs();
            }
        });

        msgInput.addEventListener("keyup", e -> {
            if (((NativeEvent) e).getKeyCode() == KeyCodes.KEY_ENTER) {
                send();
            }
        });
        send.addEventListener("click", e -> send());

        Polymer.ready(db, (o) -> {
            db.changes(msg -> {
                Message m = cast(msg);
                if (m.getOwner() != null) {
                    list.push(cast(msg));
                    updateUi();
                }
                return null;
            });

            db.sync(null, null);

            db.query(null, null).then(rows -> {
                list = cast(rows);
                reloadPrefs();
                return null;
            });
            return null;
        });
    }

    private void send() {
        if (!msgInput.getValue().isEmpty()) {
            JavaScriptObject msg = createMsg(prefs.getNickname(), msgInput.getValue());
            msgInput.setValue("");
            db.post((JavaScriptObject) msg);
        }
    }

    private void reloadPrefs() {
        prefs = store.getValue().cast();
        if (prefs == null) {
            prefs = JavaScriptObject.createObject().cast();
            prefs.setNickname(names[Random.nextInt(names.length)]);
            store.setValue((JavaScriptObject) prefs);
        }
        store.save();
        updateUi();
    }

    private void updateUi() {
        avatar.setSrc("https://robohash.org/" + prefs.getNickname());
        nickname.setInnerText(prefs.getNickname());

        messages.setItems(list);
        refreshIronList(messages);
        messages.scrollToIndex(list.length());
        count.setLabel("" + list.length());
    }

    private static <T> T createMsg(String owner, String message) {
        Message m = JavaScriptObject.createObject().cast();
        m.setTs(Duration.currentTimeMillis());
        m.setOwner(owner);
        m.setId("" + m.getTs());
        m.setMessage(message);
        return (T)m;
    }

    // FIXME:
    // 1.- iron-list should have a way for refreshing
    // 2.- after updating some rows are not displayed until window is resized.
    // 3.- scroll-to should be performed after grid was refreshed.
    private native static void refreshIronList(IronListElement ironList)
    /*-{
       ironList._itemsChanged({path:'items'});
       $wnd.Polymer.Base.async(function(){
         var ev = $doc.createEvent('Event');
         ev.initEvent('resize', true, true);
         $wnd.dispatchEvent(ev);
         $wnd.Polymer.Base.async(function(){
            ironList.scrollToIndex(ironList.items.length);
         });
       }, 100);
    }-*/;
}
