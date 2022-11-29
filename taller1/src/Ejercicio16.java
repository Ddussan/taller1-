/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Scanner;
public class Ejercicio16 {

    /**
     * Dada las horas trabajadas por un empleado determinar cuánto gana semanalmente y
mensualmente, si el trabajador debe trabajar mínimo 38h semanales y un máximo de 56h.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Digite las horas del trabajador");
        double hours = read.nextDouble();
        
        if((hours>37)&&(hours<57)){
                System.out.println("Digite el valor de la hora(en pesos)");
                double money = read.nextDouble();
                money = money * hours;
                System.out.println("La ganancia del trabajador semanalmente es de"+money);
                double Mmoney = money * 4;
                System.out.println("La ganancia dle trabajado mensualmente es de"+Mmoney);
                
                       
            }else{
            System.out.println("El valor es invalido");
            }   
        }             
        
    }
    

