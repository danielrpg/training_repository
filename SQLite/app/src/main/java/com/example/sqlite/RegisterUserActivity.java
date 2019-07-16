package com.example.sqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.sqlite.helpers.ConnectionSQLiteHelper;
import com.example.sqlite.utilities.Utility;

public class RegisterUserActivity extends AppCompatActivity {

    private EditText user_id, user_name, user_telephone;
    private Button btn_register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_user);

        user_id = findViewById(R.id.et_user_id);
        user_name = findViewById(R.id.et_user_name);
        user_telephone = findViewById(R.id.et_user_telephone);
        btn_register = findViewById(R.id.btn_register_user);
    }

    public void clickRegisterUser(View view) {
        ConnectionSQLiteHelper conn = new ConnectionSQLiteHelper(this, "db_users", null, 1);

        SQLiteDatabase db = conn.getWritableDatabase(); // open database for write table

        ContentValues values = new ContentValues();
        values.put(Utility.FIELD_ID, user_id.getText().toString());
        values.put(Utility.FIELD_NAME, user_name.getText().toString());
        values.put(Utility.FIELD_TELEPHONE, user_telephone.getText().toString());

        Long id_result = db.insert(Utility.TABLE_USER, Utility.FIELD_ID, values);
        Toast.makeText(this, "id new user register:" + id_result, Toast.LENGTH_SHORT).show();
    }
}
