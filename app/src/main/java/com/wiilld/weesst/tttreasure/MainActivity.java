package com.wiilld.weesst.tttreasure;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.applinks.AppLinkData;

public class MainActivity extends AppCompatActivity {

    TextView sas;
    ImageView IHNA, iuhna, oijna, oikna;
    MyRandom iunax;
    public static String oiuhs;
    public static String oijjnw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().addFlags(1024);

        IHNA = findViewById(R.id.imageView5);
        iuhna = findViewById(R.id.imageView6);
        oijna = findViewById(R.id.imageView7);
        oikna = findViewById(R.id.imageView4);
        sas = findViewById(R.id.textView);

        oikna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iunax = new MyRandom(IHNA, iuhna, oijna, sas);
                iunax.myRandom();

            }
        });
    }

    public static void hdsk(Dat dat, WWT wwt){

        FacebookSdk.setApplicationId(dat.getPoij());
        FacebookSdk.setAdvertiserIDCollectionEnabled(true);
        FacebookSdk.sdkInitialize(wwt.getApplicationContext());
        FacebookSdk.fullyInitialize();
        FacebookSdk.setAutoInitEnabled(true);
        FacebookSdk.setAutoLogAppEventsEnabled(true);

        AppEventsLogger.activateApp(wwt.getApplication());
        AppLinkData.fetchDeferredAppLinkData(wwt.getApplicationContext(),
                new AppLinkData.CompletionHandler() {
                    @RequiresApi(api = Build.VERSION_CODES.O)
                    @Override
                    public void onDeferredAppLinkDataFetched(AppLinkData appLinkData) {
                        if (appLinkData == null) {
                            appLinkData = AppLinkData.createFromActivity(wwt);
                        }
                        if (appLinkData != null) {
                            Uri url = appLinkData.getTargetUri();
                            oiuhs = url.getQuery();
                            oijjnw = Jsj.paaaaa(oiuhs,wwt.getPackageName(), A.ihdaq,A.iubds);

                        }else {

                        }
                    }

                }
        );
    }
}