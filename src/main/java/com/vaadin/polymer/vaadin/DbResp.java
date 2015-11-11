/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from vaadin-pouchdb project by Manolo Carrasco Moñino
 * that is licensed with Apache license.
 */
package com.vaadin.polymer.vaadin;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;


/**
 * 
 */
@JsType(isNative=true)
@com.google.gwt.core.client.js.JsType
public interface DbResp {

    public static final String TAG = "DbResp";
    public static final String SRC = "vaadin-pouchdb/sample.html";


    /**
     * 
     *
     * JavaScript Info:
     * @property offset
     * @type Number
     * 
     */
    @com.google.gwt.core.client.js.JsProperty
    @JsProperty double getOffset();
    /**
     * 
     *
     * JavaScript Info:
     * @property offset
     * @type Number
     * 
     */
    @com.google.gwt.core.client.js.JsProperty
    @JsProperty void setOffset(double value);

    /**
     * 
     *
     * JavaScript Info:
     * @property rows
     * @type Array
     * 
     */
    @com.google.gwt.core.client.js.JsProperty
    @JsProperty JsArray getRows();
    /**
     * 
     *
     * JavaScript Info:
     * @property rows
     * @type Array
     * 
     */
    @com.google.gwt.core.client.js.JsProperty
    @JsProperty void setRows(JsArray value);

    /**
     * 
     *
     * JavaScript Info:
     * @property total_rows
     * @type Number
     * 
     */
    @com.google.gwt.core.client.js.JsProperty
    @JsProperty double getTotal_rows();
    /**
     * 
     *
     * JavaScript Info:
     * @property total_rows
     * @type Number
     * 
     */
    @com.google.gwt.core.client.js.JsProperty
    @JsProperty void setTotal_rows(double value);


}
