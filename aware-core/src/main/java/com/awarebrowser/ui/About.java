package com.awarebrowser.ui;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.awarebrowser.R;

public class About extends Aware_Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.aware_about);

        WebView about_us = (WebView) findViewById(R.id.about_us);
        WebSettings settings = about_us.getSettings();
        settings.setJavaScriptEnabled(true);
        about_us.loadUrl("http://www.mariak.webd.pl/study/");
    }
}
