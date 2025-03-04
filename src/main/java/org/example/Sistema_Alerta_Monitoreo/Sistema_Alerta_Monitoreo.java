package org.example.Sistema_Alerta_Monitoreo;

import java.util.ArrayList;

public class Sistema_Alerta_Monitoreo {
    private double nivelRadiacion;
    private double temperatura;
    private double presion;
    private double umbralRadiacion;
    private double umbralTemperaturaAlta;
    private double umbralTemperaturaBaja;
    private double umbralPresion;

    public Sistema_Alerta_Monitoreo(double umbralRad, double umbralTempAlta, double umbralTempBaja, double umbralPres) {
        this.umbralRadiacion = umbralRad;
        this.umbralTemperaturaAlta = umbralTempAlta;
        this.umbralTemperaturaBaja = umbralTempBaja;
        this.umbralPresion = umbralPres;
    }

    // Monitoreo y actualización de niveles
    public void actualizarValores(double radiacion, double temp, double pres) {
        this.nivelRadiacion = radiacion;
        this.temperatura = temp;
        this.presion = pres;
    }

    // Verifica condiciones críticas y genera alertas
    public String verificarAlertas() {
        StringBuilder alerta = new StringBuilder();
        if (nivelRadiacion > umbralRadiacion) {
            alerta.append("⚠️ Nivel de radiación peligroso!\n");
        }
        if (temperatura > umbralTemperaturaAlta) {
            alerta.append("🔥 Temperatura demasiado alta!\n");
        } else if (temperatura < umbralTemperaturaBaja) {
            alerta.append("❄️ Temperatura demasiado baja!\n");
        }
        if (presion > umbralPresion) {
            alerta.append("💨 Presión demasiado alta!\n");
        }
        return alerta.length() > 0 ? alerta.toString() : "✅ Condiciones normales.";
    }

    // Identifica los primeros N números primos (eventos raros o críticos)
    public int[] encontrarNumerosPrimos(int n) {
        int[] primos = new int[n];
        int contador = 0, numero = 2;
        while (contador < n) {
            if (esPrimo(numero)) {
                primos[contador++] = numero;
            }
            numero++;
        }
        return primos;
    }

    private boolean esPrimo(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // Descomposición en factores primos
    public int[] descomponerEnPrimos(int num) {
        ArrayList<Integer> factores = new ArrayList<>();
        for (int i = 2; i <= num; i++) {
            while (num % i == 0) {
                factores.add(i);
                num /= i;
            }
        }
        return factores.stream().mapToInt(i -> i).toArray();
    }
}

