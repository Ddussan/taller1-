/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Scanner;
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
        System.out.println("Digite el valor de los lados");
        double squareside = read.nextDouble();
        double squarearea= squareside * squareside;
        System.out.println("EL area del cuadrado es:"+squarearea);
           
    }
    
}
