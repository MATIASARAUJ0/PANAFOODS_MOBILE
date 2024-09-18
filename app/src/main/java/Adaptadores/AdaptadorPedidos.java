package Adaptadores;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import Entities.Pedido;
import com.project1.panafoods.R;

import java.util.ArrayList;

public class AdaptadorPedidos extends BaseAdapter {

    Activity activity;
    ArrayList<Pedido> listaPed;

    public AdaptadorPedidos(Activity activity, ArrayList<Pedido> listaPed) {
        this.activity = activity;
        this.listaPed = listaPed;
    }

    @Override
    public int getCount() {
        return listaPed.size();
    }

    @Override
    public Object getItem(int position) {
        return listaPed.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v=convertView;
        TextView txtCli, txtRuc, txtProd, txtCant, txtFecEnt, txtLugEnt, txtHorEnt;
        ImageView imgFoto;
        if (v==null){
            LayoutInflater inflater=(LayoutInflater)activity.getLayoutInflater();
            v=inflater.inflate(R.layout.lyt_item_pedido,null);
        }
        txtCli=v.findViewById(R.id.txtCli);
        txtRuc=v.findViewById(R.id.txtRuc);
        txtProd=v.findViewById(R.id.txtProd);
        txtCant=v.findViewById(R.id.txtCant);
        txtFecEnt=v.findViewById(R.id.txtFecEnt);
        txtLugEnt=v.findViewById(R.id.txtLugEnt);
        txtHorEnt=v.findViewById(R.id.txtHorEnt);
        imgFoto=v.findViewById(R.id.imgFoto);

        Pedido p=listaPed.get(position);

        txtCli.setText(p.getCli());
        txtRuc.setText(p.getRuc());
        txtProd.setText(p.getProd());
        txtCant.setText(p.getCant());
        txtFecEnt.setText(p.getFecEnt());
        txtLugEnt.setText(p.getLugEnt());
        txtHorEnt.setText(p.getHorEnt());
        imgFoto.setImageResource(p.getIdFoto());

        return v;
    }
}
