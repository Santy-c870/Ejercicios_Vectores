import java.util.Scanner;

public class Ejercicio_11 {
    /*
     *  Leer por teclado una tabla de 10 elementos numéricos enteros y una posición (entre 0 y 9).
     *  Eliminar el elemento situado en la posición dada sin dejar huecos.
     */
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        int t[] = new int[10];
        int posicion;

        // Leer los 10 números
        for (int i = 0; i < 10; i++) {
            System.out.print("Elemento (" + i + "): ");
            t[i] = tecla.nextInt();
        }

        System.out.println();
        // Leer la posición a eliminar
        System.out.print("Posición a eliminar (0 a 9): ");
        posicion = tecla.nextInt();

        // Validar que la posición sea válida
        if (posicion < 0 || posicion >= 10) {
            System.out.println("Posición inválida. Debe estar entre 0 y 9.");
            return;
        }

        // Desplazar los elementos a la izquierda desde la posición
        for (int i = posicion; i < 9; i++) {
            t[i] = t[i + 1];
        }

        // Mostrar los 9 elementos restantes
        System.out.println("La tabla queda: ");
        for (int i = 0; i < 9; i++) {
            System.out.println(t[i]);
        }
    }



}
