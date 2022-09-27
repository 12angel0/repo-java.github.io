import java.util.*;

public class Algo8 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double DOL = 3.88, EUR = 4.38;

        System.out.println("Buenas me indica su nombre a continuación: ");

        String nombreCliente = entrada.nextLine();

        System.out.println(
                "ok " + nombreCliente + ", ahora ingresa la cantidad de dinero en soles que quiere cambiar: ");

        double cant = entrada.nextInt();

        System.out.println("Ahora ingresa el tipo de moneda al que quiere cambiar:");

        String tipoDinero = entrada.next();

        // if (("dolares".equals(tipoDinero)) || ("Dolares".equals(tipoDinero))) {
        // cant = cant / DOL;
        // System.out.println("la cantida de tu dinero en dolares es: " + cant);
        // } else if (("euros".equals(tipoDinero)) || ("Euros".equals(tipoDinero))) {
        // cant = cant / EUR;
        // System.out.println("la cantida de tu dinero en euros es: " + cant);
        // }

        switch (tipoDinero) {
            case "dolares", "Dolares":
                cant = cant / DOL;
                System.out.println("la cantida de tu dinero en dolares es: " + cant);
                break;
            case "euros", "Euros":
                cant = cant / EUR;
                System.out.println("la cantida de tu dinero en euros es: " + cant);
                break;
            default:
                System.out.println("Ingreso un tipo de monera invalido \nrevise otra vez :(");
                break;
        }
    }
}
