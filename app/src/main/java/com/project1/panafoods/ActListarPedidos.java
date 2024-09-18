package com.project1.panafoods;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

import Adaptadores.AdaptadorPedidos;
import Entities.Pedido;

public class ActListarPedidos extends AppCompatActivity {

    ArrayList<Pedido> listaPedidos;
    ListView lstListaPed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lyt_listar_pedidos);
        asignarReferencia();
        recuperarData();
        listarPedidos();
    }

    private void listarPedidos() {
        AdaptadorPedidos adaptador = new AdaptadorPedidos(this,listaPedidos);
        lstListaPed.setAdapter(adaptador);
    }

    private void recuperarData() {
        Bundle bundle=getIntent().getExtras();
        if(bundle==null){
            Toast.makeText(this, "Falta registrar datos", Toast.LENGTH_LONG).show();
        }else{
            listaPedidos=(ArrayList<Pedido>)bundle.getSerializable("data");
        }
    }

    private void asignarReferencia() {
        lstListaPed=findViewById(R.id.lstPed);
    }

    public void regresarPP(View view){
        Intent intent=new Intent(this, ActPedidos.class);
        Bundle bundle=new Bundle();
        bundle.putSerializable("data",listaPedidos);
        intent.putExtras(bundle);
        startActivity(intent);
    }

}
