package com.app.customtoasty3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import es.dmoral.toasty.Toasty;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showToast(View v) {
        switch (v.getId()) {
            case R.id.btn_error:
                Toasty.error(this, "This is an error  Toast", Toast.LENGTH_LONG).show();
                break;
            case R.id.btn_success:
                Toasty.success(this, "This is an success Toast", Toast.LENGTH_LONG).show();
                break;
            case R.id.btn_info:
                Toasty.info(this, "This is an info Toast", Toast.LENGTH_LONG).show();
                break;
            case R.id.btn_warning:
                Toasty.warning(this, "This is an warning Toast", Toast.LENGTH_LONG).show();
                break;
            case R.id.btn_normal:
                Toasty
                        .normal(this, "This is an normal Toast", Toast.LENGTH_LONG, ContextCompat.getDrawable(this, R.drawable.ic_android))
                        .show();
                break;
        }
    }
}
