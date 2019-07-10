package com.example.implicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnCall, btnCallFriend, btnOpenWeb, btnOpenMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCall = findViewById(R.id.btnCall);
        btnCallFriend = findViewById(R.id.btnCallFriend);
        btnOpenWeb = findViewById(R.id.btnOpenWeb);
        btnOpenMap = findViewById(R.id.btnMap);

        btnCall.setOnClickListener(this);
        btnCallFriend.setOnClickListener(this);
        btnOpenWeb.setOnClickListener(this);
        btnOpenMap.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.btnCall:
                Intent intentCall = new Intent(Intent.ACTION_DIAL);
                startActivity(intentCall);
                break;
            case R.id.btnCallFriend:
                Intent intentCallFriend = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:76462475"));
                startActivity(intentCallFriend);
                break;
            case R.id.btnOpenWeb:
                Intent intentWeb = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.backendless.com"));
                startActivity(intentWeb);
                break;
            case R.id.btnMap:
                Intent intentMap = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=Plaza colon, Bolivia"));
                startActivity(intentMap);
                break;
            default:
                Toast.makeText(this, "Please select a option!", Toast.LENGTH_SHORT).show();

        }
    }
}
