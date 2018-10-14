package com.example.justuser.mvpexcersiseutube.main;


/**
 * Contract between the View {@link MainActivity } and presenter {@link MainPresenter}
 */


public interface MainContractInterface {

     interface  MVPView {
         void  showSignInScreen();

         void showSignUpScreen();
     }
     interface  Presenter {
          void handleSignInBtnClick();
          void handleSingnUpBtnClick();

     }

}
