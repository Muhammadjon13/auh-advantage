package com.example.muhammadjon.assignment_1;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.muhammadjon.assignment_1.databinding.ActivityDataBindingSignInBinding;

public class DataBindingSignInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityDataBindingSignInBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_data_binding_sign_in);
        User user = new User();
        binding.setUser(user);
        Handlers handlers = new Handlers(this);
        binding.setHandlers(handlers);

    }
}
