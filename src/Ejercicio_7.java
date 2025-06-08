import java.util.Scanner;

public class Ejercicio_7 {
    /*
     * Diseñar una aplicación que declare una tabla de 10 elementos enteros. Leer mediante el teclado 8 números. 
     * Después se debe pedir un número y una posición, insertarlo en la posición indicada, desplazando los que estén detrás.
     */


    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        int t[] = new int[10]; // arreglo de tamaño 10
        int elemento, posicion;

        // Leer 8 números
        System.out.println("Leyendo datos...");
        for (int i = 0; i < 8; i++) {
            System.out.print("Introduzca número: ");
            t[i] = tecla.nextInt();
        }

        // Pedir nuevo elemento y posición
        System.out.print("Nuevo elemento: ");
        elemento = tecla.nextInt();

        System.out.print("Posición donde insertar (de 0 a 8): ");
        posicion = tecla.nextInt();

        // Validación de la posición
        if (posicion < 0 || posicion > 8) {
            System.out.println("Posición inválida. Debe estar entre 0 y 8.");
        } else {
            // Desplazar elementos hacia la derecha desde la posición dada
            for (int i = 7; i >= posicion; i--) {
                t[i + 1] = t[i];
            }

            // Insertar el nuevo elemento
            t[posicion] = elemento;

            // Mostrar el arreglo resultante (9 elementos válidos)
            System.out.println("La tabla queda:");
            for (int i = 0; i < 9; i++) {
                System.out.println(t[i]);
            }
        }

    }



}
