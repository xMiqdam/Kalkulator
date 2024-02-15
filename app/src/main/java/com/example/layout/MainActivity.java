package com.example.layout;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtUser;
    EditText txtPassword;
    Button btnLogin;
    Button btnRegister;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtUser = findViewById(R.id.txtUser);
        txtPassword = findViewById(R.id.txtPassword);
        btnLogin = findViewById(R.id.btnLogin);
        btnRegister = findViewById(R.id.btnRegister);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login();
//
            }
        });

    }
    public void login(){
        String nama = txtUser.getText().toString();
        String pw = txtPassword.getText().toString();

        if (nama.equals("miqdam") && pw.equals("17")){
            Intent pindah = new Intent(MainActivity.this, kalkulator.class);
            startActivity(pindah);
        }
        else {
            Toast.makeText(this, "Login Gagal", Toast.LENGTH_SHORT).show();
            txtUser.setText("");
            txtPassword.setText("");
        }

    }



}