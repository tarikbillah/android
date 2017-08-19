package com.tarikbilla.webview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    WebView webview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webview = (WebView)findViewById(R.id.webview_id);
        //enabled java script
        webview.getSettings().getJavaScriptEnabled();
        //when user click a link from a webpage open link webview area
        webview.setWebViewClient(new WebViewClient());
        //load weblink
        webview.loadUrl("http://tarikbilla.me");

    }
}
