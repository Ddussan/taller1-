/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Scanner;
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner read = new Scanner(System.in);
        System.out.println("Digite una distancia(m)");
        double distance = read.nextDouble();
        double kdistance = distance * 1000;
        System.out.println("La distancia en milimetros es"+kdistance);
        double hdistance = distance * 100;
        System.out.println("La distancia en decimetros es"+hdistance);
        double Ddistance = distance * 10;
        System.out.println("La distancia en centimetros es"+Ddistance);
        double ddistance = distance/10;
        System.out.println("La distancia en Decametros es "+ddistance);
        double cdistance = distance/100;
        System.out.println("La distancia en Hectometros es "+cdistance);
        double mdistance = distance/1000;
        System.out.println("La distancia en Kilometros es "+mdistance);
                
                
                
    }
    
}
