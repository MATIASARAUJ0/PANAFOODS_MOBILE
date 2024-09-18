package com.project1.panafoods;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

import Entities.Pedido;

public class ActRegistrarPedidos extends AppCompatActivity {
    ArrayList<Pedido> listaPedidos;
    EditText edtCli, edtRuc, edtCant, edtFecEnt, edtLugEnt, edtHorEnt;
    Spinner sprProd;

    String productos[]={"Harina de pescado (Sacos)","Aceite de pescado (Galones)","Mariscos (Kilogramos)","Pez Bonito (Kilogramos)"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lyt_registrar_pedidos);
        asignarReferencia();
        recuperarData();
    }

    private void asignarReferencia() {
        edtCli=findViewById(R.id.edtCli);
        edtRuc=findViewById(R.id.edtRuc);
        edtCant=findViewById(R.id.edtCant);
        edtFecEnt=findViewById(R.id.edtFecEnt);
        edtLugEnt=findViewById(R.id.edtLugEnt);
        edtHorEnt=findViewById(R.id.edtHorEnt);
        sprProd=findViewById(R.id.sprProd);
        ArrayAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,productos);
        sprProd.setAdapter(adapter);
    }

    private void recuperarData() {
        Bundle bundle = getIntent().getExtras();
        if (bundle == null) {
            listaPedidos = new ArrayList<>();
        } else {
            listaPedidos = (ArrayList<Pedido>) bundle.getSerializable("data");
        }
    }

    public void registrar(View view){

        String cli, prod, fecEnt, lugEnt, horEnt, ruc, cant;
        int idFoto=0;
        cli="Cliente: "+edtCli.getText().toString();
        if(edtRuc.getText().toString().length()==11) {
            ruc = "RUC: " + edtRuc.getText().toString();
        }else{
            ruc ="";
        }
        prod="Producto: "+sprProd.getSelectedItem().toString();
        cant="Cantidad: "+edtCant.getText().toString();
        fecEnt="Fecha de entrega: "+edtFecEnt.getText().toString();
        lugEnt="Lugar de entrega: "+edtLugEnt.getText().toString();
        horEnt="Hora de entrega: "+edtHorEnt.getText().toString();
        switch (prod){
            case "Producto: Harina de pescado (Sacos)": idFoto=R.drawable.harinapescado; break;
            case "Producto: Aceite de pescado (Galones)": idFoto=R.drawable.aceitepescado; break;
            case "Producto: Mariscos (Kilogramos)": idFoto=R.drawable.mariscos; break;
            case "Producto: Pez Bonito (Kilogramos)": idFoto=R.drawable.pezbonito;
        }
        if (ruc.length()==16) {
            listaPedidos.add(new Pedido(idFoto, cli, prod, fecEnt, lugEnt, horEnt, ruc, cant));
            limpiar();
        }else{
            Toast.makeText(this, "Colocar Datos Validos", Toast.LENGTH_SHORT).show();
        }
    }

    private void limpiar(){
        edtCli.setText("");
        edtRuc.setText("");
        sprProd.setSelection(0);
        edtCant.setText("");
        edtFecEnt.setText("");
        edtLugEnt.setText("");
        edtHorEnt.setText("");
    }

    public void regresarPrincipal(View view){
        Intent intent=new Intent(this, ActPedidos.class);
        Bundle bundle=new Bundle();
        bundle.putSerializable("data",listaPedidos);
        intent.putExtras(bundle);
        startActivity(intent);
    }

}
