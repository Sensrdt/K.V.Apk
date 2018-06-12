package com.example.jkd.kvkolkataregion;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class HomePage extends AppCompatActivity {

    private WebView myWebview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        final ProgressBar progressBar = findViewById(R.id.pr1);



        myWebview = findViewById(R.id.dynamic);
        WebSettings webSettings = myWebview.getSettings();
        webSettings.setJavaScriptEnabled(true);
        myWebview.setWebViewClient(new WebViewClient(){
            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                progressBar.setVisibility(View.VISIBLE);
                setTitle("Loading...");
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                progressBar.setVisibility(View.GONE);
                setTitle(view.getTitle());
            }

        });
        myWebview.loadUrl("http://www.kvcossipore.org.in");


    }
    public void onBackPressed(){
        if(myWebview.canGoBack()){
            myWebview.goBack();
        }else{
            super.onBackPressed();
        }
    }
}

