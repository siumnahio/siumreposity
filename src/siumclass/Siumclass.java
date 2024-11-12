/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package siumclass;

/**
 *
 * @author ospite
 */

import java.util.Scanner;

public class Siumclass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner myObj = new Scanner(System.in);
         int base;
         int pot;
          System.out.println("Inserisci il valore della base ");
               
              do{
                  base = myObj.nextInt();
              }while(0>base);
          System.out.println("Inserisci il valore dell'esponente ");
              
              do{
                  pot = myObj.nextInt();
              }while(0>pot);
              
           
             int potenza = base;
             for(int i=1;i<pot;i++){
                 potenza = potenza*base;
             }
             
           System.out.println( " Ecco il valore della potenza: ");
           System.out.print(potenza);
    }
    
}
