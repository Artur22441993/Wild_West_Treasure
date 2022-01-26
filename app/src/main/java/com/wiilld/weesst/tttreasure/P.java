package com.wiilld.weesst.tttreasure;

import android.os.Build;
import android.os.Bundle;
import android.webkit.WebView;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

public class P extends AppCompatActivity {
    WebView jdsk;
    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(1024);
        setContentView(R.layout.p);
        jdsk = findViewById(R.id.jdsk);
        Jsj.jsj(jdsk);
    }
}
