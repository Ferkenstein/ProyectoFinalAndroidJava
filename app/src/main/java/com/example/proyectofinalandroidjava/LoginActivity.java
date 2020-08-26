package com.example.proyectofinalandroidjava;

import android.content.Intent;
import android.os.Bundle;

import com.example.proyectofinalandroidjava.databinding.ActivityLoginBinding;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    // Inicialización de las variables
    private ActivityLoginBinding mBinding;
    private int cont = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mBinding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());

        mBinding.btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkEmpty();
                checkPass();
            }
        });

    }

    public void checkEmpty() { //Cambiar a True or False
        if (mBinding.emailAddress.getText().toString().isEmpty()) {
            Toast.makeText(this, "Ingrese Correo Electrónico", Toast.LENGTH_LONG).show();
        }
        if (mBinding.emailPassword.getText().toString().isEmpty()) {
            Toast.makeText(this, "Ingrese Contrasenia", Toast.LENGTH_LONG).show();
        }
    }

    public void checkPass() {
        if (mBinding.emailPassword.getText().toString().equals("123Pass") && cont < 4) {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
        } else {
            Toast.makeText(this, "Contrasenia Incorrecta", Toast.LENGTH_LONG).show();
            cont++;
        }
    }
}







