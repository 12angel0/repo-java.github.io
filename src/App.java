import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        Scanner entradaT = new Scanner(System.in);

        /*
         * next: Leer una palabra
         * nextLine: Lee una linea completa
         * nextInt: Lee un numero entero
         */

        // Variable

        int radio;
        double PI = 3.14159, perimetro;

        // Leer

        System.out.println("Ingrese el radio:");
        radio = entradaT.nextInt();

        // Proceso

        perimetro = 2 * PI * radio;

        // Escribir

        System.out.println("El radio es:" + radio + "\nY el perimetro es: " + perimetro);

    }
}
