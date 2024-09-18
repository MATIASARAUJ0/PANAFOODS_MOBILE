package com.project1.panafoods;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class ActMenuAdministrador extends AppCompatActivity {

    Button btnRegistroEmpleado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lyt_menu_administrador);
        btnRegistroEmpleado=findViewById(R.id.btnRegistroEmpleado);
    }
    public void ingresarRE(View view){
        Intent intent=new Intent(this, ActEmpleados.class);
        startActivity(intent);
    }
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_administrador,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.cerrarSesion:
                Intent intent=new Intent(this, ActLogin.class);
                startActivity(intent);
                Toast.makeText(this, "Sesión Cerrada", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
