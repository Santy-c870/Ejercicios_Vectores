import java.util.Scanner;

public class Ejercicio_10 {
    /*
     * Leer 5 elementos numéricos que se introducirán ordenados de forma creciente. Éstos los guardaremos en una tabla de tamaño 10. 
     * Leer un número N, e insertarlo en el lugar adecuado para que la tabla continúe ordenada.
     */
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        int t[] = new int[10]; // capacidad para hasta 10 elementos
        int num, sitio_num, j;

        // Leer los 5 números ya ordenados
        for (int i = 0; i < 5; i++) {
            System.out.print("Introduzca número (ordenado crecientemente): ");
            t[i] = tecla.nextInt();
        }

        System.out.println();
        System.out.print("Número a insertar entre los anteriores: ");
        num = tecla.nextInt();

        // Buscar el lugar donde insertar
        sitio_num = 0;
        j = 0;
        while (j < 5 && t[j] < num) {
            sitio_num++;
            j++;
        }

        // Desplazar los elementos para hacer espacio
        for (int i = 4; i >= sitio_num; i--) {
            t[i + 1] = t[i];
        }

        // Insertar el nuevo número
        t[sitio_num] = num;

        // Imprimir el nuevo arreglo ordenado
        System.out.println("La nueva serie ordenada queda: ");
        for (int i = 0; i < 6; i++) {
            System.out.println(t[i]);
        }
    }


}
