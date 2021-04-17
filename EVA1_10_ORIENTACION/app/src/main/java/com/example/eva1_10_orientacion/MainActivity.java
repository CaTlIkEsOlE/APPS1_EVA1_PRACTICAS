package com.example.eva1_10_orientacion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtViewMensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    protected void onStart() {
        super.onStart();
        txtViewMensaje = findViewById(R.id.txtVwMensaje);
        txtViewMensaje.setText("El mimo widget en dos layouts distintos");
    }
}