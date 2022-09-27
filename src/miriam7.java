import java.util.Scanner;

public class miriam7 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el producto: ");

        String producto = entrada.next();

        System.out.print("Ingrese el precio: s/.");
        double precio = entrada.nextDouble();

        if (precio >= 1500) {
            precio = precio - (precio * 0.15);
            System.out.println("El producto "+ producto+" cuesta "+ precio);

        } else{
            precio = precio + (precio * (3.25/100));
            System.out.println("El producto "+ producto+" cuesta "+ precio);
        }

    }
}
