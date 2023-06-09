// Hacer un programa que dado un arreglo ya cargado con 10
// enteros, calcule el promedio y lo muestre por la consola.
public class ej2 {
    public static int[] diezEnteros = { 2, 41, 5, 1, 78, 3, 22, 14, 25, 62 };

    public static void main(String[] args) {
        System.out.println(calcularPromedio(diezEnteros));
    }

    public static double calcularPromedio(int[] arr) {
        double promedio = 0, suma = 0;
        for (int i = 0; i < arr.length; i++) {
            suma = suma + arr[i];
        }
        promedio = suma / arr.length;
        return promedio;
    }

}