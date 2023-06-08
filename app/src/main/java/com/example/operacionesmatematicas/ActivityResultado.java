package com.example.operacionesmatematicas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.example.operacionesmatematicas.modelo.ResultadosOperacion;

public class ActivityResultado extends AppCompatActivity {

    TextView lblTipoOperacion, lblResultadoOperacion;
    ResultadosOperacion result = new ResultadosOperacion();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        lblTipoOperacion = (TextView) findViewById(R.id.lblTipoOperacion);
        lblResultadoOperacion = (TextView) findViewById(R.id.lblMensajeResultado);


        lblTipoOperacion.setText("La " + result.getOperacion() + " Es: ");
        lblResultadoOperacion.setText("" + result.getResultado());
        Toast.makeText(getApplicationContext(),""+ result.getResultado(),Toast.LENGTH_LONG).show();

    }
}