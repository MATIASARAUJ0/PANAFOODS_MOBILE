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

import Entities.Colaborador;


public class FragmentListaColaborador extends Fragment {

    ArrayList<Colaborador> listaColaborador;
    ListView lstCol;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.lista_colaborador, null);
        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        lstCol=getView().findViewById(R.id.lstCol);
        listaColaborador=new ArrayList<>();

        listaColaborador.add(new Colaborador(1,R.drawable.trabajador,"Óscar","947346864",
                "oscar@hotmail.com","Soporte Técnico"));
        listaColaborador.add(new Colaborador(2,R.drawable.trabajador,"Juan","957382509",
                "juan@hotmail.com","Supervisor de Trabajadores"));
        listaColaborador.add(new Colaborador(3,R.drawable.trabajador,"Pamela","905634899",
                "pame@hotmail.com","Mantenimiento de Máquina"));
        listaColaborador.add(new Colaborador(4,R.drawable.trabajador,"Roberto","991533072",
                "roberto@hotmail.com","Operario de Planta"));

        ArrayList<String> nombres=new ArrayList<>();
        for (Colaborador c:listaColaborador){
            nombres.add(c.getNom());
        }

        ArrayAdapter<String> adapter=new ArrayAdapter<>(getActivity(),
                android.R.layout.simple_list_item_1,nombres);
        lstCol.setAdapter(adapter);
        lstCol.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ((IColaborador)getActivity()).seleccionarColaborador(listaColaborador.get(position));
            }
        });
    }
}