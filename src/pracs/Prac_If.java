package pracs;

import java.util.Scanner;

public class Prac_If {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int num1 = entrada.nextInt();
        int num2 = entrada.nextInt();

        if (num1 < num2) {
            System.out.println("El num1 es menor a num2");
            if (num1 == 15) {
                System.out.println("el num1 es igual a 15");
            } else if (num2 == 20) {
                System.out.println("El num2 es igual a 20");
            } else {
                System.out.println("Ambos numeros no estan en la lista");
            }
        } else if (num1 > num2) {
            System.out.println("El num1 es mayor que num2");
        } else {
            System.out.println("El num1 es igual a num2");
        }
    }
}
