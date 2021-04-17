package com.example.eva1_13_cuadros_dialogo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    //EVENTOS CLICK
    public void onClickCDSistema(View v){

        new AlertDialog.Builder(this)
                .setTitle("Cuadro de dialogo de Android")
                .setMessage("Hola Mundo!!")
                .setPositiveButton("Ok",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(getApplicationContext(), "Boton OK", Toast.LENGTH_SHORT).show();

                            }
                        })
                .setNegativeButton("NO",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(getApplicationContext(), "Boton NO", Toast.LENGTH_SHORT).show();

                            }
                        })
                .setNeutralButton("CANCEL",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(getApplicationContext(), "Boton CANCEL", Toast.LENGTH_SHORT).show();

                            }
                        })
                .show();

    }

    public void onClickCDCustom(View v){

        Dialog dlgMiCuadroDialogo = new Dialog(this);
        //ASIGNAR EL LAYOUT
        dlgMiCuadroDialogo.setContentView(R.layout.cuadro_dialogo);
        //VINCULAR LOS WIDGETS
        TextView txtViewTitu;
        EditText edtTextDatos;
        Button btnAccion;
        txtViewTitu = dlgMiCuadroDialogo.findViewById(R.id.txtViewTitulo);
        edtTextDatos = dlgMiCuadroDialogo.findViewById(R.id.edtTxtDatos);
        btnAccion = dlgMiCuadroDialogo.findViewById(R.id.btnAccion);
        txtViewTitu.setText("ESTE ES UN CUADRO DE DIALOGO PERSONALZIADO!!!");
        btnAccion.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getApplicationContext(), edtTextDatos.getText().toString(), Toast.LENGTH_SHORT).show();
                        dlgMiCuadroDialogo.dismiss();
                    }
                }
        );
        dlgMiCuadroDialogo.show();
    }

}