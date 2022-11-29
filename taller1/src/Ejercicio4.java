/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Scanner;
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner read = new Scanner(System.in);
        System.out.println("Digite el primer numero");
        double numb1 = read.nextDouble();
        System.out.println("Digite el segundo numero");
        double numb2 = read.nextDouble();
        if (numb1 < numb2){
            System.out.println("el numero mayor es el segundo");
        }else{
            System.out.println("el numero mayor es el primero");
        }
       
    }
    
}
