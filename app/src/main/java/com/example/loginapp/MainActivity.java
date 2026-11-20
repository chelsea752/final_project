package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText etUsername;
    private EditText etPassword;
    private Button btnLogin;

    // اطلاعات معتبر لاگین طبق خواسته کاربر
    private final String VALID_USERNAME = "mikibnsd";
    private final String VALID_PASSWORD = "2191752";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // اتصال المان‌های صفحه به متغیرها
        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);
        btnLogin = findViewById(R.id.btnLogin);

        // رویداد کلیک دکمه ورود
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputUsername = etUsername.getText().toString().trim();
                String inputPassword = etPassword.getText().toString().trim();

                // بررسی صحت نام کاربری و پسوورد
                if (inputUsername.equals(VALID_USERNAME) && inputPassword.equals(VALID_PASSWORD)) {
                    // انتقال به اکتیویتی دوم و ارسال نام کاربری
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    intent.putExtra("EXTRA_USERNAME", inputUsername);
                    startActivity(intent);
                } else {
                    // نمایش پیام خطا در صورت اشتباه بودن اطلاعات
                    Toast.makeText(MainActivity.this, "نام یا رمز عبور اشتباه است", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
