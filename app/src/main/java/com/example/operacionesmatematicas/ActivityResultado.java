package com.example.operacionesmatematicas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.operacionesmatematicas.modulo.ResultadoOperacion;

public class ActivityResultado extends AppCompatActivity {

    TextView lblTipoOperacion, lblResultadoOperacion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        lblTipoOperacion = (TextView) findViewById(R.id.lblTipoOperacion);
        lblResultadoOperacion = (TextView) findViewById(R.id.lblMensajeResultado);

        ResultadoOperacion res = new ResultadoOperacion();

        lblTipoOperacion.setText("La " + res.getOperacion()  + " Es: ");
        lblResultadoOperacion.setText("" + res.getResultado());
    }
}