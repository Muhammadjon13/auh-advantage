package com.example.muhammadjon.assignment_1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ButterKnifeSignInActivity extends AppCompatActivity {

    @BindView(R.id.image_view_background_bk)
    ImageView imageViewBackground;
    @BindView(R.id.edit_text_email)
    EditText editTextEmail;
    @BindView(R.id.edit_text_password)
    EditText editTextPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_butter_knife_sign_in);
        ButterKnife.bind(this);

        Picasso.with(this).load(R.drawable.background).fit().centerCrop().into(imageViewBackground);
    }

    @OnClick(R.id.button_sign_in)
    public void onSubmit() {
        String email = editTextEmail.getText().toString();
        String password = editTextPassword.getText().toString();
        if (Common.isValidEmail(email) && Common.isValidPassword(password)) {
            Common.showPopup(this, "Success", email);
        } else {
            Common.showPopup(this, "Failed!", email);
        }

    }
}
