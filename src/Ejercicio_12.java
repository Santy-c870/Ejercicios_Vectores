import java.util.Scanner;

public class Ejercicio_12 {
/*
 * Leer 10 enteros. Guardar en otra tabla los elementos pares de la primera, y a continuación los elementos impares. 
 * Trabajeremos por valores.
 */
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        int t[] = new int[10];
        int cont_par = 0, cont_impar = 0;
        int par[], impar[];

        // Leer los valores
        for (int i = 0; i < 10; i++) {
            System.out.print("Introduzca un número: ");
            t[i] = tecla.nextInt();
        }

        // Contar pares e impares
        for (int i = 0; i < 10; i++) {
            if (t[i] % 2 == 0)
                cont_par++;
            else
                cont_impar++;
        }

        // Crear arrays
        par = new int[cont_par];
        impar = new int[cont_impar];

        // Clasificar los valores
        cont_par = 0;
        cont_impar = 0;
        for (int i = 0; i < 10; i++) {
            if (t[i] % 2 == 0)
                par[cont_par++] = t[i];
            else
                impar[cont_impar++] = t[i];
        }

        // Mostrar resultados
        System.out.println("\nTabla par:");
        for (int i = 0; i < cont_par; i++)
            System.out.println(par[i]);

        System.out.println("Tabla impar:");
        for (int i = 0; i < cont_impar; i++)
            System.out.println(impar[i]);
    }



}
