package com.example.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class kalkulator extends AppCompatActivity {
EditText txtAngka1;
EditText txtAngka2;
Spinner spinnerAritmatik;

TextView tvHasil;
Button hitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);

        txtAngka1 = findViewById(R.id.etAngka1);
        txtAngka2 = findViewById(R.id.etAngka2);
        spinnerAritmatik = findViewById(R.id.spinnerAritmatik);
        tvHasil = findViewById(R.id.tvHasil);
        hitung = findViewById(R.id.btnHitung);
        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = spinnerAritmatik.getSelectedItem().toString();
                int angka1 = Integer.parseInt(txtAngka1.getText().toString());
                int angka2 = Integer.parseInt(txtAngka2.getText().toString());
                int hasil = 0;

                switch (text) {
                    case "Tambah":
                        hasil = angka1 + angka2;
                        tvHasil.setText(hasil + "");
                        break;
                    case "Kurang":
                        hasil = angka1 - angka2;
                        tvHasil.setText(hasil + "");
                        break;
                    case "Bagi":
                         double angka1Double = Double.parseDouble(txtAngka1.getText().toString());
                         double angka2Double = Double.parseDouble(txtAngka2.getText().toString());
                         Double hasilDouble = angka1Double / angka2Double;
                         tvHasil.setText(hasilDouble + "");
                        break;
                }

            }
        });


        }
    }


