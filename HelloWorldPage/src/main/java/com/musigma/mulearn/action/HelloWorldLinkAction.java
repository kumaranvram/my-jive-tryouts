package com.musigma.mulearn.action;

import com.jivesoftware.community.action.JiveActionSupport;
import com.musigma.mulearn.model.HelloWorldModel;
import com.opensymphony.xwork2.ModelDriven;

public class HelloWorldLinkAction extends JiveActionSupport implements ModelDriven {

    @Override
    public Object getModel() {
        return new HelloWorldModel("Hello World!");
    }
}