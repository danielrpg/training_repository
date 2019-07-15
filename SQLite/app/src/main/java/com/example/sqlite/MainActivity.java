package com.example.sqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.sqlite.helpers.ConnectionSQLiteHelper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConnectionSQLiteHelper conn = new ConnectionSQLiteHelper(this, "db_users", null, 1);
    }

    public void registerUser(View view) {
        Intent intent = new Intent(this, RegisterUserActivity.class);
        startActivity(intent);
    }

    public void listUsers(View view) {
        Intent intent = new Intent(this, ListUsersActivity.class);
        startActivity(intent);
    }

    public void listUsersSpinner(View view) {
        Intent intent = new Intent(this, ListUserSpinnerActivity.class);
        startActivity(intent);
    }

    public void listViewUsers(View view) {
        Intent intent = new Intent(this, ListViewUsersActivity.class);
        startActivity(intent);
    }
}
