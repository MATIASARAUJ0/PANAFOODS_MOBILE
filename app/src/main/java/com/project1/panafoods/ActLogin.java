package com.project1.panafoods;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ActLogin extends AppCompatActivity {

    EditText edtDni,edtPassword;
    TextView txtIngresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lyt_login);
        asignarReferencias();
    }

    private void asignarReferencias() {
        edtDni=findViewById(R.id.edtDni);
        edtPassword=findViewById(R.id.edtPassword);
        txtIngresar=findViewById(R.id.txtIngresarAdmin);
        txtIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ActLogin.this,ActLoginAdmin.class);
                startActivity(intent);

                Toast.makeText(ActLogin.this, "Vista Administrador", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void ingresar(View view) {
        String dni;
        String password = "";

        dni = edtDni.getText().toString();
        password = edtPassword.getText().toString();

        if(dni.equals("") && password.equals("")){
            Toast.makeText(this, "Error: Campos Vacíos", Toast.LENGTH_SHORT).show();
        } else if (dni.equals("75382537") && password.equals("panafoods3")) {
            Intent intent = new Intent(this, ActInicio.class);
            startActivity(intent);
        } else if (dni.equals("74965516") && password.equals("panafoods3")) {
            Intent intent = new Intent(this, ActInicio.class);
            startActivity(intent);
        } else if (dni.equals("74904765") && password.equals("panafoods3")) {
            Intent intent = new Intent(this, ActInicio.class);
            startActivity(intent);
        } else if (dni.equals("73012517") && password.equals("panafoods3")) {
            Intent intent = new Intent(this, ActInicio.class);
            startActivity(intent);
        } else {
            Toast.makeText(this, "Usuario no válido", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if(keyCode==event.KEYCODE_BACK){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("¿Desea salir de PanaFoods?").setPositiveButton("Sí", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int i) {
                    Intent intent = new Intent(Intent.ACTION_MAIN);
                    intent.addCategory(Intent.CATEGORY_HOME);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);//aviso,pop up simple
                    startActivity(intent);
                }
            }).setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int i) {
                    dialog.dismiss();
                }
            });
            builder.show();
        }

        return super.onKeyDown(keyCode, event);
    }
}