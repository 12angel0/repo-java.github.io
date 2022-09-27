package pracs;

public class Prac_Switch {
    public static void main(String[] args) {

        int x = 5;

        switch (x) {
            case 5:
                System.out.println("La x vale " + x + ".");
                break;
            case 10:
                System.out.println("La x vale " + x + ".");
                break;
            default:
                System.out.println("El valor " + x + " no esta en el programa.");
                break;
        }
    }
}
