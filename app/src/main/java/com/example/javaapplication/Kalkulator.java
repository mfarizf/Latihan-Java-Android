package com.example.javaapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Kalkulator extends AppCompatActivity implements View.OnClickListener {
    EditText vTxtA,vTxtB,vTxtC;
    protected float yTxtA,yTxtB,yTxtC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);

        vTxtA = findViewById(R.id.txtA);
        vTxtB = findViewById(R.id.txtB);
        vTxtC = findViewById(R.id.txtC);

        Button vBtnTambah = findViewById(R.id.btn_tambah);
        Button vBtnKurang = findViewById(R.id.btn_kurang);
        Button vBtnKali = findViewById(R.id.btn_kali);
        Button vBtnBagi = findViewById(R.id.btn_bagi);

        vBtnTambah.setOnClickListener(this);
        vBtnKurang.setOnClickListener(this);
        vBtnKali.setOnClickListener(this);
        vBtnBagi.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        yTxtA = Float.parseFloat(vTxtA.getText().toString());
        yTxtB = Float.parseFloat(vTxtB.getText().toString());

        switch (v.getId()){
            case R.id.btn_tambah:
                yTxtC = yTxtA + yTxtB;
                vTxtC.setText(Float.toString(yTxtC));
                break;
            case R.id.btn_kurang:
                yTxtC = yTxtA - yTxtB;
                vTxtC.setText(Float.toString(yTxtC));
                break;
            case R.id.btn_kali:
                yTxtC = yTxtA * yTxtB;
                vTxtC.setText(Float.toString(yTxtC));
                break;
            case R.id.btn_bagi:
                yTxtC = yTxtA / yTxtB;
                vTxtC.setText(Float.toString(yTxtC));
                break;
        }
    }
}
