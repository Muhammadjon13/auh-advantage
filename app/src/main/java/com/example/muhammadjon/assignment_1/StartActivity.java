package com.example.muhammadjon.assignment_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        ButterKnife.bind(this);

    }

    @OnClick(R.id.button_butter_knife)
    public void onSelectButterKnife(){
        Intent intent = new Intent(this, ButterKnifeSignInActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.button_data_binding)
    public void onSelectDataBinding(){
        Intent intent = new Intent(this, DataBindingSignInActivity.class);
        startActivity(intent);
    }
}
