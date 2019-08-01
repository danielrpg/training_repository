package com.app.englishapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //start home activity
        startActivity(new Intent(SplashScreen.this, MainActivity.class));

        //close the splash activity
        finish();
    }
}
