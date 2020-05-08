package com.example.day1;

import android.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Homepage extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);


        // Get the application action bar and hide it
        //        ActionBar ab = getActionBar();
        //        ab.hide();

        //WEBVIEW
        webView=(WebView)findViewById(R.id.webview);
        webView.loadUrl("https://www.google.com/");
    }
}
