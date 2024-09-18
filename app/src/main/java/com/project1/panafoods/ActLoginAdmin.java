package com.project1.panafoods;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ActLoginAdmin extends AppCompatActivity {
    EditText edtDni, edtCorreo, edtPassword;
    Button btnCerrarSesion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lyt_login_admin);
        asignarReferencias();
    }

    private void asignarReferencias() {
        edtDni = findViewById(R.id.edtDni);
        edtPassword = findViewById(R.id.edtPassword);
    }

    public void ingresar(View view) {
        String dni;
        String password = "";

        dni = edtDni.getText().toString();
        password = edtPassword.getText().toString();
        if (dni.equals("") && password.equals("")) {
            Toast.makeText(this, "Error: Campos Vacíos", Toast.LENGTH_SHORT).show();
        } else if (dni.equals("75382537") && password.equals("panafoods3")) {
            Intent intent = new Intent(this, ActMenuAdministrador.class);
            startActivity(intent);
        } else if (dni.equals("74965516") && password.equals("panafoods3")) {
            Intent intent = new Intent(this, ActMenuAdministrador.class);
            startActivity(intent);
        } else if (dni.equals("74904765") && password.equals("panafoods3")) {
            Intent intent = new Intent(this, ActMenuAdministrador.class);
            startActivity(intent);
        } else if (dni.equals("73012517") && password.equals("panafoods3")) {
            Intent intent = new Intent(this, ActMenuAdministrador.class);
            startActivity(intent);
        } else {
            Toast.makeText(this, "Usuario no válido", Toast.LENGTH_SHORT).show();
        }

    }

}

