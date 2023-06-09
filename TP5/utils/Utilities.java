import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Utilities {

    public static void cargarArregloEnteros(int[] arrenteros) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {

            for (int pos = 0; pos < arrenteros.length; pos++) {
                System.out.println("Ingrese el entero de la posición " + pos + ": ");

                arrenteros[pos] = Integer.valueOf(entrada.readLine());

            }
        } catch (Exception exc) {
            System.out.println(exc);

        }
    }

    public static void mostrarArregloEnteros(int[] arrenteros) {
        for (int pos = 0; pos < arrenteros.length; pos++) {
            System.out.println("arrenteros[" + pos + "] -> " + arrenteros[pos]);
        }
    }

    // carga de arreglo de int con valores de MINVALOR a MAXVALOR
    public static void cargar_arreglo_aleatorio_int(int[] arr, int min, int max) {
        Random r = new Random();
        for (int pos = 0; pos < arr.length; pos++) {
            arr[pos] = (r.nextInt(max - min + 1) + min);
        }
    }

    // carga de arreglo de char con valores de 'a' a la 'z'
    public static void cargar_arreglo_aleatorio_char(char[] arr) {
        Random r = new Random();
        for (int pos = 0; pos < arr.length; pos++) {
            arr[pos] = (char) (r.nextInt(26) + 'a');
        }
    }

    public static void cargar_arreglo_aleatorio_double(double[] arr, int min, int max) {
        Random r = new Random();
        for (int pos = 0; pos < arr.length; pos++) {
            arr[pos] = ((max - min + 1) * r.nextDouble() + min * 1.0);
        }
    }

    // impresion de arreglo de char
    public static void imprimir_arreglo_char(char[] arr) {
        for (int pos = 0; pos < arr.length; pos++) {
            System.out.println("[" + pos + "]=>: " + arr[pos]);
        }
    }

    // impresion de arreglo de int
    public static void imprimir_arreglo_int(int[] arr) {
        for (int pos = 0; pos < arr.length; pos++) {
            System.out.println("nombre_arreglo[" + pos + "]=>: " + arr[pos]);
        }
    }

    // impresion de arreglo de double
    public static void imprimir_arreglo_double(double[] arr) {
        for (int pos = 0; pos < arr.length; pos++) {
            System.out.println("nombre_arreglo[" + pos + "]=>: " + arr[pos]);
        }
    }

}
