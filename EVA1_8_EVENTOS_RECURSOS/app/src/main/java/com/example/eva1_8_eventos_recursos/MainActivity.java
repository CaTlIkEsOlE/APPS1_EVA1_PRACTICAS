package com.example.eva1_8_eventos_recursos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener{
    TextView txtVwNombre, txtVwApellido;
    EditText edTxtNombre, edTxtApellido;
    RadioGroup rdGrpIdioma;
    RadioButton rdBtnEspanol;
    RadioButton rdBtnIngles;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtVwNombre = findViewById(R.id.txtVwNombre);
        txtVwApellido = findViewById(R.id.txtVwApellido);
        edTxtNombre = findViewById(R.id.edTxtNombre);
        edTxtApellido = findViewById(R.id.edTxtApellido);
        rdGrpIdioma = findViewById(R.id.rdGrpIdioma);
        rdGrpIdioma.setOnCheckedChangeListener(this);
        rdBtnEspanol = findViewById(R.id.rdBtnEs);
        rdBtnIngles = findViewById(R.id.rdBtnIn);
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        if(checkedId == R.id.rdBtnEs){
            txtVwNombre.setText(R.string.txt_vw_nom);
            edTxtNombre.setHint(R.string.edt_txt_nom);
            txtVwApellido.setText(R.string.txt_vw_ape);
            edTxtApellido.setHint(R.string.edt_txt_ape);
            rdBtnEspanol.setText(R.string.rd_btn_es);
            rdBtnIngles.setText(R.string.rd_btn_in) ;
        }else{
            txtVwNombre.setText(R.string.txt_vw_nom_en);
            edTxtNombre.setHint(R.string.edt_txt_nom_en);
            txtVwApellido.setText(R.string.txt_vw_ape_en);
            edTxtApellido.setHint(R.string.edt_txt_ape_en);
            rdBtnEspanol.setText(R.string.rd_btn_es_en);
            rdBtnIngles.setText(R.string.rd_btn_in_en) ;
        }
    }

}