/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.cursojava.aula19.labs;

import com.guilherme.cursojava.aula17.labs.*;
import com.guilherme.cursojava.aula15.labs.*;
import com.guilherme.cursojava.aula13.labs.*;

/**
 *
 * @author Gui e Di
 */
public class Exercicio29 {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        
        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[20];
        
        
        for (int i = 0; i < vetorA.length; i++){
            System.out.println("Digite o valor da posição " + i);
            vetorA[i] = scan.nextInt();    
            vetorC[i] = vetorA[i];
        }
        
        for (int i = 0, j = (vetorA.length-1); i < vetorA.length; i++, j--){
            vetorB[i] = vetorA[j];
        }
        
        for (int i = 0, j = 10; i < vetorB.length; i++, j++){    
            vetorC[j] = vetorB[i];
        }
        
        System.out.println("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++){
            System.out.print(vetorA[i]+" ");
        }
        System.out.println();
        System.out.println("Vetor B = ");
        for (int i = 0; i < vetorB.length; i++){
            System.out.print(vetorB[i]+" ");
        }
        
        System.out.println();
        System.out.println("Vetor C = ");
        for (int i = 0; i < vetorC.length; i++){
            System.out.print(vetorC[i]+" ");
        }
    }
    
}
