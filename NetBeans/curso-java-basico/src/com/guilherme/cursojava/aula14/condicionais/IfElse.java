
package com.guilherme.cursojava.aula14.condicionais;

import java.util.Scanner;


public class IfElse {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int count = 0;
        
        /*
        while (count < 10){
        System.out.println("Digite sua idade");
        
        int idade = scan.nextInt();
        
        if (idade >= 18){
            System.out.println("É maior de idade");
          
        } else {
            System.out.println("É menor de idade");
        }
        count++;
        }
        */
        // barato <= 10
        // 10 < valor < 15 - pedir desconto
        //15 < valor 17 - pesquisar mais 
        // >= 17 - muito caro  
        
        while (true){
            
            System.out.println("Digite o valor do item");
            
            double valor = scan.nextDouble();
            
            if (valor <=10){
                System.out.println("Está barato, pode comprar");
            } else if (valor > 10 && valor < 15) {
                System.out.println("Você pode pedir um desconto");
            } else if (valor >= 15 && valor < 17 ) {
                System.out.println("Você precisa pesquisar mais");
            } else {
                System.out.println("Está muito caro");
                break;
            }
            
            
        }
        
        
    }
}
