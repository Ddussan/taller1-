/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/** 
 *
 *  Dado dos fracciones ingresadas por el usuario, determinar si son fracciones equivalentes.
    Dos fracciones son equivalentes cuando:

 * @author ASUS
 */
import java.util.Scanner;
public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
         public static void main(String[] args) {
             Scanner read = new Scanner(System.in);
        System.out.println("Digite la primer fracción");
        double fraccion1 = read.nextDouble();
             System.out.println("Digite la segunda fracción");
             double fraccion2 = read.nextDouble();
             if ((fraccion1 % 2 ==0)&&(fraccion2 % 2 ==0)){ 
                 System.out.println("Las fracciones son equivalentes");
                 
             }
        
    }
    
}
