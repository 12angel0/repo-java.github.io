
import java.util.Scanner;

public class Algo4 {

    public static void main(String[] args) {

        Scanner entradaT = new Scanner(System.in);
        // este es el primer numero

        System.out.println("Ingrese el primer numero:");
        int N1 = entradaT.nextInt();

        // este es el segundo numero

        System.out.println("Ingrese el segundo numero:");
        int N2 = entradaT.nextInt();

        if (N1 % 2 == 0) {
            System.out.println("El primer numero es par.");
        } else {
            if (N1 % 2 > 0) {
                System.out.println("El primer numero es impar.");
            }
        }

        if (N2 % 2 == 0) {
            System.out.println("El segundo numero es par.");
        } else {
            if (N2 % 2 > 0) {
                System.out.println("El segundo numero es impar.");
            }
        }

    }

}
