/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Scanner;
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
        System.out.println("Digite la temperatura(en Celsius)");
        double celsius = read.nextDouble();
        System.out.println("La temperatura en Fahrenheit es");
        double fahrenheit = (celsius * 1.8)+ 32;
        System.out.println(fahrenheit);
            
        
    }
    
}
