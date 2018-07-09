package com.gmail.farasabiyyu12.barcelona;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView judul, isi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String key = getIntent().getStringExtra("key");

        judul = findViewById(R.id.judul);
        isi = findViewById(R.id.isi);

        if (key.equals("sejarah")){
            judul.setText("Sejarah Barcelona");
            isi.setText(R.string.sejarah);
        }else if (key.equals("manajemen")){
            judul.setText("Manajemen");
            isi.setText(R.string.manajemen);
        } else if (key.equals("prestasi")){
            judul.setText("Prestasi Barcelona");
            isi.setText(R.string.prestasi);
        } else if (key.equals("sponsor")){
            judul.setText("Sponsor Barcelona");
            isi.setText(R.string.sponsor);
        }
    }
}
