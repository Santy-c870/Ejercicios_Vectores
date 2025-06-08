import java.util.Scanner;

public class Ejercicio_20 {
/*
 * Escribe un programa en Java que lea un vector de n números enteros (entre 0 y 9) ingresados por el usuario,
 *  y calcule cuántas veces aparece cada número en el vector.
 */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leer el tamaño del vector
        System.out.print("Ingrese el tamaño del vector: ");
        int n = sc.nextInt();

        // Declarar el vector de entrada
        int[] numeros = new int[n];

        // Declarar vector para contar frecuencia (índices 0 al 9)
        int[] frecuencia = new int[10];

        // Leer los números y validar que estén entre 0 y 9
        System.out.println("Ingrese " + n + " números entre 0 y 9:");
        for (int i = 0; i < n; i++) {
            int num;
            do {
                System.out.print("Número " + (i + 1) + ": ");
                num = sc.nextInt();
                if (num < 0 || num > 9) {
                    System.out.println("Número fuera de rango. Intente de nuevo.");
                }
            } while (num < 0 || num > 9);

            numeros[i] = num;
            frecuencia[num]++;
        }

        // Mostrar las frecuencias
        System.out.println("\nFrecuencia de cada número:");
        for (int i = 0; i < frecuencia.length; i++) {
            if (frecuencia[i] > 0) {
                System.out.println("Número " + i + " aparece " + frecuencia[i] + " veces");
            }
        }
    }


}
