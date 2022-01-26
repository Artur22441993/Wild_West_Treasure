package com.wiilld.weesst.tttreasure;

import android.app.Application;
import android.os.Build;

import androidx.annotation.RequiresApi;

import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerLib;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.onesignal.OneSignal;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;
import java.util.Map;

public class A extends Application {


    public static String iubds;
    public static String ihbjaq = "";
    public static String ihdaq;
    public static String ihwq;
    public final static String ihda = "UnNMRGtyWFk4S3JlWE1KZXNGcVgyQg==";
    private static final String fgd = "aHR0cHM6Ly9naXN0LmdpdGh1YnVzZXJjb250ZW50LmNvbS9BcnR1cjIyNDQxOTkzL2M2ZjIzNmUyNzQ3NTYzODM4ZTA3NDdiZGQ0YTEzNGNjL3Jhdy9XaWxkX1dlc3RfVHJlYXN1cmU=";

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public void onCreate() {
        super.onCreate();
        od();
        iubds = AppsFlyerLib.getInstance().getAppsFlyerUID(this);

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    idj();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();

        AppsFlyerLib.getInstance().init(dds(ihda), new AppsFlyerConversionListener() {
            @Override
            public void onConversionDataSuccess(Map<String, Object> saq) {

                ihbjaq = saq.get(dds("YWZfc3RhdHVz")).toString();
                if (ihbjaq.equals(dds("Tm9uLW9yZ2FuaWM="))){
                    String str =saq.get(dds("Y2FtcGFpZ24=")).toString();
                    ihwq = Jsj.paaaaa(str,getPackageName(), ihdaq, iubds);
                }
            }

            @Override
            public void onConversionDataFail(String s) {

            }

            @Override
            public void onAppOpenAttribution(Map<String, String> map) {

            }

            @Override
            public void onAttributionFailure(String s) {

            }
        },this);
        AppsFlyerLib.getInstance().start(this);

    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public static Dat coco()throws Exception{

        Base64.Decoder kisdn = Base64.getDecoder();
        String kins = new String(kisdn.decode(fgd));
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(kins).openConnection();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
        String ssdq = bufferedReader.readLine();
        String [] ojnka = ssdq.split("\\\u007C");
        String kisan = ojnka[0];
        String kidbq = ojnka[1];
        String okknq = ojnka[2];
        Dat dat = new Dat();
        dat.setKsxa(kisan);
        dat.setIhjas(kidbq);
        dat.setPoij(okknq);
        return dat;
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public void od(){
        String sss = "OWE0YjNkNjQtODZjOC00YWJiLThhNDAtYWU5ZmNhNmEyNWJl";
        Base64.Decoder jssa = Base64.getDecoder();
        String ksnsd = new String(jssa.decode(sss));
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE);
        OneSignal.initWithContext(A.this);
        OneSignal.setAppId(ksnsd);
    }

    private void idj()throws Exception{
        ihdaq = AdvertisingIdClient.getAdvertisingIdInfo(getApplicationContext()).getId();
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public static String dds(String sas){
        Base64.Decoder kssal = Base64.getDecoder();
        String iuhba = new String(kssal.decode(sas));
        return iuhba;
    }
}
