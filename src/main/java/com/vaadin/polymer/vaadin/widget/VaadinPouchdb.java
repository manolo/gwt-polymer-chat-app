/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from vaadin-pouchdb project by Manolo Carrasco Moñino
 * that is licensed with Apache license.
 */
package com.vaadin.polymer.vaadin.widget;

import com.vaadin.polymer.vaadin.*;

import com.vaadin.polymer.PolymerWidget;
import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * 
 */
public class VaadinPouchdb extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public VaadinPouchdb() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public VaadinPouchdb(String html) {
        super(VaadinPouchdbElement.TAG, VaadinPouchdbElement.SRC, html);

    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public VaadinPouchdbElement getPolymerElement() {
        try {
            return (VaadinPouchdbElement) getElement();
        } catch (ClassCastException e) {
            jsinteropError();
            return null;
        }
    }


    /**
     * 
     *
     * JavaScript Info:
     * @property dbname
     * @type String
     * 
     */
    public String getDbname() {
        return getPolymerElement().getDbname();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property dbname
     * @type String
     * 
     */
    public void setDbname(String value) {
        getPolymerElement().setDbname(value);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @property remote
     * @type String
     * 
     */
    public String getRemote() {
        return getPolymerElement().getRemote();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property remote
     * @type String
     * 
     */
    public void setRemote(String value) {
        getPolymerElement().setRemote(value);
    }



    /**
     * <p> TODO</p>
     *
     * JavaScript Info:
     * @method sync
     * @param {} syncError  
     * 
     * 
     */
    public void sync(Object syncError) {
        getPolymerElement().sync(syncError);
    }

    /**
     * <p>Post</p>
     *
     * JavaScript Info:
     * @method post
     * @param {Object} obj  
     * 
     * @return {Promise}
     */
    public Promise post(JavaScriptObject obj) {
        return getPolymerElement().post(obj);
    }

    /**
     * <p>Put</p>
     *
     * JavaScript Info:
     * @method put
     * @param {Object} obj  
     * 
     * @return {Promise}
     */
    public Promise put(JavaScriptObject obj) {
        return getPolymerElement().put(obj);
    }

    /**
     * <p>Remove</p>
     *
     * JavaScript Info:
     * @method remove
     * @param {Object} obj  
     * 
     * @return {Promise}
     */
    public Promise remove(JavaScriptObject obj) {
        return getPolymerElement().remove(obj);
    }

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
    public void info(JavaScriptObject info, Function fnc, Function err) {
        getPolymerElement().info(info, fnc, err);
    }

    /**
     * <p>Subscribe to changes</p>
     *
     * JavaScript Info:
     * @method changes
     * @param {Function} func  
     * 
     * 
     */
    public void changes(Function func) {
        getPolymerElement().changes(func);
    }

    /**
     * <p>allDocs with a property</p>
     *
     * JavaScript Info:
     * @method allDocsWith
     * @param {string} property  
     * 
     * @return {Promise}
     */
    public Promise allDocsWith(String property) {
        return getPolymerElement().allDocsWith(property);
    }

    /**
     * <p>allDocs</p>
     *
     * JavaScript Info:
     * @method allDocs
     * 
     * @return {Promise}
     */
    public Promise allDocs() {
        return getPolymerElement().allDocs();
    }


}
