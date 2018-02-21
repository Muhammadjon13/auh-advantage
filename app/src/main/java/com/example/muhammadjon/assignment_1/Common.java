package com.example.muhammadjon.assignment_1;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.text.TextUtils;


//Created by Muhammadjon on 21.02.2018.

class Common {
    static boolean isValidEmail(CharSequence target) {
        return !TextUtils.isEmpty(target) && android.util.Patterns.EMAIL_ADDRESS.matcher(target).matches();
    }

    static boolean isValidPassword(String password) {
        return password.length() >= 6;
    }

    static void showPopup(Context context, String message, String email) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);

        builder.setTitle(R.string.notification)
                .setMessage(message + " \nEntered email: " + email)
                .setPositiveButton(android.R.string.ok, (DialogInterface dialog, int which) -> {})
                .show();
    }
}

