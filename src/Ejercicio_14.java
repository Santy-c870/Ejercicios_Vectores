import java.util.Scanner;

public class Ejercicio_14 {
/*
 *  Leer dos series de 10 enteros, que estarán ordenados crecientemente.
 *  Copiar (fusionar) las dos tablas en una tercera, de forma que sigan ordenados.
 */
    public static void main(String[] args) {
        int a[], b[], c[];
        int i, j, k;

        Scanner sc = new Scanner(System.in);
        a = new int[10];
        b = new int[10];

        // Leemos a
        System.out.println("Datos para a (orden creciente):");
        for (i = 0; i < 10; i++) {
            System.out.print("Introduzca número: ");
            a[i] = sc.nextInt();
        }

        // Leemos b
        System.out.println("\nDatos para b (orden creciente):");
        for (i = 0; i < 10; i++) {
            System.out.print("Introduzca número: ");
            b[i] = sc.nextInt();
        }

        // Creamos c
        c = new int[20];
        i = 0; // índice a
        j = 0; // índice b
        k = 0; // índice c

        // Fusionar ordenadamente
        while (i < 10 && j < 10) {
            if (a[i] < b[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
            }
        }

        // Copiar lo que quede
        while (i < 10) {
            c[k++] = a[i++];
        }

        while (j < 10) {
            c[k++] = b[j++];
        }

        // Mostrar el resultado
        System.out.println("\nMostramos la tabla c:");
        for (i = 0; i < 20; i++) {
            System.out.print(c[i] + " ");
        }
        System.out.println();

        sc.close();
    }



}
