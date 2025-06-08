import java.util.Scanner;

public class Ejercicio_19 {
    /*
     * Escribe un programa en Java que lea un vector de n elementos enteros y un número entero k
     * e imprima el vector rotado k posiciones hacia la derecha.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del vector: ");
        int n = sc.nextInt();

        int[] vector = new int[n];
        System.out.println("Ingrese los elementos:");
        for (int i = 0; i < n; i++) {
            vector[i] = sc.nextInt();
        }

        System.out.print("Ingrese la cantidad de posiciones a rotar: ");
        int k = sc.nextInt();
        k = k % n; // en caso de que k sea mayor que n

        int[] resultado = new int[n];
        for (int i = 0; i < n; i++) {
            resultado[(i + k) % n] = vector[i];
        }

        System.out.println("Vector rotado:");
        for (int num : resultado) {
            System.out.print(num + " ");
        }
    }



}
