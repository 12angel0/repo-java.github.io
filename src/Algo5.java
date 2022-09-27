
import java.util.Scanner;

public class Algo5 {

    public static void main(String[] args) {
        //
        Scanner entrada = new Scanner(System.in);
        //
        System.out.print("introduzca el nombre del trabajador: ");
        String nombre = entrada.nextLine();
        double sueldobasico, sueldototal, bono = 0;
        System.out.print("ingrese el sueldo basico: ");
        sueldobasico = entrada.nextDouble();
        int numerohijos;
        System.out.print("ingrese el numero de hijos que tiene: ");
        numerohijos = entrada.nextInt();
        //
        if (numerohijos > 0) {
            bono = sueldobasico * 0.07;
            System.out.println("su bonificacion es de : " + bono);
        } else {
            System.out.println("no tiene bonificacion");
        }
        sueldototal = sueldobasico + bono;
        System.out.println("el sueldo total es: " + sueldototal);
    }

}
