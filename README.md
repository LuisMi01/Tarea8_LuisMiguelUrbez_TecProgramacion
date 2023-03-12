# Tarea8_LuisMiguelUrbez_TecProgramacion

## Repositorio: https://github.com/LuisMi01/Tarea8_LuisMiguelUrbez_TecProgramacion/tree/main

## Ejercicio: 
1. La guerra de dados
Requisitos previos: Ejercicio 1 del capítulo La programación orientada a objetos

Dos jugadores se enfrentan en una guerra de dados: cada jugador tiene un dado de seis caras y diez fichas.

Cree una clase JugadorGuerra, que tenga como atributos de instancia el número de fichas, un dado (una instancia de la clase Dado) y el nombre del jugador. Agregue dentro de esta clase el resto de elementos necesarios. Cree un algoritmo principal usando esta clase.

Ejemplo de ejecución:

¿Nombre del jugador?

Jimena

¿Nombre del jugador?

Lucía

Jimena ha sacado un 4

Lucía ha sacado un 1

Jimena gana

Marcador: Jimena 11 - Lucía 9

Jimena ha sacado un 1

Lucía ha sacado un 5

Lucía gana

Marcador: Jimena 10 - Lucía 10

Jimena ha sacado un 5

Lucía ha sacado un 2

Jimena gana

Marcador: Jimena 11 - Lucía 9

Jimena ha sacado un 1

Lucía ha sacado un 6

Lucía gana

Marcador: Jimena 10 - Lucía 10

Jimena ha sacado un 3

Lucía ha sacado un 6

Lucía gana

Marcador: Jimena 9 - Lucía 11

Jimena ha sacado un 5

Lucía ha sacado un 6

Lucía gana

Marcador: Jeanne 8 - Lucía 12

Jimena ha sacado un 2

Lucía ha sacado un 2

empate

Marcador: Jimena 8 - Lucía 12

Jimena ha sacado un 6

Lucía ha sacado un 6

empate

Marcador: Jimena 8 - Lucía 12

Jimena ha sacado un 3

Lucía ha sacado un 6

Lucía gana

Marcador: Jimena 7 - Lucía 13

Jimena ha sacado un 1

Lucía ha sacado un 5

Lucía gana

Marcador: Jimena 6 - Lucía 14

Jimena ha sacado un 2

Lucía ha sacado un 5

Lucía gana

Marcador: Jimena 5 - Lucía 15

Jimena ha sacado un 3

Lucía ha sacado un 5

Lucía gana

Marcador: Jimena 4 - Lucía 16

Jimena ha sacado un 2

Lucía ha sacado un 3

Lucía gana

Marcador: Jimena 3 - Lucía 17

Lucía ha sacado un 5

Lucía gana

Marcador: Jimena 2 - Lucía 18

Jimena ha sacado un 1

Lucía ha sacado un 6

Lucía gana

Marcador: Jimena 1 - Lucía 19

Jimena ha sacado un 1

Lucía ha sacado un 2

Lucía gana

Marcador: Jimena 0 - Lucía 20

Lucía ha ganado

2. Los clientes (versión 2)
Requisitos previos: Ejercicio 2 del capítulo La programación orientada a objetos

Los clientes creados en el capítulo anterior, pueden comprar libros y vídeos a nuestro editor. Todos los libros y vídeos tienen un título y un autor. Un libro tiene varias páginas, mientras que un vídeo tiene una duración. Crear una clase Obra, agrupando los elementos comunes a libros y vídeos y dos clases Libros y Video, herederas de esta, con los elementos específicos para cada una. Luego cree una clase Pedido, asociando a un cliente un conjunto de obras compradas.

Ejemplo de ejecución posible:

-- Menú --

1 - Mostrar clientes

2 - Crear clientes

3 - Crear una obra

4 - Crear un pedido

5 - Mostrar pedidos

6 - Salir

2

¿Nombre?

Francisco GONZALEZ

-- Menú --

1 - Mostrar clientes

2 - Crear clientes

3 - Crear una obra

4 - Crear un pedido

5 - Mostrar pedidos

6 - Salir

2

¿Nombre?

Carlota OLIVERA

-- Menú --

1 - Mostrar clientes

2 - Crear clientes

3 - Crear una obra

4 - Crear un pedido

5 - Mostrar pedidos

6 - Salir

3

¿Tipo?

1 - Libro

2 - Vídeo

2

¿Título?

Java avanzado

¿Autor?

Thierry RICHARD

¿Duración (minutos)?

378

Vídeo Java avanzado de Thierry RICHARD (6h18) añadido

-- Menú --

1 - Mostrar clientes

2 - Crear clientes

3 - Crear una obra

4 - Crear un pedido

5 - Mostrar pedidos

6 - Salir

3

¿Tipo?

1 - Libro

2 - Vídeo

1

¿Título?

Java : Los fundamentos del lenguaje Java

¿Autor?

Thierry GROUSSARD

¿Número de páginas?

501

Libro Java: Los fundamentos del lenguaje Java de Thierry GROUSSARD (501 páginas) añadido

-- Menú --

1 - Mostrar clientes

2 - Crear clientes

3 - Crear una obra

4 - Crear un pedido

5 - Mostrar pedidos

6 - Salir

4

¿Para qué cliente?

Cliente n°.1: Francisco GONZALEZ

Cliente n°.2: Carlota OLIVERA

2

¿Qué obra agregar al pedido?

1 - Vídeo Java avanzado de Thierry RICHARD (6h18)

2 - Libro Java: Los fundamentos del lenguaje Java de Thierry GROUSSARD (501 páginas)

3 - Terminar pedido

2

¿Qué obra agregar al pedido?

1 - Vídeo Java avanzado de Thierry RICHARD (6h18)

2 - Libro Java: Los fundamentos del lenguaje Java de Thierry GROUSSARD (501 páginas)

3 - Terminar pedido

1

¿Qué obra agregar al pedido?

1 - Vídeo Java avanzado de Thierry RICHARD (6h18)

2 - Libro Java: Los fundamentos del lenguaje Java de Thierry GROUSSARD (501 páginas)

3 - Terminar pedido

3

-- Menú --

1 - Mostrar clientes

2 - Crear clientes

3 - Crear una obra

4 - Crear un pedido

5 - Mostrar pedidos

6 - Salir

5

-- Pedidos --

 * Pedido de: Carlota OLIVERA:

    - Libro Java: Los fundamentos del lenguaje Java de Thierry GROUSSARD (501 páginas)

    - Vídeo Java avanzado de Thierry RICHARD (6h18)

 

-- Menú --

1 - Mostrar clientes

2 - Crear clientes

3 - Crear una obra

4 - Crear un pedido

5 - Mostrar pedidos

6 - Salir

6
