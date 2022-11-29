/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Scanner;
public class Ejercicio6 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Digite un numero");
        double number = read.nextDouble();
        double square = number * number;
        System.out.println("El cuadrado del numero es"+square);
        double cube = number * number * number;
        System.out.println("El cubo del numero es"+cube);
       
       
       
    }
    
}
