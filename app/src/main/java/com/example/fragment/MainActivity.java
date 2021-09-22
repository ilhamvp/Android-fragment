package com.example.fragment;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentAtas fragment_atas = new FragmentAtas();
        FragmentBawah fragment_bawah = new FragmentBawah();

        getSupportFragmentManager().beginTransaction().add(R.id.fragment_atas, fragment_atas, "Atas").commit();
        getSupportFragmentManager().beginTransaction().add(R.id.fragment_bawah, fragment_bawah, "Bawah").commit();
    }
}
