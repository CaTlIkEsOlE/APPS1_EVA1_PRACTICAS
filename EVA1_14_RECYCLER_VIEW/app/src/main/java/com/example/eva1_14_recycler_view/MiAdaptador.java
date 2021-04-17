package com.example.eva1_14_recycler_view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MiAdaptador extends RecyclerView.Adapter<MiAdaptador.ViewHolder> {
    private String[] aDatos;

    public MiAdaptador(String[] aDatos) {
        this.aDatos = aDatos;
    }

    //VIEWHOLDER REPRESENTA IN ITEM DE LA LISTA
    //EVENTOS Y METODOS DE CADA WIDGET

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private final TextView txtViewFila;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtViewFila = itemView.findViewById(R.id.txtVwFila);
        }

        public TextView getTxtViewFila() {
            return txtViewFila;
        }

    }
    //CREAR PANTALLA (CADA FILA) Y CREAR LOS OBJETOS VIEW HOLDER
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.texto_fila, parent, false);

        return new ViewHolder(v);
    }

    //LLENA CON DATOS
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.getTxtViewFila().setText(aDatos[position]);
    }

    @Override
    public int getItemCount() {
        return aDatos.length;
    }

}
