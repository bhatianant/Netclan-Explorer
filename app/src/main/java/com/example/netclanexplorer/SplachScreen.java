package com.example.netclanexplorer;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;

public class SplachScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Window window =getWindow();
//        window.setStatusBarColor(ContextCompat.getColor(this,R.color.white));

        ActionBar actionBar =getSupportActionBar();
        if(actionBar != null){
            actionBar.hide();
        }

        getWindow().getDecorView().setSystemUiVisibility(View.generateViewId());

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplachScreen.this,MainActivity.class));
                finish();
            }
        },2000);

    }
}