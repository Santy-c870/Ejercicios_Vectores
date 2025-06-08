import java.util.Scanner;
public class Ejercicio_5 {
    /*
     *  Leer los datos correspondiente a dos tablas de 12 elementos numéricos, y mezclarlos en una tercera de la forma: 
     * 3 de la tabla A
     * 3 de la B
     * 3 de A
     * 3 de la B, etc.
     */
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        int a[], b[], c[];
        int i, j;

        a = new int[12];
        b = new int[12];
        c = new int[24];

        // Leer la tabla a
        System.out.println("Leyendo la tabla a:");
        for (i = 0; i < 12; i++) {
            System.out.print("Número a[" + i + "]: ");
            a[i] = tecla.nextInt();
        }

        // Leer la tabla b
        System.out.println("Leyendo la tabla b:");
        for (i = 0; i < 12; i++) {
            System.out.print("Número b[" + i + "]: ");
            b[i] = tecla.nextInt();
        }

        // Fusionar bloques de 3 en la tabla c
        j = 0;
        i = 0;
        while (i < 12) {
            // Copiar 3 elementos de a
            for (int k = 0; k < 3; k++) {
                c[j] = a[i + k];
                j++;
            }

            // Copiar 3 elementos de b
            for (int k = 0; k < 3; k++) {
                c[j] = b[i + k];
                j++;
            }

            i += 3; // avanzar al siguiente bloque de 3
        }

        // Mostrar la tabla c
        System.out.println("La tabla c queda:");
        for (j = 0; j < 24; j++) {
            System.out.print(c[j] + "  ");
        }

        System.out.println(); // salto de línea final
    }



}
