import java.util.Scanner;

public class Ejercicio_9 {
    /*
     *  Desplazar N posiciones (N es introducido por el usuario).
     */

    public static void main(String[] args) {
        Scanner tecla= new Scanner(System.in);
        int t[] = new int[10];
        int ultimo;
        int n;

        // Leer la tabla
        for (int i = 0; i < 10; i++) {
            System.out.print("Introduzca número: ");
            t[i] = tecla.nextInt();
        }

        // Preguntar cuántas posiciones desplazar
        System.out.print("Posiciones a desplazar: ");
        n = tecla.nextInt();

        // Asegurarse de que n esté en el rango [0, 10)
        n = n % 10;

        // Rotar n veces a la derecha
        for (int vueltas = 1; vueltas <= n; vueltas++) {
            ultimo = t[9]; // Guardar el último elemento
            for (int i = 8; i >= 0; i--) {
                t[i + 1] = t[i]; // Desplazar hacia la derecha
            }
            t[0] = ultimo; // Poner el último al principio
        }

        // Mostrar resultado
        System.out.println("La tabla queda:");
        for (int i = 0; i < 10; i++) {
            System.out.println(t[i]);
        }

    }


}
