package org.example.Sistema_Alerta_Monitoreo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Test_Sistema_Alerta_Monitoreo {

    private Sistema_Alerta_Monitoreo sistema;

    @BeforeEach
    public void setUp() {
        // Umbrales para los valores críticos
        sistema = new Sistema_Alerta_Monitoreo(50.0, 100.0, 0.0, 200.0);
    }

    @Test
    public void testActualizarValoresYVerificarAlertas() {
        sistema.actualizarValores(30.0, 50.0, 100.0);
        assertEquals("✅ Condiciones normales.", sistema.verificarAlertas());

        sistema.actualizarValores(60.0, 50.0, 100.0);
        assertTrue(sistema.verificarAlertas().contains("⚠️ Nivel de radiación peligroso!"));

        sistema.actualizarValores(30.0, 120.0, 100.0);
        assertTrue(sistema.verificarAlertas().contains("🔥 Temperatura demasiado alta!"));

        sistema.actualizarValores(30.0, -10.0, 100.0);
        assertTrue(sistema.verificarAlertas().contains("❄️ Temperatura demasiado baja!"));

        sistema.actualizarValores(30.0, 50.0, 250.0);
        assertTrue(sistema.verificarAlertas().contains("💨 Presión demasiado alta!"));
    }

    @Test
    public void testEncontrarNumerosPrimos() {
        int[] resultado = sistema.encontrarNumerosPrimos(5);
        int[] esperado = {2, 3, 5, 7, 11};
        assertArrayEquals(esperado, resultado);
    }

    @Test
    public void testDescomponerEnPrimos() {
        int[] resultado = sistema.descomponerEnPrimos(60); // 60 = 2 * 2 * 3 * 5
        int[] esperado = {2, 2, 3, 5};
        assertArrayEquals(esperado, resultado);
    }

    @Test
    public void testDescomponerEnPrimosNumeroPrimo() {
        int[] resultado = sistema.descomponerEnPrimos(13);
        int[] esperado = {13}; // 13 es primo
        assertArrayEquals(esperado, resultado);
    }
}
