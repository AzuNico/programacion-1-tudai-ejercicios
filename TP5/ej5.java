public class ej5 {
    public static char[] arr = new char[10];

    public static void main(String[] args) {
        Utilities.cargar_arreglo_aleatorio_char(arr);
        Utilities.imprimir_arreglo_char(arr);
        invertirArreglo(arr);

    }

    public static void invertirArreglo(char[] arr) {

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}
