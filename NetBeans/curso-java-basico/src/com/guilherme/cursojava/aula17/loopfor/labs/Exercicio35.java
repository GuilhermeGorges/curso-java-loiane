/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.cursojava.aula17.loopfor.labs;

import java.util.Scanner;

/**
 *
 * 
 */
public class Exercicio35 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int somai = 0; 
        int somaj = 0;
        
        System.out.print("S = ");
        for (int i = 1, j = 1; i <= 5; i++, j+=2){
            System.out.print(i + "/"+ j + " + ");
            somai += i;
            somaj += j;
        }
        System.out.println("");
        System.out.println("Soma j = " + somaj);
        System.out.println("Soma i = " + somai);
    }
}
