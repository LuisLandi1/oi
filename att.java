/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author ALUNO
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       System.out.println("Digite a Primeira Nota: ");
       float a = s.nextFloat();
       System.out.println("Digite a Segunda Nota: ");
       float b = s.nextFloat();
       System.out.println("Digite a Frequencia: ");
        float presensa = s.nextFloat();
       float media = (a+b)/2;
       String res = "aprovado";
       if(media < 6 || presensa <75)
           res = "reprovado";
       System.out.println("media," + media+ ",Com a Frequencia de,"+ presensa +  ",resultado," + res);
       
       
    }
    
    
    
}


