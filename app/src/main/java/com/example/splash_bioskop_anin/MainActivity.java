package com.example.splash_bioskop_anin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import badoystudio.com.splashscreengojek.R;

public class MainActivity extends AppCompatActivity {
    
    //private static final android.R.attr R = ;
    private int waktu_loading=4000;
    private Object MainActivity;

    //4000=4 detik

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView((View) MainActivity);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {



                Intent home=new Intent(MainActivity.this, activity_home.class);
                startActivity(home);
                finish();

            }
        },waktu_loading);
    }


}