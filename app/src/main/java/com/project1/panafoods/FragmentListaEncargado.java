package com.project1.panafoods;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

import Entities.Encargado;

public class FragmentListaEncargado extends Fragment {

    ArrayList<Encargado> listaEncargado;
    ListView lstEnc;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.lista_encargado, null);
        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        lstEnc=getView().findViewById(R.id.lstEnc);
        listaEncargado=new ArrayList<>();

        listaEncargado.add(new Encargado(1,R.drawable.logojorge,"Jorge Ramirez","jorgera123@gmail.com",
                "18","Ing. de Sistemas"));
        listaEncargado.add(new Encargado(2,R.drawable.logosebas,"Sebastian Angulo","sebas12@gmail.com",
                "18","Ing. de Sistemas"));
        listaEncargado.add(new Encargado(3,R.drawable.logomatias,"Matias Araujo","mati123@gmail.com",
                "18","Ing. de Sistemas"));
        listaEncargado.add(new Encargado(4,R.drawable.logoeduardo,"Eduardo Ortiz","eduortiz@gmail.com",
                "18","Ing. de Sistemas"));
        listaEncargado.add(new Encargado(5,R.drawable.logonadin,"Nadin Asin","nadin01@gmail.com",
                "18","Ing. de Sistemas"));

        ArrayList<String> nombres=new ArrayList<>();
        for (Encargado e:listaEncargado){
            nombres.add(e.getNomEnc());
        }

        ArrayAdapter<String> adapterEnc=new ArrayAdapter<>(getActivity(),
                android.R.layout.simple_list_item_1,nombres);
        lstEnc.setAdapter(adapterEnc);
        lstEnc.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ((IEncargado)getActivity()).seleccionarEncargado(listaEncargado.get(position));
            }
        });
    }

}
