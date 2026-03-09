# FizzBuzz Java TDD

<p>
  <a href="README.md"><img alt="English" src="https://img.shields.io/badge/English-Select-1d4ed8?style=for-the-badge"></a>
  <a href="README.es.md"><img alt="Español" src="https://img.shields.io/badge/Espa%C3%B1ol-Selected-2ea44f?style=for-the-badge"></a>
</p>

## Descripción
Este proyecto implementa la kata FizzBuzz usando TDD en Java.

## Reglas
- Si el número es múltiplo de 3, devuelve "Fizz".
- Si el número es múltiplo de 5, devuelve "Buzz".
- Si el número es múltiplo de 3 y 5, devuelve "FizzBuzz".
- En cualquier otro caso, devuelve el número como texto.

## Cómo Funciona
- `FizzBuzz.convert(int)` aplica las reglas y devuelve la cadena correcta.
- `Main` imprime el resultado para los números del 1 al 15.

## Pasos
1. Ejecutar los tests:
   - `mvn test`
2. Ejecutar la aplicación:
   - `mvn -q exec:java`

## Tests
![Tests](docs/tests.png)
