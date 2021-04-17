package com.example.eva1_12_clima;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class ClimaAdaptador extends ArrayAdapter<Clima> {
    private Context context;
    private int layout;
    private Clima[] cCiudades;
    public ClimaAdaptador(@NonNull Context context, int resource, @NonNull Clima[] objects) {
        super(context, resource, objects);
        this.context=context;
        this.layout=resource;
        this.cCiudades=objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //FILA: NO EXISTA
        if(convertView==null) { //PRIMERA VEZ QUE SE MUESTRE LA LISTA, NO EXISTE
            convertView = ((Activity)context).getLayoutInflater().inflate(layout, parent, false);
        }/*else{ //FILA SI EXISTE Y HAY QUE LLENAR

        }*/
        //FILA: EXISTA
        ImageView imgVwClima;
        TextView txtVwCiudad, txtVwTemp, txtVwDesc;
        //Vincularlas para poder usarlas
        imgVwClima = convertView.findViewById(R.id.imgVwClima);
        txtVwCiudad = convertView.findViewById(R.id.txtVwCiudad);
        txtVwTemp = convertView.findViewById(R.id.txtVwTemp);
        txtVwDesc = convertView.findViewById(R.id.txtVwDesc);
        //LLenar los widgets con datos (arreglo cCiudades)
        imgVwClima.setImageResource(cCiudades[position].getImagen());
        txtVwCiudad.setText(cCiudades[position].getCiudad());
        txtVwTemp.setText(cCiudades[position].getTemp() + " C");
        txtVwDesc.setText(cCiudades[position].getDesc());
        return convertView;
    }
}
