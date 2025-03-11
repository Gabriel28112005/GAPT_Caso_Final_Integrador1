# Documentación de la Clase `Planificador_Tareas`

## Descripción
La clase `Planificador_Tareas` gestiona la asignación y optimización de tareas dentro de un equipo. Permite asignar tareas a miembros, visualizar los horarios, generar tablas de trabajo y calcular la carga óptima de trabajo mediante el producto escalar.

## Principales Funciones

- **`asignarTareas(String miembro, int[] tareas)`**: Asigna un conjunto de tareas a un miembro del equipo.
- **`mostrarHorarios()`**: Muestra las tareas asignadas a cada miembro.
- **`generarTablaTareas(int numMiembros, int numTareas)`**: Genera una tabla de tareas basada en la multiplicación de índices.
- **`calcularCargaTrabajoOptima(int[] tareas, int[] esfuerzo)`**: Calcula el producto escalar entre las tareas y el esfuerzo requerido.

## Funciones Detalladas

### `asignarTareas(String miembro, int[] tareas)`
**Descripción:**
Asigna una lista de tareas a un miembro específico del equipo.

**Parámetros:**
- `miembro` (`String`): Nombre del miembro del equipo.
- `tareas` (`int[]`): Arreglo de enteros representando las tareas asignadas.

**Retorno:**
- No retorna valores (void). Almacena la asignación en un `HashMap`.

---

### `mostrarHorarios()`
**Descripción:**
Imprime en la consola la lista de tareas asignadas a cada miembro del equipo.

**Parámetros:**
- No recibe parámetros.

**Retorno:**
- No retorna valores (void). Muestra las asignaciones en consola.

---

### `generarTablaTareas(int numMiembros, int numTareas)`
**Descripción:**
Genera una tabla de tareas simulando una tabla de multiplicar, donde cada miembro tiene asignadas `numTareas`.

**Parámetros:**
- `numMiembros` (`int`): Número de miembros en el equipo.
- `numTareas` (`int`): Número de tareas a generar por miembro.

**Retorno:**
- No retorna valores (void). Imprime la tabla en la consola.

---

### `calcularCargaTrabajoOptima(int[] tareas, int[] esfuerzo)`
**Descripción:**
Calcula el producto escalar entre un conjunto de tareas y el esfuerzo requerido para completarlas.

**Parámetros:**
- `tareas` (`int[]`): Arreglo representando la cantidad de tareas.
- `esfuerzo` (`int[]`): Arreglo representando el esfuerzo necesario para cada tarea.

**Retorno:**
- `int`: Producto escalar de los dos arreglos.
- Lanza una excepción si los arreglos no tienen la misma longitud.

---

## Notas Adicionales
- La clase utiliza un `HashMap` para gestionar la asignación de tareas a cada miembro.
- Se debe garantizar que los arreglos de tareas y esfuerzo tengan la misma longitud antes de calcular la carga de trabajo óptima.
