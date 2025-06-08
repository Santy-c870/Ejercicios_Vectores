import java.util.Scanner;

public class Ejercicio_13 {
    /*
     * Leer 10 enteros. Guardar en otra tabla los elementos pares de la primera, y a continuación los elementos impares. 
     * Trabajeremos con los indices.
     */
    public static void main(String[] args) {
        Scanner tecla= new Scanner(System.in);
        int t[] = new int[10];
        int par[] = new int[5];
        int impar[] = new int[5];

        // Leer los valores
        for (int i = 0; i < 10; i++) {
            System.out.print("Introduzca un número: ");
            t[i] = tecla.nextInt();
        }

        // Clasificar por índice
        for (int i = 0; i < 10; i += 2)
            par[i / 2] = t[i];

        for (int i = 1; i < 10; i += 2)
            impar[i / 2] = t[i];

        // Mostrar resultados
        System.out.println("\nTabla índice par:");
        for (int i = 0; i < 5; i++)
            System.out.println(par[i]);

        System.out.println("Tabla índice impar:");
        for (int i = 0; i < 5; i++)
            System.out.println(impar[i]);
    }



}
