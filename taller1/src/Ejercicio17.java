/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Scanner;
public class Ejercicio17 {

    /**
     * Determinar la calificación de un estudiante según la siguiente escala de ponderación:
•    0 y 2.9 la ponderación es Insuficiente.
•    3.0 y 3.5 ponderación es Regular.
•    3.6 y 4.0 ponderación es Bien.
•    4.1 y 4.5 Muy Bien.
•   4.6 y 5.0 es Excelente
        * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Digite la ponderacion final");
        double ponderation = read.nextDouble();
        if ((ponderation>0)&&(ponderation<=2.9)){
        System.out.println("La ponderación es insuficiente");
        
        }
       if ((ponderation>3.0)&&(ponderation<=3.5)){
           System.out.println("La ponderación es regular");
       }
       if ((ponderation>=3.6)&&(ponderation<=4.0)){
           System.out.println("La ponderacion es bien");
       }
       if ((ponderation>=4.1)&&(ponderation<=4.5)){
           System.out.println("La ponderacion es muy bien");
       }
       if ((ponderation>=4.6)&&(ponderation<=5.0)){
           System.out.println("La ponderacion es excelente");
       }
    }
    
}
