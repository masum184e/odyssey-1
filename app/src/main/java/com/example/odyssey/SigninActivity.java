package com.example.odyssey;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.odyssey.databinding.ActivitySigninBinding;

public class SigninActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        TextView forgotpass;
        forgotpass = findViewById(R.id.forgotpass);
        forgotpass.setPaintFlags(forgotpass.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        forgotpass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SigninActivity.this, "Button CLicked", Toast.LENGTH_SHORT).show();
            }
        });
    }
}