package com.gmail.farasabiyyu12.barcelona;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sejarah(View view) {
        startActivity(new Intent(MainActivity.this, Main2Activity.class)
        .putExtra("key", "sejarah"));
    }

    public void manajemen(View view) {
        startActivity(new Intent(MainActivity.this, Main2Activity.class)
                .putExtra("key", "manajemen"));
    }

    public void prestasi(View view){
        startActivity(new Intent(MainActivity.this, Main2Activity.class)
                .putExtra("key", "prestasi"));
    }

    public void sponsor(View view){
        startActivity(new Intent(MainActivity.this, Main2Activity.class)
                .putExtra("key", "sponsor"));
    }
}
