package com.example.justuser.mvpexcersiseutube.module;

import android.view.View;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;

public class MainPresenterTest {

    @Mock
    MainContractInterface.MVPView mvpView;

    private MainPresenter mainPresenter;


    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);

        mainPresenter = new MainPresenter(mvpView);


    }

    @Test
    public void handleSignInBtnClick() throws Exception {
        mainPresenter.handleSignInBtnClick();

        verify(mvpView).showSignInScreen();


    }

    @Test
    public void handleSingnUpBtnClick() throws Exception {
        mainPresenter.handleSingnUpBtnClick();

        verify(mvpView).showSignUpScreen();

    }
}