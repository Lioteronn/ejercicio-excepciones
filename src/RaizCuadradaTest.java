import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RaizCuadradaTest {

    // Test con valores de entrada válidos
    @ParameterizedTest
    @CsvFileSource(resources = "csv/ValoresValidos.csv", numLinesToSkip = 1, delimiter = ';')
    void raizCuadrada(double numero, double indice, double resultadoEsperado) {
        assertEquals(String.valueOf(resultadoEsperado), Main.raizCuadrada(numero, indice));
    }

    // Test con valores de entrada inválidos
    @ParameterizedTest
    @CsvFileSource(resources = "csv/ValoresInvalidos.csv", numLinesToSkip = 1, delimiter = ';')
    void raizCuadradaExcepcion(double numero, double indice, String resultadoEsperado) {
        assertEquals(String.valueOf(resultadoEsperado), Main.raizCuadrada(numero, indice));
    }
}