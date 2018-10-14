package com.example.justuser.mvpexcersiseutube.module;

import android.view.View;

public class MainPresenter implements MainContractInterface.Presenter{

    private MainContractInterface.MVPView mvpView;


    MainPresenter(MainContractInterface.MVPView view) {
        this.mvpView = view;

    }

    @Override
    public void handleSignInBtnClick() {
        mvpView.showSignInScreen();
    }

    @Override
    public void handleSingnUpBtnClick() {
        mvpView.showSignUpScreen();
    }
}
