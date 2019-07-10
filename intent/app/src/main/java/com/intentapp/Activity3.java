package com.intentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Activity3 extends AppCompatActivity implements View.OnClickListener {

    private EditText etSurname;
    private Button btnSubmit;
    private Button btnCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        etSurname = findViewById(R.id.etSurname);
        btnSubmit = findViewById(R.id.btnSubmit);
        btnCancel = findViewById(R.id.btnCancel);

        btnSubmit.setOnClickListener(this);
        btnCancel.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.btnSubmit:
                if(etSurname.getText().toString().isEmpty())
                {
                    Toast.makeText(Activity3.this, "Please enter all fields", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    String surname = etSurname.getText().toString().trim();
                    Intent intent = new Intent();
                    intent.putExtra("surname", surname);
                    setResult(RESULT_OK, intent);
                    finish();
                }
                break;
            case R.id.btnCancel:
                setResult(RESULT_CANCELED);
                finish();
                break;
            default:
                Toast.makeText(Activity3.this, "Please enter all fields", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
