package com.example.javaapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LuasActivity extends AppCompatActivity {
    TextView tvHasil;
    EditText etPanjang,etLebar;
    Button btnHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas);

        tvHasil = findViewById(R.id.tv_luas);
        etPanjang = findViewById(R.id.edt_panjang);
        etLebar = findViewById(R.id.edt_lebar);
        btnHasil = findViewById(R.id.btn_hitung);

        btnHasil.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String panjang = etPanjang.getText().toString().trim();
                String lebar = etLebar.getText().toString().trim();

                double p = Double.parseDouble(panjang);
                double l = Double.parseDouble(lebar);

                double luas = p * l;

                tvHasil.setText("Luas : "+ luas);
            }
        }));
    }
}