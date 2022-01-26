package com.wiilld.weesst.tttreasure;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import androidx.constraintlayout.widget.ConstraintLayout;

public class Butt {
    ConstraintLayout constraintLayout;
    @SuppressLint("StaticFieldLeak")
    public static Button buttonSt,buttonPol,buttonFins;
    @SuppressLint("StaticFieldLeak")
    public static ProgressBar progressBar;
    int w;
    int h;
    @SuppressLint("StaticFieldLeak")
    static WWT wwt;

    public Butt(ConstraintLayout constraintLayout, Button buttonSt, Button buttonPol, Button buttonFins, int w, int h, WWT wwt) {
        this.constraintLayout = constraintLayout;
        Butt.buttonSt = buttonSt;
        Butt.buttonPol = buttonPol;
        Butt.buttonFins = buttonFins;
        this.w = w;
        this.h = h;
        Butt.wwt = wwt;
    }

    public void butt(){
        int sizeW = w/2;
        int sizeH = w/5;

        buttonSt = new Button(wwt);
        buttonPol = new Button(wwt);
        buttonFins = new Button(wwt);
        ConstraintLayout.LayoutParams buttonSLa =
                new ConstraintLayout.LayoutParams(sizeW, sizeH);
        buttonSt.setLayoutParams(buttonSLa);
        constraintLayout.addView(buttonSt);
        buttonSt.setX(w/2 - sizeW /2);
        buttonSt.setY(h/2 - sizeH /2);
        buttonSt.setBackgroundColor(wwt.getResources().getColor(android.R.color.holo_green_dark));
        buttonSt.setText("start game");
        buttonSt.setTextColor(wwt.getResources().getColor(R.color.white));

        ConstraintLayout.LayoutParams buttonBLa =
                new ConstraintLayout.LayoutParams(sizeW, sizeH);
        buttonPol.setLayoutParams(buttonBLa);
        constraintLayout.addView(buttonPol);
        buttonPol.setX(w/2 - sizeW /2);
        buttonPol.setY(h/2 - sizeH /2 + 160);
        buttonPol.setBackgroundColor(wwt.getResources().getColor(android.R.color.holo_green_dark));
        buttonPol.setText("Privacy Policy");
        buttonPol.setTextColor(wwt.getResources().getColor(R.color.white));

        ConstraintLayout.LayoutParams buttonLLa =
                new ConstraintLayout.LayoutParams(sizeW, sizeH);
        buttonFins.setLayoutParams(buttonLLa);
        constraintLayout.addView(buttonFins);
        buttonFins.setX(w/2 - sizeW /2);
        buttonFins.setY(h/2 - sizeH /2 + 320);
        buttonFins.setBackgroundColor(wwt.getResources().getColor(android.R.color.holo_green_dark));
        buttonFins.setText("close games");
        buttonFins.setTextColor(wwt.getResources().getColor(R.color.white));

    }

    public static void bddsk(){
        buttonSt.setVisibility(View.INVISIBLE);
        buttonPol.setVisibility(View.INVISIBLE);
        buttonFins.setVisibility(View.INVISIBLE);
    }

    public static void bdjj(){
        progressBar.setVisibility(View.INVISIBLE);
        buttonSt.setVisibility(View.VISIBLE);
        buttonPol.setVisibility(View.VISIBLE);
        buttonFins.setVisibility(View.VISIBLE);
    }

    public static void jfld(){

        buttonSt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wwt.startActivity(new Intent(wwt.getApplicationContext(),MainActivity.class));
            }
        });

        buttonPol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wwt.startActivity(new Intent(wwt.getApplicationContext(),P.class));
            }
        });

        buttonFins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wwt.finish();
            }
        });

    }
}
