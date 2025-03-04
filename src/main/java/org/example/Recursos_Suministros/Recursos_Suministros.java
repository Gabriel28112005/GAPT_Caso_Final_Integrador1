package org.example.Recursos_Suministros;

public class Recursos_Suministros {
    private double consumoDiarioAgua;
    private double consumoDiarioComida;
    private double consumoDiarioOxigeno;
    private double umbralSeguro;

    public Recursos_Suministros(double agua, double comida, double oxigeno, double umbral) {
        this.consumoDiarioAgua = agua;
        this.consumoDiarioComida = comida;
        this.consumoDiarioOxigeno = oxigeno;
        this.umbralSeguro = umbral;
    }

    // Calcula el consumo de recursos en múltiplos de 5 días
    public double[] calcularConsumo(int dias) {
        if (dias % 5 != 0) {
            throw new IllegalArgumentException("El número de días debe ser múltiplo de 5.");
        }
        double aguaTotal = consumoDiarioAgua * dias;
        double comidaTotal = consumoDiarioComida * dias;
        double oxigenoTotal = consumoDiarioOxigeno * dias;
        return new double[]{aguaTotal, comidaTotal, oxigenoTotal};
    }

    // Predicción de necesidades futuras en semanas y meses
    public double[] predecirConsumo(int semanas) {
        int dias = semanas * 7;
        return calcularConsumo(dias);
    }

    // Genera alertas cuando un recurso cae por debajo del umbral seguro
    public boolean verificarRecursos(double agua, double comida, double oxigeno) {
        return agua < umbralSeguro || comida < umbralSeguro || oxigeno < umbralSeguro;
    }

    // Calcula estadísticas: mínimo, máximo y media de consumo
    public double[] calcularEstadisticas(double[] consumos) {
        double min = consumos[0];
        double max = consumos[0];
        double suma = 0;

        for (double consumo : consumos) {
            if (consumo < min) min = consumo;
            if (consumo > max) max = consumo;
            suma += consumo;
        }
        double media = suma / consumos.length;
        return new double[]{min, max, media};
    }
}

