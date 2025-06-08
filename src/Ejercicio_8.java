import java.util.Scanner;

public class Ejercicio_8 {
    /*
     *  Crear un programa que lea por teclado una tabla de 10 números enteros y la desplace una posición hacia abajo:
     *   el primero pasa a ser el segundo
     *   el segundo pasa a ser el tercero y así sucesivamente. El último pasa a ser el primero.
     */
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        int t[] = new int[10];
        int ultimo;

        // Leer la tabla
        for (int i = 0; i < 10; i++) {
            System.out.print("Introduzca número: ");
            t[i] = tecla.nextInt();
        }

        // Guardamos el último elemento
        ultimo = t[9];

        // Desplazar los elementos hacia la derecha
        for (int i = 8; i >= 0; i--) {
            t[i + 1] = t[i];
        }

        // Colocar el último en la primera posición
        t[0] = ultimo;

        // Mostrar el resultado
        System.out.println("La tabla queda:");
        for (int i = 0; i < 10; i++) {
            System.out.println(t[i]);
        }


    }



}
