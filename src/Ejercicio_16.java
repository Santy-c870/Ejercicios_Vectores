import java.util.Scanner;

public class Ejercicio_16 {
    /*
     * Queremos desarrollar una aplicación que nos ayude a gestionar las notas de un centro educativo. 
     * Cada grupo (o clase) está compuesto por 5 alumnos. Se pide leer las notas del primer
     * segundo y tercer trimestre de un grupo. Debemos mostrar al final:
     * la nota media del grupo en cada trimestre, y la media del alumno que se encuentra en la posición N (N se lee por teclado).
     */
    public static void main(String[] args) {
        int primer[], segundo[], tercer[]; // notas de los tres trimestres
        int num, i;
        int suma_primer, suma_segundo, suma_tercer;
        double media_alumno;

        Scanner sc = new Scanner(System.in);

        // Inicialización de arrays
        primer = new int[5];
        segundo = new int[5];
        tercer = new int[5];

        // Lectura de notas del primer trimestre
        System.out.println("Notas del primer trimestre:");
        for (i = 0; i < 5; i++) {
            System.out.print("Alumno (" + i + "): ");
            primer[i] = sc.nextInt();
        }

        // Lectura de notas del segundo trimestre
        System.out.println("Notas del segundo trimestre:");
        for (i = 0; i < 5; i++) {
            System.out.print("Alumno (" + i + "): ");
            segundo[i] = sc.nextInt();
        }

        // Lectura de notas del tercer trimestre
        System.out.println("Notas del tercer trimestre:");
        for (i = 0; i < 5; i++) {
            System.out.print("Alumno (" + i + "): ");
            tercer[i] = sc.nextInt();
        }

        // Cálculo de medias de cada trimestre
        suma_primer = 0;
        suma_segundo = 0;
        suma_tercer = 0;

        for (i = 0; i < 5; i++) {
            suma_primer += primer[i];
            suma_segundo += segundo[i];
            suma_tercer += tercer[i];
        }

        System.out.println("\nMedia primer trimestre: " + (suma_primer / 5.0));
        System.out.println("Media segundo trimestre: " + (suma_segundo / 5.0));
        System.out.println("Media tercer trimestre: " + (suma_tercer / 5.0));
        System.out.println();

        // Pedir el índice del alumno (de 0 a 4)
        System.out.print("Introduzca posición del alumno (de 0 a 4): ");
        num = sc.nextInt();

        if (num >= 0 && num < 5) {
            media_alumno = (primer[num] + segundo[num] + tercer[num]) / 3.0;
            System.out.println("La media del alumno es: " + media_alumno);
        } else {
            System.out.println("Posición no válida. Debe estar entre 0 y 4.");
        }

    }



}
