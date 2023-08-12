package com.example.lonelyhearts


import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val webView: WebView = findViewById(R.id.webView)
        webView.settings.mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW
        webView.settings.javaScriptEnabled = true // Enable JavaScript

        // Set up WebViewClient to handle page loading events
        webView.webViewClient = object : WebViewClient() {
            override fun onPageStarted(view: WebView?, url: String?, favicon: android.graphics.Bitmap?) {
                // Handle page start event
            }

            override fun onPageFinished(view: WebView?, url: String?) {
                // Handle page finish event
            }
        }

        webView.loadUrl("https://www.lonelyhearts.pp.ua/")
    }
}
