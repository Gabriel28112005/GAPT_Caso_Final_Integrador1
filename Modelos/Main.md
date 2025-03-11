# Documentación de la Clase `Main`

## Descripción
La clase `Main` actúa como punto de entrada del programa y permite ejecutar distintas funcionalidades relacionadas con la gestión y monitoreo en un entorno espacial. Los usuarios pueden seleccionar entre diferentes módulos, cada uno de los cuales representa una funcionalidad específica.

## Principales Funciones

- **`main(String[] args)`**: Punto de entrada del programa. Permite seleccionar y ejecutar diferentes ejercicios.
- **`Sistema_Alerta_Monitoreo()`**: Ejecuta las funcionalidades del sistema de monitoreo y alerta de variables ambientales.
- **`Recursos_Suministros()`**: Gestiona el consumo de recursos y suministros esenciales.
- **`Planificador_Tareas()`**: Administra la asignación y optimización de tareas dentro de la tripulación.
- **`Navegador_Estelar()`**: Realiza la planificación de rutas y exploración utilizando matrices.
- **`Cronometro_Cosmico()`**: Convierte y muestra tiempos en un sistema planetario distinto.
- **`Comunicador_Interplanetario()`**: Administra la comunicación interplanetaria, incluyendo análisis de mensajes.

## Funciones Detalladas

### `main(String[] args)`
**Descripción:**
Solicita al usuario seleccionar una opción y ejecuta el módulo correspondiente.

**Parámetros:**
- `args` (`String[]`): Argumentos de la línea de comandos (no utilizados en este programa).

**Retorno:**
- No retorna valores (void). Ejecuta la opción seleccionada por el usuario.

---

### `Sistema_Alerta_Monitoreo()`
**Descripción:**
Ejecuta el sistema de alerta, verificando niveles de radiación, temperatura y presión, e identificando eventos raros a través de números primos.

**Parámetros:**
- No recibe parámetros.

**Retorno:**
- No retorna valores (void). Imprime información en la consola.

---

### `Recursos_Suministros()`
**Descripción:**
Calcula y analiza el consumo de recursos vitales como agua, comida y oxígeno. Verifica si los recursos están por debajo del umbral seguro y muestra estadísticas.

**Parámetros:**
- No recibe parámetros.

**Retorno:**
- No retorna valores (void). Imprime información en la consola.

---

### `Planificador_Tareas()`
**Descripción:**
Asigna tareas a miembros de la tripulación, genera una tabla de tareas y calcula la carga óptima de trabajo utilizando el producto escalar.

**Parámetros:**
- No recibe parámetros.

**Retorno:**
- No retorna valores (void). Imprime información en la consola.

---

### `Navegador_Estelar()`
**Descripción:**
Permite definir un terreno, visualizarlo y optimizar rutas mediante la multiplicación de matrices.

**Parámetros:**
- No recibe parámetros.

**Retorno:**
- No retorna valores (void). Imprime información en la consola.

---

### `Cronometro_Cosmico()`
**Descripción:**
Convierte el tiempo terrestre a un sistema planetario distinto, muestra tiempos en diferentes formatos y presenta los límites de los tipos de datos numéricos en Java.

**Parámetros:**
- No recibe parámetros.

**Retorno:**
- No retorna valores (void). Imprime información en la consola.

---

### `Comunicador_Interplanetario()`
**Descripción:**
Realiza funciones de comunicación interplanetaria, incluyendo conteo de vocales en mensajes, inversión de texto, verificación de palíndromos y almacenamiento de mensajes enviados.

**Parámetros:**
- No recibe parámetros.

**Retorno:**
- No retorna valores (void). Imprime información en la consola.

---

## Notas Adicionales
- La clase proporciona una interfaz interactiva basada en la consola para seleccionar y ejecutar las distintas funcionalidades.
- Se recomienda manejar excepciones al ingresar valores no numéricos en la selección de ejercicios.