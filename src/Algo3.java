
import java.util.Scanner;


/**
 *
 * @author HP
 */
public class Algo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int primeraNota, segundaNota, terceraNota, promedio;
        
        System.out.print("Ingresa la primera nota: ");
        primeraNota = entrada.nextInt();
        
        System.out.print("Ingresa la segunda nota: ");
        segundaNota = entrada.nextInt();
        
        System.out.print("Ingresa la tercera nota: ");
        terceraNota = entrada.nextInt();
        
        promedio = (primeraNota + segundaNota + terceraNota)/3;
        
        System.out.println(promedio);
        
        if (promedio>=17) {
            System.out.print("Sobresaliente");
        } else{
            if((promedio<=17) && (promedio>13)){
                System.out.print("Aprobado"); 
        } else{
                if(promedio<13){
                    System.out.print("Desaprobado");
                }
            }     
         }
    }
}
