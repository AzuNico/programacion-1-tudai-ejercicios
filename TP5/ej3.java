// Con el mismo arreglo del ejercicio anterior informe por pantalla
// cuantos elementos del mismo están por encima del promedio
// calculado.

public class ej3 {
    public static void main(String[] args) {
        int[] arr = ej2.diezEnteros;
        double promedio = ej2.calcularPromedio(arr);
        System.out.println("La cantidad de números que superan el promedio son:");
        System.out.println(cantidadPorEncimaPromedio(arr, promedio));
    }

    public static int cantidadPorEncimaPromedio(int[] arr, double promedio) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > promedio) {
                count = count + 1;
            }
        }
        return count;
    }
}
