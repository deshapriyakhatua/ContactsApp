package com.example.contacts;

import android.annotation.SuppressLint;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowInsets;
import android.widget.TextView;

import com.example.contacts.databinding.ActivityFullscreenBinding;


public class FullscreenActivity extends AppCompatActivity {


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_fullscreen);

            getSupportActionBar().hide();

            Intent intent = this.getIntent();

            TextView name = findViewById(R.id.textViewNameProfile);
            name.setText(intent.getStringExtra("name"));

            TextView country = findViewById(R.id.textViewCountryProfile);
            country.setText(intent.getStringExtra("country"));

            TextView mobile = findViewById(R.id.textViewMobileProfile);
            mobile.setText(intent.getStringExtra("mobile"));

        }

}