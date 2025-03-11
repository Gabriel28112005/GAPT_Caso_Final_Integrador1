# Documentación de la Clase `Recursos_Suministros`

## Descripción
La clase `Recursos_Suministros` gestiona el control y predicción del consumo de recursos esenciales como agua, comida y oxígeno. También permite generar alertas si los niveles de recursos caen por debajo de un umbral seguro y calcular estadísticas del consumo.

## Principales Funciones

- **`calcularConsumo(int dias)`**: Calcula el consumo de recursos en períodos de tiempo de múltiplos de 5 días.
- **`predecirConsumo(int semanas)`**: Predice el consumo de recursos en función de semanas.
- **`verificarRecursos(double agua, double comida, double oxigeno)`**: Verifica si algún recurso ha caído por debajo del umbral seguro.
- **`calcularEstadisticas(double[] consumos)`**: Calcula estadísticas de consumo como mínimo, máximo y media.

## Funciones Detalladas

### `calcularConsumo(int dias)`
**Descripción:**
Calcula el consumo total de agua, comida y oxígeno en un número específico de días. Solo acepta valores que sean múltiplos de 5.

**Parámetros:**
- `dias` (`int`): Número de días para el cálculo.

**Retorno:**
- `double[]`: Un arreglo con los valores de consumo total de agua, comida y oxígeno.
- Lanza una excepción si el número de días no es múltiplo de 5.

---

### `predecirConsumo(int semanas)`
**Descripción:**
Calcula la predicción del consumo de recursos en función de un número dado de semanas.

**Parámetros:**
- `semanas` (`int`): Número de semanas para la predicción.

**Retorno:**
- `double[]`: Un arreglo con los valores estimados de consumo total de agua, comida y oxígeno.

---

### `verificarRecursos(double agua, double comida, double oxigeno)`
**Descripción:**
Evalúa si los niveles actuales de recursos son seguros o han caído por debajo del umbral definido.

**Parámetros:**
- `agua` (`double`): Cantidad actual de agua disponible.
- `comida` (`double`): Cantidad actual de comida disponible.
- `oxigeno` (`double`): Cantidad actual de oxígeno disponible.

**Retorno:**
- `boolean`: Retorna `true` si alguno de los recursos está por debajo del umbral seguro, `false` en caso contrario.

---

### `calcularEstadisticas(double[] consumos)`
**Descripción:**
Calcula las estadísticas del consumo de recursos, incluyendo mínimo, máximo y media.

**Parámetros:**
- `consumos` (`double[]`): Un arreglo de valores de consumo.

**Retorno:**
- `double[]`: Un arreglo con los valores `[mínimo, máximo, media]` del consumo registrado.

---

## Notas Adicionales
- La clase asume que los consumos diarios de agua, comida y oxígeno son constantes.
- Solo se permite calcular el consumo en múltiplos de 5 días.
- Se pueden utilizar las estadísticas de consumo para optimizar la planificación de recursos en una misión prolongada.