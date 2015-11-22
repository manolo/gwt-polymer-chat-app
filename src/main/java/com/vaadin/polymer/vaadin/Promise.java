/*
 * This code was generated with Vaadin Web Component GWT API Generator,
 * from vaadin-pouchdb project by Manolo Carrasco Moñino
 * that is licensed with Apache license.
 */
package com.vaadin.polymer.vaadin;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;


/**
 *
 */
@JsType(isNative=true)
@com.google.gwt.core.client.js.JsType
public interface Promise {

    @JsOverlay public static final String NAME = "Promise";
    @JsOverlay public static final String SRC = "vaadin-pouchdb/sample.html";



    /**
     *
     *
     * JavaScript Info:
     * @method on
     * @param {Function} func
     *
     *
     */
    void on(Function func);

    /**
     *
     *
     * JavaScript Info:
     * @method then
     * @param {Function} func
     *
     *
     */
    void then(Function func);

}
