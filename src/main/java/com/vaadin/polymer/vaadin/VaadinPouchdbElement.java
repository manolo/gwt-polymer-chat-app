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
public interface VaadinPouchdbElement extends HTMLElement {

    @JsOverlay public static final String TAG = "vaadin-pouchdb";
    @JsOverlay public static final String SRC = "vaadin-pouchdb/sample.html";


    /**
     *
     *
     * JavaScript Info:
     * @property descending
     * @type Boolean
     *
     */
    @com.google.gwt.core.client.js.JsProperty
    @JsProperty boolean getDescending();
    /**
     *
     *
     * JavaScript Info:
     * @property descending
     * @type Boolean
     *
     */
    @com.google.gwt.core.client.js.JsProperty
    @JsProperty void setDescending(boolean value);

    /**
     *
     *
     * JavaScript Info:
     * @property index
     * @type String
     *
     */
    @com.google.gwt.core.client.js.JsProperty
    @JsProperty String getIndex();
    /**
     *
     *
     * JavaScript Info:
     * @property index
     * @type String
     *
     */
    @com.google.gwt.core.client.js.JsProperty
    @JsProperty void setIndex(String value);

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
     * @method createIndex
     * @param {} prop
     *
     *
     */
    void createIndex(Object prop);

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
     * <p>allDocs</p>
     *
     * JavaScript Info:
     * @method allDocs
     *
     * @return {Promise}
     */
    Promise allDocs();

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
     * <p>Get all docs matching the query string if provided,<br>otherwise we will use the default index defined as an attribute.</p>
     *
     * JavaScript Info:
     * @method query
     * @param {string} query
     * @param {Conf} conf
     *
     * @return {Promise}
     */
    Promise query(String query, Conf conf);

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
     * <p>Remove</p>
     *
     * JavaScript Info:
     * @method remove
     * @param {Object} obj
     *
     * @return {Promise}
     */
    Promise remove(JavaScriptObject obj);

}
