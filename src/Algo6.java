
import java.util.Scanner;

public class Algo6 {

    public static void main(String[] args) {
        //
        Scanner entrada = new Scanner(System.in);
        double distancia, tiempo, velocidad, vkh;

        System.out.print("ingrese la distancia recorrida: ");
        distancia = entrada.nextDouble();
        System.out.print("ingrese el tiempo: ");
        tiempo = entrada.nextDouble();

        velocidad = distancia / tiempo;
        vkh = (velocidad * 3600) / 1000;
        System.out.println("la velocidad en m/s es: " + velocidad + "\n"
                + "la velocidad en km/h es: " + vkh);
    }

}
