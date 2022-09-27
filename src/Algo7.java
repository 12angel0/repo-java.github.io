
import java.util.Scanner;


/**
 *
 * @author HP
 */
public class Algo7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int primerNumero, segundoNumero;
        
        System.out.print("Ingresa el primer numero: ");
        primerNumero = entrada.nextInt();
        
        System.out.print("Ingresa el segundo numero: ");
        segundoNumero = entrada.nextInt();
        
        if (primerNumero == segundoNumero){
            System.out.println(primerNumero + segundoNumero);
        } else{
            if(primerNumero>segundoNumero){
                System.out.println(primerNumero - segundoNumero);
            } else{
                System.out.println(primerNumero * segundoNumero);
            }
        }
        
    }
    
}
