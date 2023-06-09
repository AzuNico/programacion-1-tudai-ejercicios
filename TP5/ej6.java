public class ej6 {
    public static int[] arrEnteros = new int[10];

    public static void main(String[] args) {
        Utilities.cargar_arreglo_aleatorio_int(arrEnteros, 10, 20);
        Utilities.mostrarArregloEnteros(arrEnteros);
        int pares = cantidadNumerosParesArreglo(arrEnteros);
        System.out.println("La cantidad de numeros pares es: " + pares);
    }

    public static int cantidadNumerosParesArreglo(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count = count + 1;
            }
        }
        return count;
    }
}
