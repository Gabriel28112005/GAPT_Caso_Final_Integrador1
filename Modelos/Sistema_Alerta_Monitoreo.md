# Documentación de la Clase `Sistema_Alerta_Monitoreo`

## Descripción
La clase `Sistema_Alerta_Monitoreo` permite monitorear y analizar variables ambientales críticas, como la radiación, la temperatura y la presión. Proporciona alertas cuando los valores están fuera de los rangos seguros y ofrece funcionalidades para la detección de eventos raros mediante números primos y la descomposición en factores primos.

## Principales Funciones

- **`actualizarValores(double radiacion, double temp, double pres)`**: Actualiza los valores actuales de radiación, temperatura y presión.
- **`verificarAlertas()`**: Evalúa los valores y genera alertas si los umbrales de seguridad son superados.
- **`encontrarNumerosPrimos(int n)`**: Encuentra los primeros `n` números primos.
- **`descomponerEnPrimos(int num)`**: Descompone un número en sus factores primos.

## Funciones Detalladas

### `actualizarValores(double radiacion, double temp, double pres)`
**Descripción:**
Actualiza las variables internas del sistema con los valores de radiación, temperatura y presión.

**Parámetros:**
- `radiacion` (`double`): Nivel de radiación actual.
- `temp` (`double`): Temperatura actual.
- `pres` (`double`): Presión atmosférica actual.

**Retorno:**
- No retorna valores (void). Solo actualiza las variables internas.

---

### `verificarAlertas()`
**Descripción:**
Evalúa los valores actuales de radiación, temperatura y presión, generando alertas si se superan los umbrales de seguridad.

**Parámetros:**
- No recibe parámetros.

**Retorno:**
- `String`: Mensaje de alerta si se detectan valores peligrosos, o confirmación de condiciones normales.

---

### `encontrarNumerosPrimos(int n)`
**Descripción:**
Encuentra los primeros `n` números primos.

**Parámetros:**
- `n` (`int`): Cantidad de números primos a identificar.

**Retorno:**
- `int[]`: Arreglo con los primeros `n` números primos.

---

### `descomponerEnPrimos(int num)`
**Descripción:**
Descompone un número en sus factores primos.

**Parámetros:**
- `num` (`int`): Número entero a descomponer.

**Retorno:**
- `int[]`: Arreglo con los factores primos del número proporcionado.

---

## Notas Adicionales
- Se recomienda actualizar periódicamente los valores con `actualizarValores()` para un monitoreo en tiempo real.
- La clase permite detectar eventos raros mediante números primos y simplificar problemas a través de la factorización.
