package Adaptadores;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import Entities.Empleado;
import com.project1.panafoods.R;

import java.util.ArrayList;

public class AdaptadorEmpleados extends BaseAdapter {

    Activity activity;
    ArrayList<Empleado> listaEmp;

    public AdaptadorEmpleados(Activity activity, ArrayList<Empleado> listaEmp) {
        this.activity = activity;
        this.listaEmp = listaEmp;
    }

    @Override
    public int getCount() {
        return listaEmp.size();
    }

    @Override
    public Object getItem(int position) {
        return listaEmp.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v=convertView;
        TextView txtNomEmp, txtApeEmp, txtDniEmp, txtMailEmp, txtFecNacEmp, txtCelEmp, txtContEmp;
        ImageView imgFoto2;

        if (v==null){
            LayoutInflater inflater=(LayoutInflater)activity.getLayoutInflater();
            v=inflater.inflate(R.layout.lyt_item_empleado,null);
        }

        txtNomEmp=v.findViewById(R.id.txtNomEmp);
        txtApeEmp=v.findViewById(R.id.txtApeEmp);
        txtDniEmp=v.findViewById(R.id.txtDniEmp);
        txtMailEmp=v.findViewById(R.id.txtMailEmp);
        txtFecNacEmp=v.findViewById(R.id.txtFecNacEmp);
        txtCelEmp=v.findViewById(R.id.txtCelEmp);
        txtContEmp=v.findViewById(R.id.txtContEmp);
        imgFoto2=v.findViewById(R.id.imgFoto2);

        Empleado p = listaEmp.get(position);

        txtNomEmp.setText(p.getNom());
        txtApeEmp.setText(p.getApe());
        txtDniEmp.setText(p.getDni());
        txtMailEmp.setText(p.getMail());
        txtFecNacEmp.setText(p.getFecNac());
        txtCelEmp.setText(p.getCel());
        txtContEmp.setText(p.getCont());
        imgFoto2.setImageResource(p.getIdFoto2());

        return v;
    }
}
