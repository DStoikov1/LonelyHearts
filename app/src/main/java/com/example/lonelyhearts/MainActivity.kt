package com.example.lonelyhearts

import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var webView: WebView // Declare webView at the class level

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        webView = findViewById(R.id.webView) // Initialize webView
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

    override fun onBackPressed() {
        // If the WebView can go back, navigate back in its history
        if (webView.canGoBack()) {
            webView.goBack()
        } else {
            // If the WebView cannot go back, proceed with default back button behavior
            super.onBackPressed()
        }
    }
}
