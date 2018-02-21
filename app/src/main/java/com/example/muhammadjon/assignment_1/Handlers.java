package com.example.muhammadjon.assignment_1;

import android.content.Context;



//Created by Muhammadjon on 21.02.2018.

public class Handlers {
    private Context context;

    Handlers(Context context){
        this.context = context;
    }

    public void onButtonClick(String email, String password){
        if (Common.isValidEmail(email) && Common.isValidPassword(password)) {
            Common.showPopup(context, "SUCCEED!", email);
        } else {
            Common.showPopup(context, "FAILED!", email);
        }
    }
}
