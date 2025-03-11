# Comunicador Interplanetario

## Descripción
El comunicador interplanterario es crucial en proyecto pues es el encargado de analizar y traducir mensajes entre la Tierra y la base, asegurando que la comunicación sea efectiva y sin errores.

## Principales funciones
- Contar vocales: El comunicador interplanetario debe contar la cantidad de vocales en un mensaje sin distinción entre mayúsculas y minúsculas.
- Invertir mensaje: El comunicador interplanetario debe invertir el orden de los carácteres del mensaje recibido. Esto es de utilidad para descifrar códigos o verificar la simetría de un mensaje.
- Verificar palíndromo: El comunicador interplanetario debe verificar si un mensaje es un palíndromo, es decir, si se lee igual de izquierda a derecha que de derecha a izquierda. No se toman en cuenta ni espacios ni distinción entre mayúsculas y minúsculas.


## Funcionalidades más detalladas
    contarVocales(String mensaje)
- Propósito: 
  - Contar la cantidad de vocales en un mensaje.
- Parámetros: 
  - mensaje: cadena de texto a analizar.
- Retorno: 
  - Número entero con la cantidad de vocales en el mensaje.
  

    invertirMensaje(String mensaje)
- Propósito: 
  - Invertir el orden de los carácteres del mensaje.
- Parámetros:
  - mensaje: cadena de texto a invertir.
- Retorno: 
  - Cadena de texto con el mensaje invertido.
  

    verificarPalindromo(String mensaje)
- Propósito:
  - Verificar si un mensaje es un palíndromo. No se toman en cuenta ni espacios ni distinción entre mayúsculas y minúsculas
- Parámetros:
  - mensaje: cadena de texto a verificar.
- Retorno:
  - Valor booleano que indica si el mensaje es un palíndromo o no. En caso de serlo, la función devolverá "true", de lo contrario, devolverá "false".


## Ejemplo de uso
        
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