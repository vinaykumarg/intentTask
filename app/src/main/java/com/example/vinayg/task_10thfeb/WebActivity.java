package com.example.vinayg.task_10thfeb;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        WebView wv = (WebView) findViewById(R.id.webview);
        String url = "https://www.google.com/";
        wv.setWebViewClient(new WebViewClient());
        wv.loadUrl(url);
    }

}
