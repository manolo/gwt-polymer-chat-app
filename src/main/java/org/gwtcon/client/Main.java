package org.gwtcon.client;

import static com.vaadin.polymer.Polymer.cast;

import com.google.gwt.core.client.Duration;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;
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
import com.vaadin.polymer.paper.PaperDialogElement;
import com.vaadin.polymer.paper.PaperFabElement;
import com.vaadin.polymer.paper.PaperInputElement;

public class Main extends Composite {

    private static String names[] = new String[] { "Sona", "Boomer", "Terra", "Qwerty", "Ayzoid", "Ac", "Scrappie", "Skip", "Plier", "Grezzer", "Ihuxroid", "Akmoid", "Talus", "Cyb", "Tera", "Ratchet", "Umap", "Akbtron" };

    @JsType interface Prefs {
        @JsProperty String getNickname();
        @JsProperty void setNickname(String s);
    }

    interface MainUiBinder extends UiBinder<HTMLPanel, Main> {}

    private static MainUiBinder uiBinder = GWT.create(MainUiBinder.class);

    @UiField IronLocalstorageElement store;

    @UiField HTMLElement newThread;
    @UiField PaperInputElement msgInput;
    @UiField IronListElement messages;
    @UiField DivElement nickname;
    @UiField ImageElement avatar;
    @UiField PaperFabElement send;

    @UiField PaperInputElement nicknameInput;
    @UiField PaperDialogElement nicknameDialog;

    private JsArray list = JsArray.createArray().cast();
    private Prefs prefs;

    public Main() {
        initWidget(uiBinder.createAndBindUi(this));

        newThread.addEventListener("click", e -> {
            nicknameDialog.open();
        });

        nicknameDialog.addEventListener("iron-overlay-closed", e -> {
            if (Polymer.<Boolean>property(e.getDetail(), "confirmed")) {
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

        Polymer.ready(store, (o) -> {
            reloadPrefs();
            return null;
        });
    }

    private void send() {
        JavaScriptObject msg = createMsg(prefs.getNickname(), msgInput.getValue());
        msgInput.setValue("");
        list.push(cast(msg));
        updateUi();
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
    }

    private static <T> T createMsg(String owner, String message) {
        Message m = JavaScriptObject.createObject().cast();
        m.setTs(Duration.currentTimeMillis());
        m.setOwner(owner);
        m.setId("" + m.getTs());
        m.setMessage(message);
        return (T)m;
    }

    // FIXME: iron-list should have a way for refreshing
    private native static void refreshIronList(IronListElement ironList)
    /*-{
       ironList._itemsChanged({path:'items'})
    }-*/;
}
