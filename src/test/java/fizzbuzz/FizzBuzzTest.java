package fizzbuzz;

import org.example.FizzBuzz.FizzBuzz;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    // @Test
    // public void check_1_to_1() {
    //     assertEquals("1", new FizzBuzz().convert(1));
    // }
    //
    // @Test
    // public void check_2_to_2() {
    //     assertEquals("2", new FizzBuzz().convert(2));
    // }
    //
    // @Test
    // public void check_4_to_4() {
    //     assertEquals("4", new FizzBuzz().convert(4));
    // }
    //
    // @Test
    // public void check_7_to_7() {
    //     assertEquals("7", new FizzBuzz().convert(7));
    // }

    @ParameterizedTest
    @CsvSource({
            "5, Buzz",
            "10, Buzz",
            "20, Buzz"
    })
    public void check_number_to_buzz(int number, String expected) {
        assertEquals(expected, new FizzBuzz().convert(number));
    }

    @ParameterizedTest
    @CsvSource({
            "3, Fizz",
            "6, Fizz",
            "9, Fizz",
            "12, Fizz"
    })
    public void check_number_to_fizz(int number, String expected) {
        assertEquals(expected, new FizzBuzz().convert(number));
    }

    @ParameterizedTest
    @CsvSource({
            "15, FizzBuzz",
            "30, FizzBuzz",
            "45, FizzBuzz",
            "60, FizzBuzz"
    })
    public void check_number_to_fizzbuzz(int number, String expected) {
        assertEquals(expected, new FizzBuzz().convert(number));
    }

    @ParameterizedTest
    @CsvSource({
            "1, 1",
            "2, 2",
            "4, 4",
            "7, 7"
    })
    public void check_number_to_string(int number, String expected) {
        assertEquals(expected, new FizzBuzz().convert(number));
    }
}
