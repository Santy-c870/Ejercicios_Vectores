import java.util.Scanner;
public class Ejercicio_3 {
    /*
     *  Leer 10 números enteros. Debemos mostrarlos en el siguiente orden: 
     * el primero
     * el último 
     * el segundo
     * el penúltimo
     * el tercero,etc
     */
 

    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        int i, t[];
        t = new int[10];

        for (i = 0; i < 10; i++) {
            System.out.print("Introduzca número: ");
            t[i] = tecla.nextInt();
        }

        System.out.println("El resultado es:");
        for (i = 0; i <= 4; i++) {
            System.out.println(t[i]);        // número desde el principio
            System.out.println(t[9 - i]);    // número desde el final
        }

    }



}
