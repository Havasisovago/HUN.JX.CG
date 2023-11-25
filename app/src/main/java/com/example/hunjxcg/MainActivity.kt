package com.example.hunjxcg

import android.os.Bundle
import android.view.View
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonShowImage: Button = findViewById(R.id.button)
        val webView: WebView = findViewById(R.id.webView)
        webView.visibility = View.INVISIBLE

        buttonShowImage.setOnClickListener {
            // Betöltjük a GIF-et a WebView-be
            webView.settings.javaScriptEnabled = true
            
            webView.settings.loadWithOverviewMode = true
            webView.settings.useWideViewPort = true

            webView.loadUrl("file:///android_res/drawable/jx.gif")

            // Webview láthatóságának beállítása
            webView.visibility = View.VISIBLE
        }

        // Webview beállítása, hogy a GIF-et megjelenítse
        webView.webViewClient = WebViewClient()
    }
}
