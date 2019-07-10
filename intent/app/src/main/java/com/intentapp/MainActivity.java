package com.intentapp;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText etName;
    private Button btnAct2, btnAct3;
    private TextView tvResults;

    private final static int ACTIVITY3 = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = findViewById(R.id.etName);
        btnAct2 = findViewById(R.id.btnAct2);
        btnAct3 = findViewById(R.id.btnAct3);

        btnAct2.setOnClickListener(this);
        btnAct3.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
       switch (view.getId()) {
           case R.id.btnAct2:
               if(etName.getText().toString().isEmpty())
               {
                   Toast.makeText(MainActivity.this, R.string.textMessageError, Toast.LENGTH_SHORT).show();
               }
               else
               {
                   String name = etName.getText().toString().trim();
                   Intent intent = new Intent(MainActivity.this,
                           com.intentapp.Activity2.class);
                   intent.putExtra("name", name);
                   startActivity(intent);
               }
               break;
           case R.id.btnAct3:
               Intent intent = new Intent(MainActivity.this, com.intentapp.Activity3.class);
               startActivityForResult(intent, ACTIVITY3);
               break;
           default:
               Toast.makeText(MainActivity.this, R.string.textMessageError, Toast.LENGTH_SHORT).show();
               break;
       }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == ACTIVITY3)
        {
            if(resultCode == RESULT_OK)
            {
                tvResults.setText(data.getStringExtra("surname"));
            }
            if(resultCode == RESULT_CANCELED)
            {
                tvResults.setText("No data received!");
            }
        }
    }
}
