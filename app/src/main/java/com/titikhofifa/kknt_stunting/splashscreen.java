package com.titikhofifa.kknt_stunting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

public class splashscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(decorView.SYSTEM_UI_FLAG_FULLSCREEN);

        if (getSupportActionBar() != null) {
            getActionBar().hide();
        }
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = null;
                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
                    intent = new Intent(splashscreen.this, MainActivity.class);
                }
                startActivity(intent);
                finish();
            }
        }, 7000);
    }
}