import java.util.*;

public class Algo1 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Escriba la cantidad de grados: ");

        double T = entrada.nextDouble();

        System.out.println("Para convetir a Kelvin presione K y para Fahrenheit F: ");

        char a = entrada.next().charAt(0);

        if ((a == 'K') || (a == 'k')) {
            T = T + 273.15;
            System.out.println("La temperatura en Kelvin es: " + T);
        } else if ((a == 'F') || (a == 'f')) {
            T = (T * 9) / 5 + 32;
            System.out.println("La temperatura en Fahrenheit es: " + T);
        } else {
            System.out.println("No se reconoce la conversión pipipi :(");
        }
    }
}