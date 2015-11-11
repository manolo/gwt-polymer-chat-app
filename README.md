# GWT Polymer : Robots Chat App


The new polymer ecosystem makes really easy to share UI components between developers. Let's GWT take advantage of the JS ecosystem to create amazing UIs.

This is the demo project of the talk I gave in the [GWTCon2015](http://www.gwtcon.org/) in Florence: '**Rock GWT UI's with Polymer Elements**'.

### Demo

You can play with the [live application](http://manolo.github.io/gwt-polymer-chat-app/demo/) or have a look to the slides of my [Presentation](http://www.slideshare.net/dodotis/rock-gwt-uis-with-polymer-elements) to understand the architecture.

### Full Stack application

Basically it is a GWT application not using any **GWT** widget but the **Polymer** Elements catalog wrapped with the Vaadin [gwt-polymer-elements](https://github.com/vaadin/gwt-polymer-elements) library.

The application does not use any conventional backend, but a remote instance of **couchDB** which could be replaced with a local instance of **pouchDB** running in the browser if you want to use it offline.

Persistence is done using a couple of polymer elements

 - `<iron-localstorage>` for storing the settings in the browser.
 - `<vaadin-pouchdb>` for accessing either pouchDB or couchDB. It enables realtime thanks to the `changes` API in couchDB.

### Goals

- Demontrate that we can create modern apps in GWT with a just a bunch lines of code.
- We use UIBinder to demonstrate that gwt-polymer-elements can be integrated easily with any existing GWT app.
- We don't use Widgets but Elements to be aligned with new tends in GWT.
- You might move that code to your hosted page not depending at all on uibinder and gwt-user.

