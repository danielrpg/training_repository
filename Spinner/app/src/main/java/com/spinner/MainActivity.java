package com.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner;
    private EditText et_value1, et_value2;
    private TextView tv_result;
    private Button bt_calc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_value1 = findViewById(R.id.et_value1);
        et_value2 = findViewById(R.id.et_value2);

        tv_result = findViewById(R.id.tv_result);
        spinner = findViewById(R.id.spinner);
        bt_calc = findViewById(R.id.button);

        String [] opciones = { "sum", "minus", "multiply", "divided by" };

        ArrayAdapter <String> adapter =  new ArrayAdapter<String>(this, R.layout.spinner_item_operation, opciones);
        spinner.setAdapter(adapter);

    }

    //Calc method event
    public void calculate(View view) {
        String value1 = et_value1.getText().toString();
        String value2 = et_value2.getText().toString();

        int val1 = Integer.parseInt(value1);
        int val2 = Integer.parseInt(value2);

        String selection = spinner.getSelectedItem().toString();
        if(selection.equals("sum")){
            int sum = val1 + val2;
            String result = String.valueOf(sum);
            tv_result.setText(result);
        } else  if(selection.equals("minus")){
            int minus = val1 - val2;
            String result = String.valueOf(minus);
            tv_result.setText(result);
        } else if(selection.equals("multiply")){
            int mult = val1 * val2;
            String result = String.valueOf(mult);
            tv_result.setText(result);
        } else if(selection.equals("divided by")){
            if(val2 != 0) {
                int div = val1 / val2;
                String result = String.valueOf(div);
                tv_result.setText(result);
            } else {
                Toast.makeText(this, "Cannot be able divide by 0", Toast.LENGTH_SHORT).show();
            }

        }
    }
}
