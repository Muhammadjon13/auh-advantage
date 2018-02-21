package com.example.muhammadjon.assignment_1;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

//Created by Muhammadjon on 21.02.2018.

public class User extends BaseObservable{
    private String email = "";
    private String password = "";

//    public User(String email, String password) {
//        this.email = email;
//        this.password = password;
//    }

    @Bindable
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        notifyPropertyChanged(BR.email);
    }

    @Bindable
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        notifyPropertyChanged(BR.password);
    }
}
