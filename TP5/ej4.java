// Buscar un elemento en un arreglo de caracteres ya cargado de
// tamaño 10 y mostrar la/s posición/es del elemento, en caso de no
// estar indicarlo también.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ej4 {
    public static final char[] caracteres = { 'N', 'i', 'c', 'o', 'l', 'a', 's', 'A', 'p', 'p' };

    public static void main(String[] args) {
        imprimirFrase();
        encontrarPoscionCaracter();
    }

    public static void imprimirFrase() {
        String frase = "";
        for (int i = 0; i < caracteres.length; i++) {
            frase = frase + caracteres[i];
        }
        System.out.println("La frase es: ");
        System.out.println(frase);

    }

    public static void encontrarPoscionCaracter() {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        char characterToFind = ' ';
        boolean hasCharacter = false;
        do {
            try {
                System.out.println("Ingrese una letra y buscaremos su posición en la frase.");
                characterToFind = entrada.readLine().charAt(0);

            } catch (Exception e) {
                System.out.println(e);
            }

            for (int i = 0; i < caracteres.length; i++) {
                if (characterToFind == caracteres[i]) {
                    hasCharacter = true;
                    System.out.println("\nLa letra se encuentra en la posición: " + i + "." + "\n\n");
                    System.out.println("-------- FIN DEL PROGRAMA ---------\n");
                }
            }

            if (!hasCharacter) {
                System.out.println("La letra ingresada no se encuentra en la frase.");
                System.out.println("Para salir del programa ingrese una letra que pertenezca a la frase.");

            }

        } while (!hasCharacter);

    }
}
