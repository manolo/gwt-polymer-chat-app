package org.gwtcon.client;

import static com.google.gwt.query.client.GQuery.$;

import java.util.Arrays;

import com.google.gwt.core.client.Duration;
import com.google.gwt.core.client.Scheduler;
import com.google.gwt.query.client.Function;
import com.google.gwt.user.client.ui.RootPanel;
import com.vaadin.polymer.Polymer;

public class Chat implements com.google.gwt.core.client.EntryPoint {

    public void onModuleLoad() {
        Polymer.importHref(Arrays.asList(
                "vaadin-pouchdb",
                "iron-localstorage",
                "paper-styles",
                "iron-icons/iron-icons.html",
                "iron-icons/communication-icons.html",
                "neon-animation/neon-animations.html",
                "paper-drawer-panel",
                "paper-header-panel",
                "paper-scroll-header-panel",
                "paper-toolbar",
                "iron-image",
                "paper-menu",
                "paper-item/paper-icon-item",
                "paper-icon-button",
                "paper-button",
                "paper-input",
                "paper-material",
                "paper-dialog",
                "paper-fab",
                "paper-badge",
                "iron-list",
                "iron-flex-layout",
                "iron-icon"
        ));

        Polymer.whenReady(o -> {
            RootPanel.get().add(new Main());

            return null;
        });

        Scheduler.get().scheduleFixedDelay(() -> {
            $(".ts").each(new Function() {
                public void f() {
                    $(this).parent().text(getTimeAgo($(this).text()));
                };
            });
            return true;
        }, 500);
    }

    public static String getTimeAgo(String str) {
      try {
        double ts = Double.parseDouble(str);
        double now = Duration.currentTimeMillis();
        double diff = (now - ts) / 1000;
        int secs = (int) diff % 60;
        int min = (int) diff / 60;
        int hours = (int) min / 60;
        int days = (int) hours / 24;
        int weeks = (int) days / 7;
        int months = (int) days / 31;
        String timeAgo = "";
        if (min == 0) {
          timeAgo = secs < 30 ? "just now" : (secs + " secs ago");
        } else if (min < 60) {
          timeAgo = min + " mins ago";
        } else if (hours < 24) {
          timeAgo = hours + " hours ago";
        } else if (days < 7) {
          timeAgo = days + " days ago";
        } else if (days < 30) {
          timeAgo = weeks + " weeks ago";
        } else {
          timeAgo = months + " months ago";
        }
        return timeAgo;
      } catch(Exception e) {
        return "";
      }
    }
}
