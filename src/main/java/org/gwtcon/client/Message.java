package org.gwtcon.client;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;


@JsType(isNative = true)
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
