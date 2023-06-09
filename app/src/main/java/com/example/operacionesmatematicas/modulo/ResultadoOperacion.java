package com.example.operacionesmatematicas.modulo;

public class ResultadoOperacion {
    private static double resultado;
    private static String operacion;

    public ResultadoOperacion(double resultado, String operacion) {
        this.resultado = resultado;
        this.operacion = operacion;
    }

    public ResultadoOperacion() {
    }

    public static double getResultado() {
        return resultado;
    }

    public static void setResultado(double resultado) {
        ResultadoOperacion.resultado = resultado;
    }

    public static String getOperacion() {
        return operacion;
    }

    public static void setOperacion(String operacion) {
        ResultadoOperacion.operacion = operacion;
    }
}
