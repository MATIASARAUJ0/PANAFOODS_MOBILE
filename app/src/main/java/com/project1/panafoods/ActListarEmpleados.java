package com.project1.panafoods;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

import Adaptadores.AdaptadorEmpleados;
import Entities.Empleado;

public class ActListarEmpleados extends AppCompatActivity {

    ArrayList<Empleado> listaEmpleados;
    ListView lstListaEmp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lyt_listar_empleados);
        asignarReferencia();
        recuperarData();
        listarEmpleados();
    }

    private void listarEmpleados() {
        AdaptadorEmpleados adaptador = new AdaptadorEmpleados(this,listaEmpleados);
        lstListaEmp.setAdapter(adaptador);
    }

    private void recuperarData() {
        Bundle bundle=getIntent().getExtras();
        if(bundle==null){
            Toast.makeText(this, "Falta registrar datos", Toast.LENGTH_LONG).show();
        }else{
            listaEmpleados=(ArrayList<Empleado>)bundle.getSerializable("data2");
        }
    }

    private void asignarReferencia() {
        lstListaEmp=findViewById(R.id.lstEmp);
    }

    public void regresarEE(View view){
        Intent intent=new Intent(this, ActEmpleados.class);
        Bundle bundle=new Bundle();
        bundle.putSerializable("data2",listaEmpleados);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
