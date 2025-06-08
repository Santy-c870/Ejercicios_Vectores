import java.util.Scanner;
/*
 *  Leer 5 números por teclado y a continuación realizar la
 *  a) media de los números positivos, 
 *  b) la media de los negativos 
 *  c) contar el número de ceros.
 */
public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t[] = new int[5];
        int suma_pos = 0, cont_pos = 0;
        int suma_neg = 0, cont_neg = 0;
        int cont_cero = 0;

        // Leer los datos
        for (int i = 0; i < 5; i++) {
            System.out.print("Introduzca un número: ");
            t[i] = sc.nextInt();
        }

        // Procesar los datos
        for (int i = 0; i < 5; i++) {
            if (t[i] == 0) {
                cont_cero++;
            } else {
                if (t[i] > 0) {
                    suma_pos += t[i];
                    cont_pos++;
                } else {
                    suma_neg += t[i];
                    cont_neg++;
                }
            }
        }

        // Mostrar resultados
        if (cont_pos == 0)
            System.out.println("No se puede realizar la media de números positivos");
        else
            System.out.println("La media de los positivos: " + (float) suma_pos / cont_pos);

        if (cont_neg == 0)
            System.out.println("No se puede realizar la media de números negativos");
        else
            System.out.println("La media de los negativos: " + (float) suma_neg / cont_neg);

        System.out.println("La cantidad de ceros es: " + cont_cero);

    }
}
