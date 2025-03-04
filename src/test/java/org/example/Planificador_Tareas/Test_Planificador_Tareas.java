package org.example.Planificador_Tareas;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Test_Planificador_Tareas {

    private Planificador_Tareas planificador;

    @BeforeEach
    public void setUp() {
        planificador = new Planificador_Tareas();
    }

    @Test
    public void testAsignarTareas() {
        int[] tareas = {3, 5, 7};
        planificador.asignarTareas("Astronauta1", tareas);

        // Redirigir salida estándar para capturar la impresión
        ByteArrayOutputStream salida = new ByteArrayOutputStream();
        System.setOut(new PrintStream(salida));

        // Llamar al método que imprime la asignación de tareas
        planificador.mostrarHorarios();

        // Restaurar la salida estándar
        System.setOut(System.out);

        // Verificar si el mensaje esperado está en la salida
        String salidaEsperada = "Miembro: Astronauta1\nTareas asignadas: [3, 5, 7]";
        assertTrue(salida.toString().contains(salidaEsperada));
    }

    @Test
    public void testCalcularCargaTrabajoOptima() {
        int[] tareas = {2, 3, 4};
        int[] esfuerzo = {1, 2, 3};

        int resultado = planificador.calcularCargaTrabajoOptima(tareas, esfuerzo);
        assertEquals(20, resultado); // (2*1) + (3*2) + (4*3) = 2 + 6 + 12 = 20
    }

    @Test
    public void testCalcularCargaTrabajoOptimaDimensionesIncorrectas() {
        int[] tareas = {1, 2};
        int[] esfuerzo = {1, 2, 3};

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            planificador.calcularCargaTrabajoOptima(tareas, esfuerzo);
        });

        assertEquals("Los arreglos deben tener la misma longitud", exception.getMessage());
    }
}
