package com.example.laundryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashAct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //Setting timer untuk 1 detik = 1000m millis
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                //Mengubah activity ke activity lain
                Intent gogetstarted = new Intent(SplashAct.this, GetStarted.class);
                startActivity(gogetstarted);
                finish();
            }
        }, 1000);
    }
}
