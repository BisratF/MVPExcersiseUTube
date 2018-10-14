package com.example.justuser.mvpexcersiseutube;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements MainContractInterface.MVPView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void showSignInScreen() {

    }

    @Override
    public void showSignUpScreen() {

    }
}
