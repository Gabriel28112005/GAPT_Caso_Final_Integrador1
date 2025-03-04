package org.example;
import org.example.Comunicador_Interplanetario.Comunicador_Interplanetario;
import org.example.Cronometro_Cosmico.Cronometro_Cosmico;
import org.example.Navegador_Estelar.Navegador_Estelar;
import org.example.Planificador_Tareas.Planificador_Tareas;
import org.example.Recursos_Suministros.Recursos_Suministros;
import org.example.Sistema_Alerta_Monitoreo.Sistema_Alerta_Monitoreo;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tenemos los siguientes ejercicios:\n");
        System.out.print("1. Comunicador_Interplanetario\n2. Cronometro_Cosmico\n3. Navegador_Estelar\n4. Planificador_Tareas\n5. Recursos_Suministros\n6. Sistema_Alerta_Monitoreo\n\n");

        try{

            System.out.print("Ingresa el número del ejercicio que deseas ejecutar: ");
            int ejercicio = scanner.nextInt();

            if (ejercicio == 1){
                System.out.print("\n");
                Comunicador_Interplanetario();
            }
            else if (ejercicio == 2){
                System.out.print("\n");
                Cronometro_Cosmico();
            }
            else if(ejercicio==3){
                System.out.print("\n");
                Navegador_Estelar();
            }
            else if(ejercicio==4){
                System.out.print("\n");
                Planificador_Tareas();
            }
            else if(ejercicio==5){
                System.out.print("\n");
                Recursos_Suministros();
            }
            else if(ejercicio==6){
                System.out.print("\n");
                Sistema_Alerta_Monitoreo();
            }
            else{
                System.out.println("No has ingresado un número válido");
            }


        }catch(Exception e){
            System.out.println("No has ingresado un número");
        }

    } //Fin del public static void main


    public static void Sistema_Alerta_Monitoreo(){

        System.out.println("----------------------------------------");
        System.out.println("           Sistema de Alerta            ");
        System.out.println("              y Monitoreo               ");
        System.out.println("----------------------------------------");
        System.out.print("\n");

        // Crear un objeto de Sistema_Alerta_Monitoreo con umbrales específicos
        Sistema_Alerta_Monitoreo sistema = new Sistema_Alerta_Monitoreo(50.0, 100.0, 0.0, 200.0);

        // Actualizar valores del sistema y verificar alertas
        System.out.println("Verificación de alertas con valores normales:");
        sistema.actualizarValores(30.0, 50.0, 100.0);
        System.out.println(sistema.verificarAlertas());

        System.out.println("\nVerificación de alertas con valores críticos:");
        sistema.actualizarValores(60.0, -10.0, 250.0);
        System.out.println(sistema.verificarAlertas());

        // Encontrar los primeros 5 números primos
        System.out.println("\nPrimeros 5 números primos:");
        int[] primos = sistema.encontrarNumerosPrimos(5);
        System.out.println(Arrays.toString(primos));

        // Descomposición de un número en factores primos
        int numero = 84;
        System.out.println("\nDescomposición de " + numero + " en factores primos:");
        int[] factores = sistema.descomponerEnPrimos(numero);
        System.out.println(Arrays.toString(factores));

    }


    public static void Recursos_Suministros(){

        System.out.println("-----------------------------------------");
        System.out.println("          Recursos y Suministros         ");
        System.out.println("-----------------------------------------");
        System.out.print("\n");

        // Crear un objeto de Recursos_Suministros con consumo diario y umbral de seguridad
        Recursos_Suministros recursos = new Recursos_Suministros(2.0, 1.5, 3.0, 5.0);

        // Calcular consumo de recursos para 10 días (múltiplo de 5)
        System.out.println("Consumo en 10 días:");
        double[] consumo10Dias = recursos.calcularConsumo(10);
        System.out.println("Agua: " + consumo10Dias[0] + "L, Comida: " + consumo10Dias[1] + "kg, Oxígeno: " + consumo10Dias[2] + "m³");

        // Predicción del consumo en 2 semanas
        System.out.println("\nPredicción de consumo en 2 semanas:");
        double[] consumo2Semanas = recursos.predecirConsumo(2);
        System.out.println("Agua: " + consumo2Semanas[0] + "L, Comida: " + consumo2Semanas[1] + "kg, Oxígeno: " + consumo2Semanas[2] + "m³");

        // Verificar si los recursos están por debajo del umbral de seguridad
        System.out.println("\nVerificación de recursos:");
        boolean alerta = recursos.verificarRecursos(4.0, 10.0, 10.0);
        System.out.println("¿Alerta de recursos? " + (alerta ? "Sí, los niveles son críticos" : "No, los niveles son seguros"));

        // Cálculo de estadísticas sobre el consumo de recursos
        double[] historialConsumo = {10, 20, 30, 40, 50};
        double[] estadisticas = recursos.calcularEstadisticas(historialConsumo);
        System.out.println("\nEstadísticas de consumo:");
        System.out.println("Mínimo consumo: " + estadisticas[0]);
        System.out.println("Máximo consumo: " + estadisticas[1]);
        System.out.println("Media de consumo: " + estadisticas[2]);
    } //Fin del public static void Recursos_Suministros()


    public static void Planificador_Tareas(){

        System.out.println("------------------------------------------");
        System.out.println("           Planificador de Tareas         ");
        System.out.println("------------------------------------------");
        System.out.print("\n");

        // Crear un objeto de Planificador_Tareas
        Planificador_Tareas planificador = new Planificador_Tareas();

        // Asignar tareas a miembros de la tripulación
        planificador.asignarTareas("Astronauta 1", new int[]{3, 5, 7});
        planificador.asignarTareas("Astronauta 2", new int[]{2, 4, 6});
        planificador.asignarTareas("Astronauta 3", new int[]{1, 2, 3});

        // Mostrar horarios y tareas asignadas
        System.out.println("Horarios de la tripulación:");
        planificador.mostrarHorarios();

        // Generar una tabla de tareas con 3 miembros y 5 tareas
        System.out.println("\nGenerando tabla de tareas:");
        planificador.generarTablaTareas(3, 5);

        // Calcular la carga óptima de trabajo
        int[] tareas = {2, 3, 4};
        int[] esfuerzo = {1, 2, 3};
        int cargaOptima = planificador.calcularCargaTrabajoOptima(tareas, esfuerzo);
        System.out.println("\nCarga óptima de trabajo (producto escalar): " + cargaOptima);

    }


    public static void Navegador_Estelar(){

        System.out.println("----------------------------------------");
        System.out.println("           Navegador Estelar           ");
        System.out.println("----------------------------------------");
        System.out.print("\n");

        // Crear un objeto de Navegador_Estelar con un terreno de 3x3
        Navegador_Estelar navegador = new Navegador_Estelar(3, 3);

        // Definir un terreno y establecerlo en la instancia
        int[][] terreno = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        navegador.establecerTerreno(terreno);

        // Mostrar el terreno establecido
        System.out.println("Terreno establecido:");
        navegador.mostrarTerreno();

        // Definir dos matrices para optimizar la ruta
        int[][] matrizA = {
                {1, 2},
                {3, 4},
                {5, 6}
        };

        int[][] matrizB = {
                {7, 8, 9},
                {10, 11, 12}
        };

        // Optimizar ruta usando multiplicación de matrices
        int[][] resultado = navegador.optimizarRuta(matrizA, matrizB);

        // Mostrar el resultado de la optimización
        System.out.println("\nRuta optimizada (Multiplicación de matrices):");
        for (int[] fila : resultado) {
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }

    } //Fin del public static void Navegador_Estelar()


    public static void Cronometro_Cosmico(){

        System.out.println("----------------------------------------");
        System.out.println("           Cronometro Cósmico           ");
        System.out.println("----------------------------------------");
        System.out.print("\n");


        // Crear un objeto de Cronometro_Cosmico con un planeta que tiene días de 30 horas y años de 400 días
        double duracionDiaPlaneta = 30 * 3600;  // 30 horas * 3600 segundos
        double duracionAnioPlaneta = 400 * duracionDiaPlaneta; // 400 días de 30 horas
        Cronometro_Cosmico cronometro = new Cronometro_Cosmico(duracionDiaPlaneta, duracionAnioPlaneta);

        // Convertir 1 día terrestre a tiempo en el nuevo planeta
        double segundosTierra = 86400; // 1 día terrestre en segundos
        double tiempoPlaneta = cronometro.convertirSegundosATiempoPlaneta(segundosTierra);
        System.out.println("1 día terrestre equivale a " + tiempoPlaneta + " segundos en el nuevo planeta.");

        // Convertir 1 año terrestre a tiempo en el nuevo planeta
        double aniosTierra = 1;
        double aniosPlaneta = cronometro.convertirAniosATiempoPlaneta(aniosTierra);
        System.out.println("1 año terrestre equivale a " + aniosPlaneta + " años en el nuevo planeta.");

        // Mostrar formatos de tiempo para un valor dado
        System.out.println("\nMostrando formatos de tiempo para 1000000 segundos:");
        cronometro.mostrarTiempoFormato(1000000);

        // Mostrar los valores máximos representables en diferentes tipos de datos
        System.out.println("\nMostrando límites de datos:");
        cronometro.mostrarLimitesDatos();

    }//Fin del public static void Cronometro_Cosmico()

    public static void  Comunicador_Interplanetario(){

        System.out.println("---------------------------------------");
        System.out.println("      Comunicador Interplanetario      ");
        System.out.println("---------------------------------------");
        System.out.print("\n");


        // Crear un objeto de la clase Comunicador_Interplanetario
        Comunicador_Interplanetario comunicador = new Comunicador_Interplanetario();

        // Mensajes de prueba
        String mensaje1 = "Hola, mundo!";
        String mensaje2 = "Anita lava la tina";
        String mensaje3 = "A Santa at NASA";
        String mensaje4 = "Esto no es un palíndromo";

        // Contar vocales en los mensajes
        System.out.println("Número de vocales en mensaje1: " + comunicador.contarVocales(mensaje1));
        System.out.println("Número de vocales en mensaje2: " + comunicador.contarVocales(mensaje2));
        System.out.println("Número de vocales en mensaje3: " + comunicador.contarVocales(mensaje3));
        System.out.println("Número de vocales en mensaje4: " + comunicador.contarVocales(mensaje4));

        // Invertir mensajes
        System.out.println("\nMensaje1 invertido: " + comunicador.invertirMensaje(mensaje1));
        System.out.println("Mensaje2 invertido: " + comunicador.invertirMensaje(mensaje2));
        System.out.println("Mensaje3 invertido: " + comunicador.invertirMensaje(mensaje3));
        System.out.println("Mensaje4 invertido: " + comunicador.invertirMensaje(mensaje4));

        // Verificar si son palíndromos
        System.out.println("\n¿Mensaje1 es un palíndromo? " + comunicador.esPalindromo(mensaje1));
        System.out.println("¿Mensaje2 es un palíndromo? " + comunicador.esPalindromo(mensaje2));
        System.out.println("¿Mensaje3 es un palíndromo? " + comunicador.esPalindromo(mensaje3));
        System.out.println("¿Mensaje4 es un palíndromo? " + comunicador.esPalindromo(mensaje4));

        // Enviar mensajes y almacenarlos en el historial
        comunicador.enviarMensaje(mensaje1);
        comunicador.enviarMensaje(mensaje2);
        comunicador.enviarMensaje(mensaje3);
        comunicador.enviarMensaje(mensaje4);

        // Obtener y mostrar historial de mensajes
        System.out.println("\nHistorial de mensajes enviados:");
        List<String> historial = comunicador.obtenerHistorialMensajes();
        for (String mensaje : historial) {
            System.out.println("- " + mensaje);
        }

    } //Fin del public static void Comunicador_Interplanetario()


} //Fin del public class Main



