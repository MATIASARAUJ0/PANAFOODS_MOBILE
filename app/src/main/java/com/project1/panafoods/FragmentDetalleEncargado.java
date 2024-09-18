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

import Entities.Encargado;

public class FragmentDetalleEncargado extends Fragment {


    TextView txtNomEnc, txtCorEnc, txtEdadEnc, txtOcEnc;
    ImageView imgFotoEnc;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.detalle_encargado, container, false);
        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        txtNomEnc=getView().findViewById(R.id.txtNomEnc);
        txtCorEnc=getView().findViewById(R.id.txtCorEnc);
        txtEdadEnc=getView().findViewById(R.id.txtEdadEnc);
        txtOcEnc=getView().findViewById(R.id.txtOcEnc);
        imgFotoEnc=getView().findViewById(R.id.imgFotoEnc);
    }

    public void mostrarDatos(Encargado e) {
        txtNomEnc.setText(e.getNomEnc());
        txtCorEnc.setText(e.getCorEnc());
        txtEdadEnc.setText(e.getEdEnc());
        txtOcEnc.setText(e.getEnc());
        imgFotoEnc.setImageResource(e.getImgIdEnc());
    }
}
