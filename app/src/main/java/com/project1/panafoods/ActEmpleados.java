package com.project1.panafoods;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

import Entities.Empleado;

public class ActEmpleados extends AppCompatActivity {

    ArrayList<Empleado> listaEmpleados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lyt_empleados);
        recuperarData();
    }

    private void recuperarData() {
        Bundle bundle = getIntent().getExtras();
        if (bundle == null) {
            listaEmpleados = new ArrayList<>();
        } else {
            listaEmpleados = (ArrayList<Empleado>) bundle.getSerializable("data2");
        }
    }

    public void registrarE(View view) {
        Intent intent = new Intent(this, ActRegistrarEmpleados.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("data2", listaEmpleados);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    public void listarE(View view) {
        Intent intent = new Intent(this, ActListarEmpleados.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("data2", listaEmpleados);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    public void regresarInicio(View view){
        Intent intent=new Intent(this, ActMenuAdministrador.class);
        Bundle bundle=new Bundle();
        bundle.putSerializable("data2",listaEmpleados);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
