package com.guilherme.cursojava.aula52.excecao.labs;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Teste {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Agenda agenda = new Agenda();

        int opcao = 1;

        while (opcao != 3) {
            opcao = obterOpcaoMenu(scan);

            if (opcao == 1) { //Consultar contato
                consultarContato(scan, agenda);
            } else if (opcao == 2) { // Adicionar contato
                adicionarContato(scan, agenda);
            } else if (opcao == 3) { // Exit
                System.exit(0);
            }
        }
    }

    public static void adicionarContato(Scanner scan, Agenda agenda) {
        try {
            System.out.println("Criando um contato, entre com as informações");
            String nome = lerInformacaoString(scan, "Entre com o nome do contato");
            String telefone = lerInformacaoString(scan, "Entre com o telefone do contato");
            String email = lerInformacaoString(scan, "Entre com o email do contato");

            Contato contato = new Contato();
            contato.setNome(nome);
            contato.setEmail(email);
            contato.setTelefone(telefone);

            System.out.println("Contato a ser criado: ");
            System.out.println(contato);

            agenda.adicionarContato(contato);
        } catch (AgendaCheiaExeption e) {
            System.out.println(e.getMessage());

            System.out.println("Contatos da agenda");
            System.out.println(agenda);
        }

    }

    public static void consultarContato(Scanner scan, Agenda agenda) {
        String nomeContato = lerInformacaoString(scan, "Entre com o nome do contato a ser pesquisado");
        try {
            if (agenda.consultaContatoPorNome(nomeContato) >= 0) {
                System.out.println("Contato existe");
            }
        } catch (ContatoNaoExisteExeption e) {
            System.out.println(e.getMessage());
        }
    }

    public static String lerInformacaoString(Scanner scan, String msg) {
        System.out.println(msg);
        String entrada = scan.nextLine();
        return entrada;
    }

    public static int obterOpcaoMenu(Scanner scan) {

        boolean entradaValida = false;
        int opcao = 3;

        while (!entradaValida) {
            System.out.println("Digite a opção desejada:");
            System.out.println("1: Consultar contato");
            System.out.println("2: Adicionar contato");
            System.out.println("3: Sair ");

            try {
                //opcao = scan.nextInt();
                String entrada = scan.nextLine();
                opcao = Integer.parseInt(entrada);

                if (opcao == 1 || opcao == 2 || opcao == 3) {
                    entradaValida = true;
                } else {
                    throw new Exception("Entrada inváldia");
                }
            } catch (Exception e) {
                System.out.println("Entrada inválida, digite novamente\n");
            }
        }

        return opcao;
    }
}
