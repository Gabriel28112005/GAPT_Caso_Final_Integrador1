package org.example.Recursos_Suministros;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Test_Recursos_Suministros {

    private Recursos_Suministros recursos;

    @BeforeEach
    public void setUp() {
        // Configurar un objeto con valores de consumo por día y un umbral de seguridad
        recursos = new Recursos_Suministros(2.0, 1.5, 3.0, 5.0);
    }

    @Test
    public void testCalcularConsumo() {
        double[] resultado = recursos.calcularConsumo(10); // 10 días, múltiplo de 5
        assertArrayEquals(new double[]{20.0, 15.0, 30.0}, resultado, 0.01);
    }

    @Test
    public void testCalcularConsumoDiasNoMultiploDe5() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            recursos.calcularConsumo(7); // No es múltiplo de 5
        });

        assertEquals("El número de días debe ser múltiplo de 5.", exception.getMessage());
    }

    @Test
    public void testPredecirConsumo() {
        double[] resultado = recursos.predecirConsumo(2); // 2 semanas = 14 días
        assertArrayEquals(new double[]{28.0, 21.0, 42.0}, resultado, 0.01);
    }

    @Test
    public void testVerificarRecursos() {
        assertFalse(recursos.verificarRecursos(10.0, 10.0, 10.0)); // Todo está por encima del umbral
        assertTrue(recursos.verificarRecursos(4.0, 10.0, 10.0));  // Agua por debajo del umbral
        assertTrue(recursos.verificarRecursos(10.0, 4.0, 10.0));  // Comida por debajo del umbral
        assertTrue(recursos.verificarRecursos(10.0, 10.0, 4.0));  // Oxígeno por debajo del umbral
    }

    @Test
    public void testCalcularEstadisticas() {
        double[] consumos = {10, 20, 30, 40, 50};
        double[] resultado = recursos.calcularEstadisticas(consumos);

        assertArrayEquals(new double[]{10, 50, 30}, resultado, 0.01);
    }
}
