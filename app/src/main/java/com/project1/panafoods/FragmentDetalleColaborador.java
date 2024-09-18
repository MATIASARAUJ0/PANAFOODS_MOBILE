package com.project1.panafoods;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import Entities.Colaborador;

public class FragmentDetalleColaborador extends Fragment {

    TextView txtNom, txtCel, txtCor, txtPro;
    ImageView imgFoto;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.detalle_colaborador, container, false);
        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        txtNom=getView().findViewById(R.id.txtNom);
        txtCel=getView().findViewById(R.id.txtCel);
        txtCor=getView().findViewById(R.id.txtCor);
        txtPro=getView().findViewById(R.id.txtPro);
        imgFoto=getView().findViewById(R.id.imgFoto);
    }

    public void mostrarDatos(Colaborador c) {
        txtNom.setText(c.getNom());
        txtCel.setText(c.getCel());
        txtCor.setText(c.getCor());
        txtPro.setText(c.getPro());
        imgFoto.setImageResource(c.getImgId());
    }
}