package org.gwtcon.client;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;
import com.google.gwt.core.shared.GWT;
import com.google.gwt.dom.client.DivElement;
import com.google.gwt.dom.client.ImageElement;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Random;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.vaadin.polymer.Polymer;
import com.vaadin.polymer.elemental.HTMLElement;
import com.vaadin.polymer.paper.PaperDialogElement;
import com.vaadin.polymer.paper.PaperInputElement;

public class Main extends Composite {

    private static String names[] = new String[] { "Sona", "Boomer", "Terra", "Qwerty", "Ayzoid", "Ac", "Scrappie", "Skip", "Plier", "Grezzer", "Ihuxroid", "Akmoid", "Talus", "Cyb", "Tera", "Ratchet", "Umap", "Akbtron" };

    @JsType interface Prefs {
        @JsProperty String getNickname();
        @JsProperty void setNickname(String s);
    }

    interface MainUiBinder extends UiBinder<HTMLPanel, Main> {}

    private static MainUiBinder uiBinder = GWT.create(MainUiBinder.class);

    @UiField HTMLElement newThread;
    @UiField DivElement nickname;
    @UiField ImageElement avatar;

    @UiField PaperInputElement nicknameInput;
    @UiField PaperDialogElement nicknameDialog;

    private String name;

    public Main() {
        initWidget(uiBinder.createAndBindUi(this));

        newThread.addEventListener("click", e -> {
            nicknameDialog.open();
        });

        nicknameDialog.addEventListener("iron-overlay-closed", e -> {
            if (Polymer.<Boolean>property(e.getDetail(), "confirmed")) {
                name = nicknameInput.getValue();
                updateUi();
            }
        });

        name = names[Random.nextInt(names.length)];
        updateUi();
    }

    private void updateUi() {
        avatar.setSrc("https://robohash.org/" + name);
        nickname.setInnerText(name);
    }
}
