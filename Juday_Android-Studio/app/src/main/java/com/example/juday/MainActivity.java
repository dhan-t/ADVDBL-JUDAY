package com.example.juday;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;

import com.example.juday.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        replaceFragment(new Home_Fragment());
        binding.bottomNavbar.setBackground(null);

        binding.bottomNavbar.setOnItemSelectedListener(item -> {
            int itemId = item.getItemId();
            Log.d("MenuItemSelected", "Item ID: " + itemId);

            if (itemId == R.id.customize) {
                replaceFragment(new Customize_Fragment());
            } else if (itemId == R.id.home) {
                replaceFragment(new Home_Fragment());
            } else if (itemId == R.id.stocks) {
                replaceFragment(new Stocks_Fragment());
            } else {
                return false;
            }
            return true;
        });
    }

    private void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout, fragment);
        fragmentTransaction.commit();
    }
}
