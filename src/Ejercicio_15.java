import java.util.Scanner;

public class Ejercicio_15 {
    /*
     * Leer 10 enteros ordenados crecientemente. Leer N y buscarlo en la tabla. 
     * Se debe mostrar la posición en que se encuentra. Si no está, indicarlo con un mensaje.
     */
    public static void main(String[] args) {
        int t[] = new int[10];
        int num, j;

        Scanner tecla= new Scanner(System.in);

        // Leer 10 números en orden creciente
        for (int i = 0; i < 10; i++) {
            System.out.print("Introduzca número (orden creciente): ");
            t[i] = tecla.nextInt();
        }

        System.out.println("\nIntroduzca número a buscar: ");
        num = tecla.nextInt();

        j = 0;
        while (j < 10 && t[j] < num) {
            j++;
        }

        // Evaluar el resultado de la búsqueda
        if (j == 10) {
            System.out.println("No encontrado");
        } else {
            if (t[j] == num) {
                System.out.println("Encontrado en la posición " + j);
            } else {
                System.out.println("No encontrado");
            }
        }
    }



}
