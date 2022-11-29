/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Scanner;
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner read = new Scanner(System.in);
        System.out.println("Digite el radio del circulo");
        double radius = read.nextDouble();
        System.out.println("El area del circulo es");
        double area; 
                area = (radius * radius) * Math.PI ;
                System.out.println(area);
    }
    
}
