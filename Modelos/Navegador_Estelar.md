# Documentación de la Clase `Navegador_Estelar`

## Descripción
La clase `Navegador_Estelar` permite gestionar la planificación de rutas y exploraciones en un entorno espacial mediante el uso de matrices. Permite establecer un terreno, visualizarlo y optimizar rutas mediante la multiplicación de matrices.

## Principales Funciones

- **`establecerTerreno(int[][] nuevoTerreno)`**: Define un mapa de terreno representado en una matriz.
- **`mostrarTerreno()`**: Muestra el terreno almacenado en la clase.
- **`optimizarRuta(int[][] matrizA, int[][] matrizB)`**: Optimiza rutas mediante la multiplicación de matrices.

## Funciones Detalladas

### `establecerTerreno(int[][] nuevoTerreno)`
**Descripción:**
Asigna una nueva matriz al terreno, validando que tenga las mismas dimensiones que la matriz interna del objeto.

**Parámetros:**
- `nuevoTerreno` (`int[][]`): Matriz que representa el nuevo terreno.

**Retorno:**
- No retorna valores (void). Lanza una excepción si las dimensiones no coinciden.

---

### `mostrarTerreno()`
**Descripción:**
Imprime en la consola la representación del terreno almacenado en la clase.

**Parámetros:**
- No recibe parámetros.

**Retorno:**
- No retorna valores (void). Imprime la matriz del terreno en la consola.

---

### `optimizarRuta(int[][] matrizA, int[][] matrizB)`
**Descripción:**
Realiza la multiplicación de dos matrices para optimizar rutas en el terreno explorado. Valida que las dimensiones sean correctas antes de proceder con la operación.

**Parámetros:**
- `matrizA` (`int[][]`): Primera matriz de la multiplicación.
- `matrizB` (`int[][]`): Segunda matriz de la multiplicación.

**Retorno:**
- `int[][]`: Matriz resultante de la multiplicación de `matrizA` y `matrizB`.
- Lanza una excepción si las dimensiones de las matrices no permiten la multiplicación.

---

## Notas Adicionales
- Se debe asegurar que las matrices usadas en `optimizarRuta()` sean compatibles en dimensiones.
- La representación del terreno se almacena en una matriz bidimensional y se imprime usando `Arrays.toString()`.
