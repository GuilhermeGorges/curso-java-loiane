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
public class Exercicio02 {
    public static void main(String[] args) {
        int[] a = new int[8];
        int[] b = new int[a.length];
        
        for (int i = 0; i < a.length; i++){
            a[i] = i;
            b[i] = (a[i]*2);
        }
        
        
        for (int i = 0; i < a.length; i++){
        System.out.print("A = "+a[i]);
        System.out.print(" B = "+b[i]+"\n");
        }
    }
}
