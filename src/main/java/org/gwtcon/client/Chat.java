package org.gwtcon.client;

import java.util.Arrays;

import com.google.gwt.user.client.ui.RootPanel;
import com.vaadin.polymer.Polymer;

public class Chat implements com.google.gwt.core.client.EntryPoint {

    public void onModuleLoad() {
        Polymer.importHref(Arrays.asList(
                "paper-styles",
                "iron-icons/iron-icons.html",
                "neon-animation/neon-animations.html",
                "paper-drawer-panel",
                "paper-header-panel",
                "paper-scroll-header-panel",
                "paper-toolbar",
                "paper-icon-button",
                "paper-button",
                "iron-flex-layout",
                "iron-icon"
        ));

        Polymer.whenReady((o) -> {
            RootPanel.get().add(new Main());
            return null;
        });
    }
}
