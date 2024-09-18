package com.project1.panafoods;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

import Entities.Pedido;

public class ActPedidos extends AppCompatActivity {

    ArrayList<Pedido> listaPedidos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lyt_pedidos);
        recuperarData();
    }

    private void recuperarData() {
        Bundle bundle=getIntent().getExtras();
        if(bundle==null){
            listaPedidos=new ArrayList<>();
        }else{
            listaPedidos=(ArrayList<Pedido>) bundle.getSerializable("data");
        }
    }

    public void registrarP(View view){
        Intent intent=new Intent(this, ActRegistrarPedidos.class);
        Bundle bundle=new Bundle();
        bundle.putSerializable("data",listaPedidos);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    public void listarP(View view){
        Intent intent=new Intent(this, ActListarPedidos.class);
        Bundle bundle=new Bundle();
        bundle.putSerializable("data",listaPedidos);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void regresarInicio(View view){
        Intent intent=new Intent(this, ActInicio.class);
        Bundle bundle=new Bundle();
        bundle.putSerializable("data",listaPedidos);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
