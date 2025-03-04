package org.example.Comunicador_Interplanetario;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;

public class Test_Comunicador_Interplanetario {

    private Comunicador_Interplanetario comunicador;

    @BeforeEach
    public void setUp() {
        comunicador = new Comunicador_Interplanetario();
    }

    @Test
    public void testContarVocales() {
        assertEquals(6, comunicador.contarVocales("Hola Universo"));
        assertEquals(0, comunicador.contarVocales("xyz"));
        assertEquals(12, comunicador.contarVocales("Esto es una prueba de vocales"));
    }

    @Test
    public void testInvertirMensaje() {
        assertEquals("odnum", comunicador.invertirMensaje("mundo"));
        assertEquals("atled", comunicador.invertirMensaje("delta"));
        assertEquals("321 esrever", comunicador.invertirMensaje("reverse 123"));
    }

    @Test
    public void testEsPalindromo() {
        assertTrue(comunicador.esPalindromo("Anita lava la tina"));
        assertTrue(comunicador.esPalindromo("A Santa at NASA"));
        assertFalse(comunicador.esPalindromo("No es un palindromo"));
    }

    @Test
    public void testEnviarYObtenerHistorialMensajes() {
        comunicador.enviarMensaje("Mensaje 1");
        comunicador.enviarMensaje("Mensaje 2");
        comunicador.enviarMensaje("Mensaje 3");

        List<String> historial = comunicador.obtenerHistorialMensajes();

        assertEquals(3, historial.size());
        assertEquals("Mensaje 1", historial.get(0));
        assertEquals("Mensaje 2", historial.get(1));
        assertEquals("Mensaje 3", historial.get(2));
    }
}
