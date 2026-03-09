# FizzBuzz Java TDD

<p>
  <a href="README.md"><img alt="English" src="https://img.shields.io/badge/English-Selected-2ea44f?style=for-the-badge"></a>
  <a href="README.es.md"><img alt="Español" src="https://img.shields.io/badge/Espa%C3%B1ol-Select-1d4ed8?style=for-the-badge"></a>
</p>

## Overview
This project implements the FizzBuzz kata using TDD in Java.

## Rules
- If the number is a multiple of 3, return "Fizz".
- If the number is a multiple of 5, return "Buzz".
- If the number is a multiple of both 3 and 5, return "FizzBuzz".
- Otherwise, return the number as a string.

## How It Works
- `FizzBuzz.convert(int)` applies the rules above and returns the correct string.
- `Main` prints the output for numbers 1 to 15.

## Steps
1. Run the tests:
   - `mvn test`
2. Run the application:
   - `mvn -q exec:java`

## Tests
![Tests](docs/tests.png)
