package org.example.Cronometro_Cosmico;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Test_Cronometro_Cosmico {

    private Cronometro_Cosmico cronometro;

    @BeforeEach
    public void setUp() {
        // Supongamos que el nuevo planeta tiene días de 30 horas y años de 400 días
        double duracionDiaPlaneta = 30 * 3600;  // 30 horas * 3600 segundos
        double duracionAnioPlaneta = 400 * duracionDiaPlaneta; // 400 días de 30 horas

        cronometro = new Cronometro_Cosmico(duracionDiaPlaneta, duracionAnioPlaneta);
    }

    @Test
    public void testConvertirSegundosATiempoPlaneta() {
        // Un día terrestre equivale a 24 horas * 3600 segundos = 86400 segundos
        double resultado = cronometro.convertirSegundosATiempoPlaneta(86400);
        assertEquals(108000, resultado, 0.01); // Un día terrestre equivale a un día de 30 horas en el nuevo planeta
    }

    @Test
    public void testConvertirAniosATiempoPlaneta() {
        // Un año terrestre equivale a 365 días terrestres
        double resultado = cronometro.convertirAniosATiempoPlaneta(1);
        assertEquals(0.73, resultado, 0.01); // 1 año terrestre ≈ 1.095 años en el nuevo planeta
    }
}
