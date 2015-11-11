package org.gwtcon.client;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType
public interface Message {
    @JsProperty
    public String getId();

    @JsProperty
    public void setId(String id);

    @JsProperty
    public String getOwner();

    @JsProperty
    public void setOwner(String owner);

    @JsProperty
    public double getTs();

    @JsProperty
    public void setTs(double ts);

    @JsProperty
    public String getMessage();

    @JsProperty
    public void setMessage(String message);
}
