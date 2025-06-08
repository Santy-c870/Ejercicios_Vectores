import java.util.Scanner;

public class Ejercicio_17 {
    /*
     * Ingrese 2 vectores de la misma longitud y realize la suma entre los dos. 
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el tamaño de los vectores: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];
        int[] suma = new int[n];

        System.out.println("Ingrese los elementos del primer vector:");
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "]: ");
            a[i] = sc.nextInt();
        }

        System.out.println("Ingrese los elementos del segundo vector:");
        for (int i = 0; i < n; i++) {
            System.out.print("b[" + i + "]: ");
            b[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            suma[i] = a[i] + b[i];
        }

        System.out.println("Vector suma:");
        for (int i = 0; i < n; i++) {
            System.out.print(suma[i] + " ");
        }
    }


}
