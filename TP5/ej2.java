public class ej2 {
    public static void main(String[] args) {
        int[] diezEnteros = { 2, 41, 5, 1, 78, 3, 22, 14, 25, 62 };
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