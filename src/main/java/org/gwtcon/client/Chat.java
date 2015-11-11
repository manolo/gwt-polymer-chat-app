package org.gwtcon.client;

import com.google.gwt.user.client.ui.RootPanel;


public class Chat implements com.google.gwt.core.client.EntryPoint {

    public void onModuleLoad() {
        RootPanel.get().add(new Main());
    }
}
