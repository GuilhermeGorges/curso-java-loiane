/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.cursojava.aula19.arrays.labs;

/**
 *
 * 
 */
public class Exercicio37 {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        
        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        
        for (int i = 0; i < vetorA.length; i++){
            System.out.println("Digite o valor "+ (i+1));
            vetorA[i] = scan.nextInt();
        }
        
        for (int i = 0; i < vetorA.length; i++){
            vetorB[i] = 1;
            for (int j =1; j <= vetorA[i]; j++ ){
                vetorB[i] *= j;
            }
        }

        System.out.println();
        System.out.println("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++){
            System.out.print(vetorA[i]+" ");
        }
        System.out.println();
        System.out.println("Vetor B = ");
        for (int i = 0; i < vetorB.length; i++){
            System.out.print(vetorB[i]+" ");
        }
    }
    
}
