package com.example.operacionesmatematicas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.operacionesmatematicas.modelo.ResultadosOperacion;

public class MainActivity extends AppCompatActivity {
    EditText txtNum1, txtNum2;
    Button btnSumar, btnRestar, btnMultiplicar, btnDividir;
    ResultadosOperacion res = new ResultadosOperacion();

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
                operacion("sumar");
            }
        });
        btnRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operacion("restar");
            }
        });
        btnMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operacion("multiplicar");
            }
        });
        btnDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operacion("dividir");
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
                case "sumar":
                    result = num1 + num2;
                    operacion = valor;
                    break;
                case "restar":
                    result = num1 - num2;
                    operacion = valor;
                    break;
                case "multiplicar":
                    result = num1 * num2;
                    operacion = valor;
                    break;
                case "dividir":
                    result = num1 / num2;
                    operacion = valor;
                    break;
            }
//            Toast.makeText(getApplicationContext(), "El resultado es: " + result, Toast.LENGTH_LONG).show();
            res.setResultado(result);
            res.setOperacion(operacion);
        }
        Intent intent = new Intent(getApplicationContext(), ActivityResultado.class);
        startActivity(intent);
    }
}