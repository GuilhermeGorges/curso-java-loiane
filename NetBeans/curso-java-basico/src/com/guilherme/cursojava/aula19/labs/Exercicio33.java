/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.cursojava.aula19.labs;

import com.guilherme.cursojava.aula15.labs.*;

/**
 *
 * @author Gui e Di
 */
public class Exercicio33 {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        
        int[] vetorA = new int[10];
        boolean primo;
        String msg = "";
        
        for (int i = 0; i < vetorA.length; i++){
            System.out.println("Digite o valor "+ (i+1));
            vetorA[i] = scan.nextInt();
        }
        
        for (int i = 0; i < vetorA.length; i++){
            primo = true;
            for (int j = 2; j<vetorA[i];j++){
                if (vetorA[i]%j == 0){
                    primo = false;
                    break;
                }
            }
            msg = "";
            if (primo){
                msg = " primo.";
            } else {
                msg = " não é primo.";
            }
            
            System.out.println(vetorA[i]+msg);
        }
    }
}