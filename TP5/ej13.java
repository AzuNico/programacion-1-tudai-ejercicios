import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ej13 {

    public static final int MAX = 10;

    public static void main(String[] args) {
        int[] arr = new int[MAX];

        // int userNumber = -1;
        // while (userNumber != 0) {
        int userNumber = pedirNumero();

        agregarNumero(arr, userNumber);
        ordenarNumeros(arr);
        imprimirArreglo(arr);

        // }

    }

    public static void imprimirArreglo(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + ":" + arr[i]);
        }
    }

    public static int pedirNumero() {
        int userData = 0;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese número: ");
            userData = Integer.valueOf(entrada.readLine());
        } catch (Exception e) {
            System.out.println("no es un nuemro");
        }
        return userData;

    }

    public static int[] ordenarNumeros(int[] arr) {
        for (int i = 0; i < MAX; i++) {

        }
        return arr;
    }

    public static int[] agregarNumero(int[] arr, int num) {
        for (int i = MAX - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = num;
        return arr;
    }

}
