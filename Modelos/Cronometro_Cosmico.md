# Documentación de la Clase `Cronometro_Cosmico`

## Descripción
La clase `Cronometro_Cosmico` proporciona funcionalidades para la conversión de tiempo entre la Tierra y un planeta con un sistema temporal distinto. Permite realizar conversiones de segundos y años entre ambos planetas, visualizar el tiempo en distintas unidades y mostrar los valores máximos de diferentes tipos de datos numéricos en Java.

## Principales Funciones

- **`convertirSegundosATiempoPlaneta(double segundosTierra)`**: Convierte un tiempo en segundos de la Tierra a su equivalente en el nuevo planeta.
- **`convertirAniosATiempoPlaneta(double aniosTierra)`**: Convierte un número de años terrestres a su equivalente en el nuevo planeta.
- **`mostrarTiempoFormato(double segundos)`**: Muestra un tiempo dado en distintos formatos (segundos, minutos, horas, días y años terrestres).
- **`mostrarLimitesDatos()`**: Muestra los valores máximos representables en distintos tipos de datos numéricos en Java.

## Funciones Detalladas

### `convertirSegundosATiempoPlaneta(double segundosTierra)`
**Descripción:**
Convierte un tiempo expresado en segundos terrestres a su equivalente en el nuevo planeta, utilizando la relación entre la duración de un día en ambos planetas.

**Parámetros:**
- `segundosTierra` (`double`): Tiempo en segundos en la Tierra.

**Retorno:**
- `double`: Tiempo convertido en segundos en el nuevo planeta.

---

### `convertirAniosATiempoPlaneta(double aniosTierra)`
**Descripción:**
Convierte un tiempo expresado en años terrestres a su equivalente en el nuevo planeta, utilizando la relación entre la duración de un año en ambos planetas.

**Parámetros:**
- `aniosTierra` (`double`): Cantidad de años en la Tierra.

**Retorno:**
- `double`: Tiempo convertido en años en el nuevo planeta.

---

### `mostrarTiempoFormato(double segundos)`
**Descripción:**
Convierte un tiempo en segundos y lo muestra en distintos formatos: minutos, horas, días y años terrestres.

**Parámetros:**
- `segundos` (`double`): Cantidad de tiempo en segundos.

**Retorno:**
- No retorna valores (void). Muestra los resultados en consola.

---

### `mostrarLimitesDatos()`
**Descripción:**
Muestra los valores máximos representables en distintos tipos de datos numéricos en Java (`byte`, `short`, `int`, `long`, `float`, `double`).

**Parámetros:**
- No recibe parámetros.

**Retorno:**
- No retorna valores (void). Imprime los valores en consola.

---

## Notas Adicionales
- La clase permite modelar un sistema de tiempo en un nuevo planeta con distinta duración de días y años.
- Utiliza conversiones basadas en relaciones predefinidas entre la Tierra y el planeta destino.
