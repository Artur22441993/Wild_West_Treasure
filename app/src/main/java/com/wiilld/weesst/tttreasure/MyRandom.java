package com.wiilld.weesst.tttreasure;

import android.os.Handler;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MyRandom {
    private ImageView imageView1;
    private ImageView imageView2;
    private ImageView imageView3;
    private TextView textView;
    private int p =0;

    public MyRandom(ImageView imageView1, ImageView imageView2, ImageView imageView3, TextView textView) {
        this.imageView1 = imageView1;
        this.imageView2 = imageView2;
        this.imageView3 = imageView3;
        this.textView = textView;
    }

    public ImageView getImageView1() {
        return imageView1;
    }

    public void setImageView1(ImageView imageView1) {
        this.imageView1 = imageView1;
    }

    public ImageView getImageView2() {
        return imageView2;
    }

    public void setImageView2(ImageView imageView2) {
        this.imageView2 = imageView2;
    }

    public ImageView getImageView3() {
        return imageView3;
    }

    public void setImageView3(ImageView imageView3) {
        this.imageView3 = imageView3;
    }

    public TextView getTextView() {
        return textView;
    }

    public void setTextView(TextView textView) {
        this.textView = textView;
    }

    public void myRandom(){

        Handler handler = new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
                int min = 500;
                int max = 800;
                int diff = max - min;
                Random random = new Random();
                int i = random.nextInt(diff + 1);
                i += min;
                textView.setText("" + i);

                int a = random.nextInt(4);
                int b = random.nextInt(4);
                int c = random.nextInt(4);
                int img1 = R.drawable.a1;
                int img2 =R.drawable.a2;
                int img3 = R.drawable.a3;
                int img4 = R.drawable.a4;
                int img5 = R.drawable.a5;


                switch (a){
                    case 0:
                        imageView1.setImageResource(img1);
                        break;
                    case 1:  imageView1.setImageResource(img2);
                        break;
                    case 2:  imageView1.setImageResource(img3);
                        break;
                    case 3:  imageView1.setImageResource(img4);
                        break;
                    case 4:  imageView1.setImageResource(img5);
                        break;
                }


                switch (b){
                    case 0:
                        imageView2.setImageResource(img1);
                        break;
                    case 1:  imageView2.setImageResource(img2);
                        break;
                    case 2:  imageView2.setImageResource(img3);
                        break;
                    case 3:  imageView2.setImageResource(img4);
                        break;
                    case 4:  imageView2.setImageResource(img5);
                        break;
                }


                switch (c){
                    case 0:
                        imageView3.setImageResource(img1);
                        break;
                    case 1:  imageView3.setImageResource(img2);
                        break;
                    case 2:  imageView3.setImageResource(img3);
                        break;
                    case 3:  imageView3.setImageResource(img4);
                        break;
                    case 4:  imageView3.setImageResource(img5);
                        break;
                }

                p ++;
                if (p!=20){
                    handler.postDelayed(this::run,40);

                }else {
                    p = 0;}
            }
        });

    }
}
