package com.musigma.mulearn.model;

/**
 * Created with IntelliJ IDEA.
 * User: kumaran
 * Date: 26/04/13
 * Time: 10:55 AM
 * To change this template use File | Settings | File Templates.
 */
public class HelloWorldModel {
    private String message;

    public HelloWorldModel(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
