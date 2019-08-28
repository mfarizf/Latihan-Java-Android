package com.example.javaapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textTampil;
    EditText etDepan, etBelakang;
    Button btnTampil, latLuas, latCalcu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textTampil = findViewById(R.id.tv_tampil);
        etDepan = findViewById(R.id.et_namaDepan);
        etBelakang = findViewById(R.id.et_namaBelakang);
        btnTampil = findViewById(R.id.btn_tampil);
        latLuas = findViewById(R.id.latLuas);
        latCalcu = findViewById(R.id.latCalcu);

        btnTampil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nmDepan = etDepan.getText().toString();
                String nmBelakang = etBelakang.getText().toString();
                String output = nmDepan + " " + nmBelakang;

                textTampil.setText(output);
            }
        });

        latLuas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent luasIntent = new Intent(MainActivity.this, LuasActivity.class);
                startActivity(luasIntent);
            }
        });

        latCalcu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kalkuIntent = new Intent(MainActivity.this, Kalkulator.class);
                startActivity(kalkuIntent);
            }
        });



    }
}
