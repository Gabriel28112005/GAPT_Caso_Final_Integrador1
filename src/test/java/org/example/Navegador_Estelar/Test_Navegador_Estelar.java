package org.example.Navegador_Estelar;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Test_Navegador_Estelar {

    private Navegador_Estelar navegador;

    @BeforeEach
    public void setUp() {
        navegador = new Navegador_Estelar(3, 3); // Inicializa un terreno de 3x3
    }

    @Test
    public void testEstablecerTerreno() {
        int[][] nuevoTerreno = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        navegador.establecerTerreno(nuevoTerreno);

        // Verificar que el terreno se haya establecido correctamente
        int[][] esperado = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        assertArrayEquals(esperado, nuevoTerreno);
    }

    @Test
    public void testOptimizarRuta() {
        int[][] matrizA = {
                {1, 2},
                {3, 4},
                {5, 6}
        };

        int[][] matrizB = {
                {7, 8, 9},
                {10, 11, 12}
        };

        int[][] resultadoEsperado = {
                {27, 30, 33},
                {61, 68, 75},
                {95, 106, 117}
        };

        int[][] resultado = navegador.optimizarRuta(matrizA, matrizB);

        assertArrayEquals(resultadoEsperado, resultado);
    }

    @Test
    public void testOptimizarRutaDimensionesIncorrectas() {
        int[][] matrizA = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] matrizB = {
                {7, 8},
                {9, 10}
        };

        // Verifica que se lanza la excepción cuando las matrices no pueden multiplicarse
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            navegador.optimizarRuta(matrizA, matrizB);
        });

        assertEquals("Las matrices no se pueden multiplicar", exception.getMessage());
    }
}
