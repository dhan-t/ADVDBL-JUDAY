package com.example.juday;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    private ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        on.create

        binding.bottom_navbar.SetOnItemSelectedListener(item -> {
            switch (item.getItemId()) {

                case R.id.customize:
                    replaceFragment(new Customize_Fragment());
                    break;
                case R.id.home:
                    replaceFragment(new Home_Fragment());
                    break;
                case R.id.stocks:
                    replaceFragment(new Stocks_Fragment());
                    break;
            }

            return true;
        });

    }}
