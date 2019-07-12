package com.listview;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv_data;
    private ListView list;
    private String names [] = {"Daniel", "Valentina", "Santiago", "Alejandro"
                             , "Valeria", "Benjamin", "Gerardo", "Carlos"
                             , "David", "Sofia" };
    private String ages [] = {"18", "25", "32", "17", "24", "20", "27", "15", "19", "23"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_data = findViewById(R.id.tv_selection);
        list = findViewById(R.id.lv_list);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.list_item_lv, names);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                 tv_data.setText("The age " + list.getItemAtPosition(i) + " is "
                                 + ages[i] + " years");
            }
        });
    }
}
