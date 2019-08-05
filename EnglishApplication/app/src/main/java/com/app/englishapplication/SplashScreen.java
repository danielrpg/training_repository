package com.app.englishapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashScreen extends AppCompatActivity {

    private Handler handler;
    private Runnable runnable;
    private ImageView iv_splash_img;
    private Animation from_top;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);



        runnable = new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                finish();
            }
        };

        handler = new Handler();
        handler.postDelayed(runnable, 4000);

        iv_splash_img = findViewById(R.id.iv_splash_img);
        from_top = AnimationUtils.loadAnimation(this, R.anim.fromtop);
        //iv_splash_img.setAnimation(from_top);
        iv_splash_img.startAnimation(from_top);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        if(handler != null && runnable != null)
            handler.removeCallbacks(runnable);
    }
}
