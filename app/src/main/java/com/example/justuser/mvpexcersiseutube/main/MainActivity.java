package com.example.justuser.mvpexcersiseutube.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.justuser.mvpexcersiseutube.R;


/**
 * Displays the first Activity
 */

public class MainActivity extends AppCompatActivity implements MainContractInterface.MVPView {

    private MainPresenter mainPresenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainPresenter = new MainPresenter(this);

    }


    // MVP View Methods
    @Override
    public void showSignInScreen() {
        Toast.makeText(getApplicationContext(), "Showing sign in Screen", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showSignUpScreen() {
        Toast.makeText(getApplicationContext(), "Showing sign Up Screen", Toast.LENGTH_SHORT).show();
    }
}
