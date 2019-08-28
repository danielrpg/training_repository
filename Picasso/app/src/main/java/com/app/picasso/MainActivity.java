package com.app.picasso;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView =  findViewById(R.id.image_view);

        String url = "http://www.ffm-wa.com/wp-content/uploads/2015/04/opalapple3.png";
        Picasso.with(this)
                .load(url)
                //.resize(500, 500)
               // .centerCrop()
              //  .centerInside()
               // .resizeDimen(R.dimen.image_size, R.dimen.image_size)
               // .onlyScaleDown()
                .fit()
                .centerCrop()
                .into(imageView);
    }
}
