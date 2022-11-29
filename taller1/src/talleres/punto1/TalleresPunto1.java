

package talleres.punto1;




import java.util.Scanner;
public class TalleresPunto1 {

   
      
    public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
     /**
     * @param args the command line arguments
     */
    
    
        
        System.out.println ("Escriba el primer numero");
        double num1 = read.nextDouble();
        System.out.println("Escribe el segundo numero");
        double num2 = read.nextDouble(); 
        double suma= num1 + num2;
        System.out.println("La suma de los Numeros es"+suma);
        double resta= num1 - num2;
        System.out.println("La resta de los Numeros es"+resta);
        double multiplicacion= num1 * num2;
        System.out.println("La multiplicación de los Numeros es"+multiplicacion);
        double division= num1/num2;
        System.out.println("La Division de los Numeros es "+division);
        
    }
    
    
   
    
}
