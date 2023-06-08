package com.example.operacionesmatematicas.modelo;

public class ResultadosOperacion {
    private double resultado;
    private String operacion;

    public ResultadosOperacion(double resultado, String operacion) {
        this.resultado = resultado;
        this.operacion = operacion;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public ResultadosOperacion() {

    }
}
