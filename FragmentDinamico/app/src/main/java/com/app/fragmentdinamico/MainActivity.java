package com.app.fragmentdinamico;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements
                                 FragmentRed.OnFragmentInteractionListener,
                                 FragmentBlue.OnFragmentInteractionListener,
                                 FragmentGreen.OnFragmentInteractionListener {

    FragmentRed fragmentRed;
    FragmentGreen fragmentGreen;
    FragmentBlue fragmentBlue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentRed = new FragmentRed();
        fragmentBlue = new FragmentBlue();
        fragmentGreen = new FragmentGreen();

        // We are adding here fragment red as a default fragment
        getSupportFragmentManager().beginTransaction().add(R.id.FragmentContainer, fragmentRed).commit();
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    public void onClickRed(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.FragmentContainer, fragmentRed);
        fragmentTransaction.commit();
    }

    public void onClickGreen(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.FragmentContainer, fragmentGreen);
        fragmentTransaction.commit();
    }

    public void onClickBlue(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.FragmentContainer, fragmentBlue);
        fragmentTransaction.commit();
    }
}
