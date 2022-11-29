/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author uestudiantes
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
          Scanner leer = new Scanner(System.in);
     double gasliter;
    
     System.out.println("Ingrese cantidad de galones a comprar");
      double gallons = leer.nextDouble();
     
     gasliter= gallons * 3.785;
          System.out.println("La Cantidad de galones es de:\n"+gallons);
          System.out.println("Los litros totales serían\n"+gasliter);
          System.out.println("El precio total a pagar sería\n"+gasliter*9500);
          System.out.println("El precio por Galon sería 35625\n");
    
  
    }
    
}
