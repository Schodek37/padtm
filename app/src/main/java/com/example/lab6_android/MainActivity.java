package com.example.lab6_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    public void gameList(View v)
    {
        Intent intencja = new Intent(getApplicationContext(), GamesList.class);
        intencja.putExtra("gra", v.getId());
        startActivity(intencja);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }






}
