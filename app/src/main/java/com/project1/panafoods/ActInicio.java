package com.project1.panafoods;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActInicio extends AppCompatActivity {

    CardView registroProductos, registroEmpleado, directorio, intranet, admin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lyt_inicio);

        // Variables.
        registroProductos = (CardView) findViewById(R.id.idcard1);
        directorio = (CardView) findViewById(R.id.idcard3);
        intranet = (CardView) findViewById(R.id.idcard4);

        // Llamada de las Opciones.
        getRegistroProductos();
        getDirectorio();
        getIntranet();
    }

    private void getRegistroProductos() {
        registroProductos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(ActInicio.this, ActPedidos.class);
                startActivity(a);
            }
        });
    }

    private void getDirectorio() {
        directorio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ActInicio.this, ActDirectorio.class);
                startActivity(i);
            }
        });
    }

    private void getIntranet() {
        intranet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ActInicio.this, ActLogin.class);
                startActivity(i);
            }
        });
    }


}