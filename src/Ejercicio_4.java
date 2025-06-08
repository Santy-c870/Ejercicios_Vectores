import java.util.Scanner;
public class Ejercicio_4 {
    /*
     *  Leer por teclado dos tablas de 10 números enteros 
     * y mezclarlas en una tercera de la forma: 
     * el 1º de A, el 1º de B
     * el 2º de A, el 2º de B, etc.
     */
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        int a[], b[], c[];
        int i, j;

        a = new int[10];
        b = new int[10];
        c = new int[20]; // c tiene el doble de tamaño

        // Leer la tabla a
        System.out.println("Leyendo la tabla a:");
        for (i = 0; i < 10; i++) {
            System.out.print("Número a[" + i + "]: ");
            a[i] = tecla.nextInt();
        }

        // Leer la tabla b
        System.out.println("Leyendo la tabla b:");
        for (i = 0; i < 10; i++) {
            System.out.print("Número b[" + i + "]: ");
            b[i] = tecla.nextInt();
        }

        // Intercalar en la tabla c
        j = 0;
        for (i = 0; i < 10; i++) {
            c[j] = a[i];
            j++;
            c[j] = b[i];
            j++;
        }

        // Mostrar la tabla c
        System.out.println("La tabla c queda:");
        for (j = 0; j < 20; j++) {
            System.out.print(c[j] + "  ");
        }

        System.out.println(); // Salto de línea final
    }



}
