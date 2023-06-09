import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ej1 {
    public static final int MAX = 15;

    public static void main(String[] args) {
        int[] arr = new int[MAX];
        cargarNumerosArreglo(arr);
        imprimirArreglo(arr);
    }

    public static void cargarNumerosArreglo(int[] arr) {
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            for (int i = 0; i < MAX; i++) {

                System.out.println("Ingrese número entre 1 y 12: ");
                System.out.println("Quedan " + (MAX - i) + " posiciones por completar");
                int userNumber = Integer.valueOf(entrada.readLine());
                while (userNumber > 12 | userNumber < 1) {
                    System.out.println("Por favor, ingrese un número entre 1 y 12:");
                    System.out.println("Quedan " + (MAX - i) + " posiciones por completar");
                    userNumber = Integer.valueOf(entrada.readLine());
                }
                arr[i] = userNumber;
            }

        } catch (Exception e) {
            System.out.println("Error => " + e);
        }

    }

    public static void imprimirArreglo(int[] arr) {
        String arrToShow = "[";
        for (int i = 0; i < MAX; i++) {
            if (i == MAX - 1) {
                arrToShow = arrToShow + arr[i] + "]";

            } else {
                arrToShow = arrToShow + arr[i] + ",";
            }

        }
        System.out.println(arrToShow);

    }
}
