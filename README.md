# FizzBuzz Java TDD

<p>
  <a href="#english">English</a> | <a href="#espanol">Español</a>
</p>

## English

### Overview
This project implements the FizzBuzz kata using TDD in Java.

### Rules
- If the number is a multiple of 3, return "Fizz".
- If the number is a multiple of 5, return "Buzz".
- If the number is a multiple of both 3 and 5, return "FizzBuzz".
- Otherwise, return the number as a string.

### How It Works
- `FizzBuzz.convert(int)` applies the rules above and returns the correct string.
- `Main` prints the output for numbers 1 to 15.

### Steps
1. Run the tests:
   - `mvn test`
2. Run the application:
   - `mvn -q exec:java`

### Tests
![Tests](docs/tests.png)

## Español

### Descripción
Este proyecto implementa la kata FizzBuzz usando TDD en Java.

### Reglas
- Si el número es múltiplo de 3, devuelve "Fizz".
- Si el número es múltiplo de 5, devuelve "Buzz".
- Si el número es múltiplo de 3 y 5, devuelve "FizzBuzz".
- En cualquier otro caso, devuelve el número como texto.

### Cómo Funciona
- `FizzBuzz.convert(int)` aplica las reglas y devuelve la cadena correcta.
- `Main` imprime el resultado para los números del 1 al 15.

### Pasos
1. Ejecutar los tests:
   - `mvn test`
2. Ejecutar la aplicación:
   - `mvn -q exec:java`

### Tests
![Tests](docs/tests.png)
