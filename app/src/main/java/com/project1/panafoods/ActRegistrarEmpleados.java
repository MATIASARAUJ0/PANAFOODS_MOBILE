package com.project1.panafoods;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

import Entities.Empleado;

public class ActRegistrarEmpleados extends AppCompatActivity {

    ArrayList<Empleado> listaEmpleados;
    EditText edtNom, edtApe, edtDni, edtMail, edtFecNac, edtCel, edtCont;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lyt_registrar_empleado);
        asignarReferencia();
        recuperarData();
    }

    private void asignarReferencia() {
        edtNom=findViewById(R.id.edtDni);
        edtApe=findViewById(R.id.edtPassword);
        edtDni=findViewById(R.id.edtDniEmp);
        edtMail=findViewById(R.id.edtCorEmp);
        edtFecNac=findViewById(R.id.edtFecNacEmp);
        edtCel=findViewById(R.id.edtCelEmp);
        edtCont=findViewById(R.id.edtConEmp);
    }

    private void recuperarData() {
        Bundle bundle = getIntent().getExtras();
        if (bundle == null) {
            listaEmpleados = new ArrayList<>();
        } else {
            listaEmpleados= (ArrayList<Empleado>) bundle.getSerializable("data2");
        }
    }

    public void registrar(View view){
        String nom, ape, dni, mail, fecNac, cel, cont;
        int idFoto=0;
        nom=edtNom.getText().toString();
        ape=edtApe.getText().toString();
        dni=edtDni.getText().toString();
        mail=edtMail.getText().toString();
        fecNac=edtFecNac.getText().toString();
        cel=edtCel.getText().toString();
        cont=edtCont.getText().toString();
        switch (dni){
            case "74965516": idFoto=R.drawable.matias; break;
            case "74904765": idFoto=R.drawable.eduardo; break;
            case "73012517": idFoto=R.drawable.nadin; break;
            case "75382537": idFoto=R.drawable.jorge; break;
        }
        if(dni.length()==8 && nom!=null && ape!=null && mail!=null && fecNac!=null && cel!=null && cont!=null) {
            listaEmpleados.add(new Empleado(idFoto, nom, ape, dni, mail, fecNac, cel, cont));
            limpiar();
        }else{
            Toast.makeText(this, "Coloque datos válidos", Toast.LENGTH_SHORT).show();
        }
    }

    private void limpiar(){
        edtNom.setText("");
        edtApe.setText("");
        edtDni.setText("");
        edtMail.setText("");
        edtFecNac.setText("");
        edtCel.setText("");
        edtCont.setText("");
    }

    public void regresarPrincipal(View view){
        Intent intent=new Intent(this, ActEmpleados.class);
        Bundle bundle=new Bundle();
        bundle.putSerializable("data2",listaEmpleados);
        intent.putExtras(bundle);
        startActivity(intent);
    }

}
