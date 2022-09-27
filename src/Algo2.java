import java.util.*;

public class Algo2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el número: ");

        double x = entrada.nextDouble();

        if (x <= 0) {

            x = x * x;

            if (x > 0) {
                System.out.println("Felicidades tilin");
            }

        } else if (x > 0) {
            System.out.println("Felicidades tilina");
        }

    }
}
