import java.util.Scanner;
/*
 * Leer 5 números y mostrarlos en el mismo orden introducido
 */
public class Ejercicio_1 {
     public static void main(String[] args) {      
        Scanner tecla= new Scanner(System.in);   
        int t[];
        t = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Introduzca un número: ");
            t[i] = tecla.nextInt(); 
        }
         System.out.println("Los números son:");
        for (int i = 0; i < 5; i++) {
            System.out.println(t[i]);
        }
}
}
