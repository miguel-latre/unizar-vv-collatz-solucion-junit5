## Verificación y Validación
# Escritura de test parametrizados para el problema de las secuencias de Collatz

Una solución al problema planteado en el repositorio
[unizar-vv-collatz](https://github.com/miguel-latre/unizar-vv-collatz),
utilizando JUnit 5 parametrizado.

Enunciado original basado en el
[problema 14 de Project Euler](https://projecteuler.net/problem=14).

En el directorio [src/test/java](./src/test/java/es/unizar/eina/vv6f/collatz) se encuentran los tests parametrizados solución al problema.
En el directorio [src/test/res](./src/test/res) hay una hoja de cálculo con el diseño de las pruebas de los tres métodos
que se pedían: `siguienteCollatz`, `longitud` e `iniciadorSecuenciaMasLarga`.
En el caso de este último, además de los tests, se ha utilizado la hoja de cálculo para definir
una _test basis_ que permita el diseño de los tests.
