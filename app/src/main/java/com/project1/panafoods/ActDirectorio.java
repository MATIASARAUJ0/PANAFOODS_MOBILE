package com.project1.panafoods;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import Entities.Colaborador;
import Entities.Encargado;

public class ActDirectorio extends AppCompatActivity implements IColaborador, IEncargado {

    FragmentListaColaborador fragmentListaColaborador;
    FragmentDetalleColaborador fragmentDetalleColaborador;
    FragmentListaEncargado fragmentListaEncargado;
    FragmentDetalleEncargado fragmentDetalleEncargado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lyt_directorio);
        asignarReferencias();
    }

    private void asignarReferencias() {
        fragmentListaColaborador =(FragmentListaColaborador) getSupportFragmentManager().findFragmentById(R.id.fgtLista);
        fragmentDetalleColaborador =(FragmentDetalleColaborador) getSupportFragmentManager().findFragmentById(R.id.fgtDetalle);
        fragmentListaEncargado =(FragmentListaEncargado) getSupportFragmentManager().findFragmentById(R.id.fgtListaEncargado);
        fragmentDetalleEncargado =(FragmentDetalleEncargado) getSupportFragmentManager().findFragmentById(R.id.fgtDetalleEncargado);
    }

    @Override
    public void seleccionarColaborador(Colaborador c){
        fragmentDetalleColaborador.mostrarDatos(c);
    }

    @Override
    public void seleccionarEncargado(Encargado e){
        fragmentDetalleEncargado.mostrarDatos(e);
    }
}