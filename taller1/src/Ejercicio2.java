
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class Ejercicio2 {
  

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
   Scanner read = new Scanner(System.in);
        System.out.println("Digite el numero");
        double number = read.nextDouble();
        if (number<0){
            System.out.println("El numero es negativo");
            
        }else{
            System.out.println("El numero es positivo");
        }
                
    }
    
}
