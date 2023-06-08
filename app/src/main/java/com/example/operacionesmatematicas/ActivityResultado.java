package com.example.operacionesmatematicas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityResultado extends AppCompatActivity {

    TextView lblTipoOperacion, lblResultadoOperacion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        lblTipoOperacion = (TextView) findViewById(R.id.lblTipoOperacion);
        lblResultadoOperacion = (TextView) findViewById(R.id.lblMensajeResultado);

        //Obtenemos los valores del Intent
        double resultado = getIntent().getDoubleExtra("Resultado",0);
        String operacion = getIntent().getStringExtra("Operacion");

        lblTipoOperacion.setText("La " + operacion + " Es: ");
        lblResultadoOperacion.setText("" + resultado);
    }
}