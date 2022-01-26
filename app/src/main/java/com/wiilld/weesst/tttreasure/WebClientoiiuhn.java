package com.wiilld.weesst.tttreasure;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.annotation.RequiresApi;

public class WebClientoiiuhn extends WebViewClient {

    WWT wwt;

    public WebClientoiiuhn(WWT wwt) {
        this.wwt = wwt;
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public void onPageFinished(WebView view, String url) {
        super.onPageFinished(view, url);
        wwt.getSharedPreferences(wwt.getPackageName(), wwt.MODE_PRIVATE).edit().putString(A.dds("c2F2ZWRVcmw="),url).apply();
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public void onPageStarted(WebView view, String url, Bitmap favicon) {
        super.onPageStarted(view, url, favicon);
        if(url.contains(A.dds("NDA0"))){
            wwt.startActivity(new Intent(wwt.getApplicationContext(), MainActivity.class));
            wwt.finishAffinity();
        }
    }
}
