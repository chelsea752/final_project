package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView tvDisplayUsername;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvDisplayUsername = findViewById(R.id.tvDisplayUsername);

        // دریافت نام کاربری ارسال شده از اکتیویتی اول
        String username = getIntent().getStringExtra("EXTRA_USERNAME");

        // نمایش "نام کاربری: mikibnsd" در بالای صفحه
        if (username != null && !username.isEmpty()) {
            tvDisplayUsername.setText("نام کاربری: " + username);
        } else {
            tvDisplayUsername.setText("نام کاربری: mikibnsd");
        }
    }
}
