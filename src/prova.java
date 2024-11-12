/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ospite
 */


import java.util.Scanner;
public class prova {

static final int TANTI = 30;
public static void main(String[] args) { 
    
Scanner in = new Scanner(System.in);
String parola;
char[] minuscolo = new char[TANTI];
System.out.print("\nInserisci una parola: ");
parola = in.next();
// trasforma la stringa letta in un array di caratteri for (int x=0; x < parola.length(); x++)
for (int x=0;x<parola.length(); x++){
    minuscolo[x] = parola.charAt(x);
}

// trasforma la parola in minuscolo
for (int x=0; x < parola.length(); x++)
// stringa come oggetto // stringa come array
// legge una stringa
// primo carattere letto
    minuscolo[x] = Character.toLowerCase(minuscolo [x]); // in minuscolo
System.out.print("La parola in minuscolo (array) : ");
// visualizza la parola carattere per carattere
for (int x = 0; x < minuscolo.length; x++)
    System.out.print (minuscolo[x]);
// trasformo da array di caratteri a stringa String parolaMinu = new String(minuscolo);
String parolaMinu = new String(minuscolo);
System.out.print("\nLa parola in minuscolo (oggetto): "); 
System.out.println(parolaMinu);
}
}