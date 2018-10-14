package com.example.justuser.mvpexcersiseutube;

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
