package com.guilherme.cursojava.aula68.runnable;

public class Teste {

    public static void main(String[] args) {

        MinhaThreadRunnable thread1 = new MinhaThreadRunnable("#1", 888);
        //Thread t1 = new Thread(thread1);
        //t1.start();

        MinhaThreadRunnable thread2 = new MinhaThreadRunnable("#2", 555);

        MinhaThreadRunnable thread3 = new MinhaThreadRunnable("#3", 1111);
    }

}
 