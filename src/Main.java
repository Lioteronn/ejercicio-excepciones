import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

    }

    public static String raizCuadrada(double numero, double indice) throws ExcepcionNumero {
        double resultado;

        try {
            if (indice < 0) {
                throw new ExcepcionNumero("Error: El indice '" + indice + "' no puede ser negativo.");
            } else if (indice == 0) {
                throw new ExcepcionNumero("Error: El índice no puede ser 0.");
            } else if (indice > Double.MAX_VALUE) {
                throw new ExcepcionNumero("Error: El índice excede el tamaño máximo de un número.");
            } else if (numero > Double.MAX_VALUE) {
                throw new ExcepcionNumero("Error: El número excede el tamaño máximo de un número.");
            } else if (indice % 1 != 0) {
                throw new ExcepcionNumero("Error: El índice '" + indice + "' no puede ser un número decimal.");
            } else if (numero < 0 && indice % 2 == 0) {
                throw new ExcepcionNumero("Error: El número no puede ser negativo si el índice es par.");
            }

        } catch (ExcepcionNumero e) {
            return e.getMessage();
        } catch (NumberFormatException e) {
            return "Error: El valor introducido no es un número.";
        } finally {
            scanner.close();
        }

        if (numero < 0 && indice % 2 != 0) {
            numero = Math.abs(numero);
            resultado = Math.pow(numero, 1 / indice) * -1;
        } else {
            resultado = Math.pow(numero, 1 / indice);
        }

        return String.valueOf(resultado);
    }
}