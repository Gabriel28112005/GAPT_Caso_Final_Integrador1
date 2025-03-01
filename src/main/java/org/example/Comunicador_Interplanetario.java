package org.example;

import java.util.ArrayList;
import java.util.List;

public class Comunicador_Interplanetario {
    private List<String> historialMensajes;

    public Comunicador_Interplanetario() {
        this.historialMensajes = new ArrayList<>();
    }

    // Contar el número de vocales en un mensaje
    public int contarVocales(String mensaje) {
        int contador = 0;
        String vocales = "aeiouAEIOU";

        for (char c : mensaje.toCharArray()) {
            if (vocales.indexOf(c) != -1) {
                contador++;
            }
        }
        return contador;
    }

    // Invertir un mensaje
    public String invertirMensaje(String mensaje) {
        return new StringBuilder(mensaje).reverse().toString();
    }

    // Verificar si un mensaje es un palíndromo
    public boolean esPalindromo(String mensaje) {
        String limpio = mensaje.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return limpio.equals(new StringBuilder(limpio).reverse().toString());
    }

    // Enviar un mensaje y almacenarlo en el historial
    public void enviarMensaje(String mensaje) {
        historialMensajes.add(mensaje);
    }

    // Obtener el historial de mensajes enviados
    public List<String> obtenerHistorialMensajes() {
        return new ArrayList<>(historialMensajes);
    }
}

