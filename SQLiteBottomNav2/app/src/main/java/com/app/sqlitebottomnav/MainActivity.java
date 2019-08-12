package com.app.sqlitebottomnav;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.app.sqlitebottomnav.fragments.DeleteFragment;
import com.app.sqlitebottomnav.fragments.EditFragment;
import com.app.sqlitebottomnav.fragments.RegisterFragment;
import com.app.sqlitebottomnav.fragments.SearchFragment;
import com.app.sqlitebottomnav.helpers.ConnectionSQLiteHelper;
import com.app.sqlitebottomnav.utility.Utility;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(navListener);
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container, new RegisterFragment())
                .commit();
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                    Fragment selectedFragment = null;
                    switch (menuItem.getItemId()) {
                        case R.id.nav_register:
                            selectedFragment = new RegisterFragment();
                            break;
                        case R.id.nav_search:
                            selectedFragment = new SearchFragment();
                            break;
                        case R.id.nav_modify:
                            selectedFragment = new EditFragment();
                            break;
                        case R.id.nav_remove:
                            selectedFragment = new DeleteFragment();
                            break;
                    }

                    getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.fragment_container, selectedFragment)
                            .commit();
                    return true;
                }
            };

}
