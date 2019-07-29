package com.app.sharepreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText txt_email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_email = findViewById(R.id.txt_email);

        SharedPreferences preferences = getSharedPreferences("datos", Context.MODE_PRIVATE);
        txt_email.setText(preferences.getString("mail", ""));
    }

    public void Save(View v) {
        SharedPreferences preferences = getSharedPreferences("datos", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("mail", txt_email.getText().toString());
        editor.commit();
    }
}
