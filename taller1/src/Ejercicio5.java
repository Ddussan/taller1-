/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Scanner;
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner read = new Scanner(System.in);
        System.out.println("Digite las notas del estudiante");
        System.out.println("Digite la primer nota");
         double number1 = read.nextDouble();
         System.out.println("La primer nota es"+number1);
         System.out.println("Digite la segunda nota");
         double number2 = read.nextDouble();
         System.out.println("La primer nota es"+number2);
         System.out.println("Digite la tercer nota");
         double number3 = read.nextDouble();
         System.out.println("La primer nota es"+number3);
         System.out.println("digite la cuarta nota");
         double number4 = read.nextDouble();
         System.out.println("La primer nota es"+number4);
         double promedio = (number1 + number2 + number3 + number4)/4;
         System.out.println("El promedio del estudiante es"+promedio);
           
        
              
    }
    
}
