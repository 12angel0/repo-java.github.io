import java.util.Scanner;

public class Proyecto {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("¿Desea iniciar sesion o registrarse?\n  s <-- Iniciar Sesión\n  r <-- Registrarte");

        char inicio = entrada.next().charAt(0);

        String usuario, Contraseña, repetirContraseña;

        if (inicio == 'S' || inicio == 's') {
            System.out.println("Ingrese su usuario: ");

            usuario = entrada.next();

            System.out.println("Ingrese su Contraseña: ");

            Contraseña = entrada.next();

            System.out.println("\n -----------------------------------");
            System.out.println("|     Hola de nuevo " + usuario + " :3     |");
            System.out.println(" -----------------------------------\n");

        } else if (inicio == 'R' || inicio == 'r') {
            System.out.println("Ingrese su usuario:");
            usuario = entrada.next();

            System.out.println("Ingrese la Contraseña: (mayor a 8 dígitos)");
            Contraseña = entrada.next();

            System.out.println("Repetir la Contraseña: ");
            repetirContraseña = entrada.next();

            if (Contraseña.length() > 7 && (repetirContraseña.equals(Contraseña))) {
                System.out.println(" ------------------------------------------------");
                System.out.println("|     Un " + usuario + " salvaje se acaba de unir :3      |");
                System.out.println(" ------------------------------------------------\n");
            } else {
                System.out.println(
                        "Se registro con una Contraseña incorrecta o las Contraseñas no coinciden, vuelva a intentarlo.");
                System.exit(0);
            }
        } else {
            System.out.println("Ingreso una opción incorrecta... ");
            System.exit(0);
        }

        System.out.println("Ingrese el nombre con el que se quiere registrar:");

        String name = entrada.next();
        
        System.out.println("Ingrese el dia de su reservacion: \n** Por motivos de fiestas no contamos con reservaciones los dias 1, 12, 16, 25, 30 **");

        System.out.print("INGRESE EL DIA -->");
        int dia = entrada.nextInt();

        switch(dia){
            case 2, 3, 4, 5, 6, 7, 8,
            9, 10, 11, 13, 14, 15,
            17, 18, 19, 20, 21, 22, 23, 24, 
            26, 27, 28, 29:
            System.out.println(dia);
            break;

            default: 
            System.out.println("El dia que ingreso no esta permitido.");
            System.exit(0);
            break;
        }

        System.out.print("Genial "+name + " ");

        while (dia < 1000) { 

            System.out.println("ingrese el lugar de residencia: ");

            System.out.println("Tenemos disponibles los hoteles...\n  1 -> VPX Hotel & Bungalows\n  2 -> Sheraton Lima Historic Center\n  3 -> The Westin Lima Hotel & Convention Center");

            int lugar = entrada.nextInt();

            if (lugar == 1) {
                System.out.println("ingrese el tipo de habitación que quiere: \n  1 <- Habitación doble estandar - $300\n  2 <- Habitacion clasica - $150\n  3 <- Habitacion doble Deluxe - $430\n  4 <- Volver");

                int hab = entrada.nextInt();

                System.out.println("\n---------------------------------------------");
                System.out.println("Usted escogio la opcion --> "+hab);
                System.out.println("---------------------------------------------" + "\n");

                if (hab == 1) {
                    System.out.println("\nLa Habitacion doble estandar en el hotel VPX Hotel & Bungalows, para el dia "+ dia +" esta registrada con exito!\nPrecio total = $300\n");
                    dia = 1000;
                } else if(hab == 2){
                    System.out.println("\nLa Habitacion clasica en el hotel VPX Hotel & Bungalows, para el dia "+ dia +" esta registrada con exito!\nPrecio total = $150\n");
                    dia = 1000;
                } else if(hab == 3){
                    System.out.println("\nLa Habitacion doble Deluxe en el hotel VPX Hotel & Bungalows, para el dia "+ dia +" esta registrada con exito!\nPrecio total = $430\n");
                    dia = 1000;
                } else if(hab == 4){
                    dia++;
                } else{
                    System.exit(0);
                }
            } 
            else if (lugar == 2) {
                System.out.println("ingrese el tipo de habitación que quiere: \n  1 <- Habitación doble estandar - $250\n  2 <- Habitacion clasica - $180\n  3 <- Habitacion doble Deluxe - $380\n  4 <- Volver");

                int hab2 = entrada.nextInt();

                System.out.println("\n---------------------------------------------");
                System.out.println("Usted escogio la opcion --> "+hab2);
                System.out.println("---------------------------------------------" + "\n");

                if (hab2 == 1) {
                    System.out.println("\nLa Habitacion doble estandar en el hotel Sheraton Lima Historic Center, para el dia "+ dia +" esta registrada con exito!\nPrecio total = $250\n");
                    dia = 1000;
                } else if(hab2 == 2){
                    System.out.println("\nLa Habitacion clasica en el hotel Sheraton Lima Historic Center, para el dia "+ dia +" esta registrada con exito!\nPrecio total = $180\n");
                    dia = 1000;
                } else if(hab2 == 3){
                    System.out.println("\nLa Habitacion doble Deluxe en el hotel Sheraton Lima Historic Center, para el dia "+ dia +" esta registrada con exito!\nPrecio total = $380\n");
                    dia = 1000;
                } else if(hab2 == 4){
                    dia++;
                } else{
                    System.exit(0);
                }
            } else if (lugar == 3) {
                System.out.println("ingrese el tipo de habitación que quiere: \n  1 <- Habitación doble estandar - $350\n  2 <- Habitacion clasica - $240\n  3 <- Habitacion doble Deluxe - $480\n  4 <- Volver");

                int hab3 = entrada.nextInt();

                System.out.println("\n---------------------------------------------");
                System.out.println("Usted escogio la opcion --> "+hab3);
                System.out.println("---------------------------------------------" + "\n");

                    if(hab3 == 1){
                    System.out.println("\nLa Habitacion doble estandar en el hotel The Westin Lima Hotel & Convention Center, para el dia "+ dia +" esta registrada con exito!\nPrecio total = $350\n");
                    dia = 1000;
                    } else if(hab3 == 2){
                    System.out.println("\nLa Habitacion clasica en el hotel The Westin Lima Hotel & Convention Center, para el dia "+ dia +" esta registrada con exito!\nPrecio total = $240\n");
                    dia = 1000;
                    } else if(hab3 == 3){
                    System.out.println("\nLa Habitacion doble Deluxe en el hotel The Westin Lima Hotel & Convention Center, para el dia "+ dia +" esta registrada con exito!\nPrecio total = $480\n");
                    dia = 1000;
                    } else if(hab3 == 4){
                        dia++;
                    } else{
                        System.exit(0);
                    }
            }
        }
    }
}