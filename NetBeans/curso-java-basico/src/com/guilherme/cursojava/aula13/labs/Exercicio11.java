/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.cursojava.aula13.labs;

import java.util.Scanner;

/**
 *
 * @author Gui e Di
 */
public class Exercicio11 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite dois numeros inteiros e um real: ");
        
        int first = scan.nextInt();
        int second = scan.nextInt();
        float third = scan.nextFloat();
        
        double answerA = (first * first) * (second / 2);
        double answerB = (first * 3) + third;
        double answerC = third * third * third;
        
        System.out.println("Resposta A: "+ answerA);
        System.out.println("Resposta B: "+ answerB);
        System.out.println("Resposta C: "+ answerC);
        
    }
}
