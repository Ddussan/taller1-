/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Scanner;
public class Ejercicio3 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner read = new Scanner(System.in);
        System.out.println("Digite un numero");
        double number = read .nextDouble();
        if(number % 2 == 0){
            System.out.println("El numero digitado es par");
        }else{
            System.out.println("El numero digitado es impar");
        }
        
         
        
        
    }
    
}
