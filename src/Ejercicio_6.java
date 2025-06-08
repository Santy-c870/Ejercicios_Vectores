import java.util.Scanner;

public class Ejercicio_6 {
    /*
     *  Leer por teclado una serie de 10 números enteros. 
     * La aplicación debe indicarnos si los números están ordenados de forma 
     * a) creciente
     * b) decreciente
     * c) están desordenados.
     */

    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        int numeros[] = new int[10];
        boolean creciente = false, decreciente = false;

        // Leer los números
        System.out.println("Leyendo números:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + i + ": ");
            numeros[i] = tecla.nextInt();
        }

        // Comprobar el orden
        for (int i = 0; i < 9; i++) {
            if (numeros[i] < numeros[i + 1]) {
                creciente = true;
            } else if (numeros[i] > numeros[i + 1]) {
                decreciente = true;
            }
        }

        // Evaluar el resultado
        if (creciente && !decreciente) {
            System.out.println("Serie creciente.");
        } else if (!creciente && decreciente) {
            System.out.println("Serie decreciente.");
        } else if (creciente && decreciente) {
            System.out.println("Serie desordenada.");
        } else {
            System.out.println("Todos los números son iguales.");
        }
    }



}
