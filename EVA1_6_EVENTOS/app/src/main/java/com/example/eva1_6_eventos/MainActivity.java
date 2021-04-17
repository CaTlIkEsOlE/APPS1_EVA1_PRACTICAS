package com.example.eva1_6_eventos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnListener, btnClaseAnonima, btnPorClase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnListener = findViewById(R.id.btnListener);
        btnClaseAnonima = findViewById(R.id.btnClaseAnonima);

        btnPorClase = findViewById(R.id.btnPorClase);
        MiClaseOnClick objClick = new MiClaseOnClick();
        objClick.setContext(this);
        btnPorClase.setOnClickListener(objClick);

        btnListener.setOnClickListener(this);
        btnClaseAnonima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "EVENTO POR CLASE ANONIMA", Toast.LENGTH_LONG).show();
            }
        });
    }
    public void miClick(View arg){
        Toast.makeText(this, "EVENTO POR ONCLICK XML,", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this, "EVENTO POR LISTENER,", Toast.LENGTH_LONG).show();
    }
}

