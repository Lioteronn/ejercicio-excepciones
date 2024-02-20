import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RaizCuadradaTest {

    // Test con valores de entrada válidos
    @ParameterizedTest
    @CsvSource({"4, 2, 2", "9, 2, 3", "16, 2, 4", "25, 2, 5", "36, 2, 6", "49, 2, 7", "64, 2, 8", "81, 2, 9", "100, 2, 10"})
    void raizCuadrada(double numero, double indice, double resultadoEsperado) {
        assertEquals(String.valueOf(resultadoEsperado), Main.raizCuadrada(numero, indice));
    }

    // Test con valores de entrada inválidos
    @ParameterizedTest
    @CsvSource({"-4, 2, Error: El número no puede ser negativo si el índice es par.",
            "4, -2, Error: El indice '-2.0' no puede ser negativo.",
            "4, 0, Error: El índice no puede ser 0.",
            "4, 2.5, Error: El índice '2.5' no puede ser un número decimal.",
            "-2, 100 , Error: El número no puede ser negativo si el índice es par.",
            "1.7976931348623157E+328, 2, Error: El número excede el tamaño máximo de un número.",
            "2, 1.7976931348623157E+328, Error: El índice excede el tamaño máximo de un número."})
    void raizCuadradaExcepcion(double numero, double indice, String resultadoEsperado) {
        assertEquals(String.valueOf(resultadoEsperado), Main.raizCuadrada(numero, indice));
    }
}