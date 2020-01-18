package com.example.tcfapplication;

import android.net.Uri;

public class SiteVisitData {

String uri;

    public SiteVisitData(String uri) {
        this.uri = uri;
    }
    public  SiteVisitData(){

    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }
}