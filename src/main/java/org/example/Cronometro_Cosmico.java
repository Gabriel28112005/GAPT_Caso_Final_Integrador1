package org.example;

public class Cronometro_Cosmico {
    // Factores de conversión entre la Tierra y el nuevo planeta
    private double segundosPorDiaTierra = 86400; // 24 horas * 60 minutos * 60 segundos
    private double segundosPorAnioTierra = 31536000; // 365 días * 86400 segundos

    private double segundosPorDiaPlaneta;
    private double segundosPorAnioPlaneta;

    // Constructor: Define la duración de un día y un año en el nuevo planeta (en segundos)
    public Cronometro_Cosmico(double duracionDiaPlaneta, double duracionAnioPlaneta) {
        this.segundosPorDiaPlaneta = duracionDiaPlaneta;
        this.segundosPorAnioPlaneta = duracionAnioPlaneta;
    }

    // Convierte tiempo de la Tierra al nuevo planeta
    public double convertirSegundosATiempoPlaneta(double segundosTierra) {
        return (segundosTierra / segundosPorDiaTierra) * segundosPorDiaPlaneta;
    }

    // Convierte años de la Tierra a años en el nuevo planeta
    public double convertirAniosATiempoPlaneta(double aniosTierra) {
        return (aniosTierra * segundosPorAnioTierra) / segundosPorAnioPlaneta;
    }

    // Muestra el tiempo en diferentes unidades
    public void mostrarTiempoFormato(double segundos) {
        long minutos = (long) (segundos / 60);
        long horas = (long) (segundos / 3600);
        long dias = (long) (segundos / segundosPorDiaTierra);
        long anios = (long) (segundos / segundosPorAnioTierra);

        System.out.println("Tiempo en segundos: " + segundos);
        System.out.println("Tiempo en minutos: " + minutos);
        System.out.println("Tiempo en horas: " + horas);
        System.out.println("Tiempo en días terrestres: " + dias);
        System.out.println("Tiempo en años terrestres: " + anios);
    }

    // Muestra los valores máximos representables en diferentes tipos de datos
    public void mostrarLimitesDatos() {
        System.out.println("Máximo valor de un byte: " + Byte.MAX_VALUE);
        System.out.println("Máximo valor de un short: " + Short.MAX_VALUE);
        System.out.println("Máximo valor de un int: " + Integer.MAX_VALUE);
        System.out.println("Máximo valor de un long: " + Long.MAX_VALUE);
        System.out.println("Máximo valor de un float: " + Float.MAX_VALUE);
        System.out.println("Máximo valor de un double: " + Double.MAX_VALUE);
    }
}