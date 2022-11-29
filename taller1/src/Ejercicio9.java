/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Scanner;
public class Ejercicio9 {
    

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        System.out.println("Digite el valor (en pesos)");
        double value = read.nextDouble();
        System.out.println("El valor menos el 15% es de:");
        double  minusprice = value - value*0.015;
        System.out.println(+minusprice);
        System.out.println("El valor mas el 15% es de:");
        double plusprice = value + value*0.015;
        System.out.println(+plusprice);
        
    }
    
}
