/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package siumclass;

/**
 *
 * @author nahio
 */
import java.util.Scanner;
public class SIUMCLASS {

    public void calcolo_a() {
        Scanner scanf = new Scanner(System.in);
        
        System.out.println("Inserisci una frase di senso compiuto ");
        
         String risposta = scanf.nextLine();
        
        char lettera = 'a';
        char Lettera = 'A';
       int A=0;
       int somma=0;
        for(int i=0;i < risposta.length();i++){
            if(risposta.charAt(i) == lettera || risposta.charAt(i) == Lettera){
               System.out.println("A");
            }
        }
        
       
    }
    
    public static void main(String[] args) {
        
      SIUMCLASS calcolo = new SIUMCLASS();
        
        calcolo.calcolo_a();
       
    }
    
}
