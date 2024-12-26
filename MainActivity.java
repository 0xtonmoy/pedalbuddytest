package com.example.pedalbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button userlogin, adminlogin, contact_us;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userlogin = findViewById(R.id.userlogin);
        adminlogin = findViewById(R.id.adminlogin);
        contact_us = findViewById(R.id.contact);
        userlogin.setText("User Login (Hourly)");
        adminlogin.setText("Admin Login (Hourly)");
        gotoUserLogin();
        gotoAdminLogin();
        gotoContact();
    }

    private void gotoUserLogin() {
        userlogin.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(MainActivity.this, UserLogin.class);
                        startActivity(i);
                    }
                });
    }

    private void gotoAdminLogin() {
        adminlogin.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(MainActivity.this, AdminLogin.class);
                        startActivity(i);
                    }
                });
    }

    private void gotoContact() {
        contact_us.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(MainActivity.this, Contact.class);
                        startActivity(i);
                    }
                });
    }
}
