package org.example.Navegador_Estelar;

import java.util.Arrays;

public class Navegador_Estelar {
    private int[][] terreno;

    public Navegador_Estelar(int filas, int columnas) {
        terreno = new int[filas][columnas];
    }

    public void establecerTerreno(int[][] nuevoTerreno) {
        if (nuevoTerreno.length == terreno.length && nuevoTerreno[0].length == terreno[0].length) {
            for (int i = 0; i < terreno.length; i++) {
                System.arraycopy(nuevoTerreno[i], 0, terreno[i], 0, terreno[i].length);
            }
        } else {
            throw new IllegalArgumentException("Las dimensiones del terreno no coinciden");
        }
    }

    public void mostrarTerreno() {
        for (int[] fila : terreno) {
            System.out.println(Arrays.toString(fila));
        }
    }

    public int[][] optimizarRuta(int[][] matrizA, int[][] matrizB) {
        if (matrizA[0].length != matrizB.length) {
            throw new IllegalArgumentException("Las matrices no se pueden multiplicar");
        }

        int[][] resultado = new int[matrizA.length][matrizB[0].length];
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizB[0].length; j++) {
                for (int k = 0; k < matrizA[0].length; k++) {
                    resultado[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }
        return resultado;
    }
}