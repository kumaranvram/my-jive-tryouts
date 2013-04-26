package com.musigma.mulearn.link;

import com.jivesoftware.community.web.component.AbstractActionLink;

public class HelloWorldLink extends AbstractActionLink {

    @Override
    public boolean isVisible() {
        return true;
    }

    @Override
    public String getUrl() {
        return "/helloworld.jspa";
    }
}
