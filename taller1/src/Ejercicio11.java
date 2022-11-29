/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Scanner;
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner read = new Scanner(System.in);
        System.out.println("Digite el valor de el lado  del triangulo");
        double side = read.nextDouble();
        System.out.println("Digite el valor de la base del triangulo");
        double base = read.nextDouble();
        System.out.println("El area del triangulo equilatero es");
        double trianglearea;
        trianglearea = (base * side)/2; 
        System.out.println(+trianglearea);
    }
    
}
