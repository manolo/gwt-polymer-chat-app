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
public interface VaadinPouchdbElement extends HTMLElement {

    public static final String TAG = "vaadin-pouchdb";
    public static final String SRC = "vaadin-pouchdb/sample.html";


    /**
     * 
     *
     * JavaScript Info:
     * @property dbname
     * @type String
     * 
     */
    @com.google.gwt.core.client.js.JsProperty
    @JsProperty String getDbname();
    /**
     * 
     *
     * JavaScript Info:
     * @property dbname
     * @type String
     * 
     */
    @com.google.gwt.core.client.js.JsProperty
    @JsProperty void setDbname(String value);

    /**
     * 
     *
     * JavaScript Info:
     * @property remote
     * @type String
     * 
     */
    @com.google.gwt.core.client.js.JsProperty
    @JsProperty String getRemote();
    /**
     * 
     *
     * JavaScript Info:
     * @property remote
     * @type String
     * 
     */
    @com.google.gwt.core.client.js.JsProperty
    @JsProperty void setRemote(String value);


    /**
     * <p> TODO</p>
     *
     * JavaScript Info:
     * @method sync
     * @param {} syncError  
     * 
     * 
     */
    void sync(Object syncError);

    /**
     * <p>Post</p>
     *
     * JavaScript Info:
     * @method post
     * @param {Object} obj  
     * 
     * @return {Promise}
     */
    Promise post(JavaScriptObject obj);

    /**
     * <p>Put</p>
     *
     * JavaScript Info:
     * @method put
     * @param {Object} obj  
     * 
     * @return {Promise}
     */
    Promise put(JavaScriptObject obj);

    /**
     * <p>Remove</p>
     *
     * JavaScript Info:
     * @method remove
     * @param {Object} obj  
     * 
     * @return {Promise}
     */
    Promise remove(JavaScriptObject obj);

    /**
     * <p>Info</p>
     *
     * JavaScript Info:
     * @method info
     * @param {Object} info  
     * @param {Function} fnc  
     * @param {Function} err  
     * 
     * 
     */
    void info(JavaScriptObject info, Function fnc, Function err);

    /**
     * <p>Subscribe to changes</p>
     *
     * JavaScript Info:
     * @method changes
     * @param {Function} func  
     * 
     * 
     */
    void changes(Function func);

    /**
     * <p>allDocs with a property</p>
     *
     * JavaScript Info:
     * @method allDocsWith
     * @param {string} property  
     * 
     * @return {Promise}
     */
    Promise allDocsWith(String property);

    /**
     * <p>allDocs</p>
     *
     * JavaScript Info:
     * @method allDocs
     * 
     * @return {Promise}
     */
    Promise allDocs();

}
