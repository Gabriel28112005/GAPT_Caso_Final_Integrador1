package org.example.Planificador_Tareas;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Planificador_Tareas {
    private Map<String, int[]> asignacionesTareas;

    public Planificador_Tareas() {
        asignacionesTareas = new HashMap<>();
    }

    // Distribución automática de tareas
    public void asignarTareas(String miembro, int[] tareas) {
        asignacionesTareas.put(miembro, tareas);
    }

    // Visualización de horarios y cargas de trabajo
    public void mostrarHorarios() {
        for (Map.Entry<String, int[]> entry : asignacionesTareas.entrySet()) {
            System.out.println("Miembro: " + entry.getKey());
            System.out.println("Tareas asignadas: " + Arrays.toString(entry.getValue()));
        }
    }

    // Generación de tabla de tareas (metáfora de tablas de multiplicar)
    public void generarTablaTareas(int numMiembros, int numTareas) {
        for (int i = 1; i <= numMiembros; i++) {
            System.out.print("Miembro " + i + ": ");
            for (int j = 1; j <= numTareas; j++) {
                System.out.print((i * j) + " ");
            }
            System.out.println();
        }
    }

    // Cálculo del producto escalar para optimizar la carga de trabajo
    public int calcularCargaTrabajoOptima(int[] tareas, int[] esfuerzo) {
        if (tareas.length != esfuerzo.length) {
            throw new IllegalArgumentException("Los arreglos deben tener la misma longitud");
        }
        int productoEscalar = 0;
        for (int i = 0; i < tareas.length; i++) {
            productoEscalar += tareas[i] * esfuerzo[i];
        }
        return productoEscalar;
    }
}