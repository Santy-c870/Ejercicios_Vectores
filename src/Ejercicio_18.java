import java.util.Scanner;

public class Ejercicio_18 {
/*
 * Verificar si es un vector palindromo 
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

        boolean esPalindromo = true;
        for (int i = 0; i < n / 2; i++) {
            if (vector[i] != vector[n - 1 - i]) {
                esPalindromo = false;
                break;
            }
        }

        if (esPalindromo) {
            System.out.println("El vector es palíndromo.");
        } else {
            System.out.println("El vector no es palíndromo.");
        }
    }


}
