package com.example.operacionesmatematicas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.operacionesmatematicas.modulo.ResultadoOperacion;


public class MainActivity extends AppCompatActivity {
    EditText txtNum1, txtNum2;
    Button btnSumar, btnRestar, btnMultiplicar, btnDividir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtNum1 = (EditText) findViewById(R.id.txtNum1);
        txtNum2 = (EditText) findViewById(R.id.txtNum2);
        btnSumar = (Button) findViewById(R.id.btnSumar);
        btnRestar = (Button) findViewById(R.id.btnRestar);
        btnMultiplicar = (Button) findViewById(R.id.btnMultiplicar);
        btnDividir = (Button) findViewById(R.id.btnDividir);

        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operacion("suma");
            }
        });
        btnRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operacion("resta");
            }
        });
        btnMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operacion("multiplicacion");
            }
        });
        btnDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operacion("division");
            }
        });
    }
    private void operacion(String valor) {
        double result = 0;
        String operacion="";
        //Campos Vacios
        if (txtNum1.getText().toString().isEmpty() || txtNum2.getText().toString().isEmpty()) {
            Toast.makeText(getApplicationContext(), "No puede haber campos vacios", Toast.LENGTH_LONG).show();
        } else {
            double num1 = Double.parseDouble(txtNum1.getText().toString());
            double num2 = Double.parseDouble(txtNum2.getText().toString());
            switch (valor) {
                case "suma":
                    result = num1 + num2;
                    operacion = valor;
                    break;
                case "resta":
                    result = num1 - num2;
                    operacion = valor;
                    break;
                case "multiplicacion":
                    result = num1 * num2;
                    operacion = valor;
                    break;
                case "division":
                    result = num1 / num2;
                    operacion = valor;
                    break;
            }
            ResultadoOperacion res = new ResultadoOperacion();
            res.setResultado(result);
            res.setOperacion(operacion);
            Intent intent = new Intent(getApplicationContext(), ActivityResultado.class);
            startActivity(intent);
        }
    }
}