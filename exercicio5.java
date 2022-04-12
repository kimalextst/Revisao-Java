package br.com.catalisa;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        diasDaSemana();
    }

    public static void diasDaSemana(){
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o número desejado: ");
        int numeroDesejado = leitor.nextInt();

        if (numeroDesejado == 1){
            System.out.println("\nDia 1 - Domingo");
        } else if (numeroDesejado == 2) {
            System.out.println("\nDia 2 - Segunda");
        } else if (numeroDesejado == 3) {
            System.out.println("\nDia 3 - Terça");
        } else if (numeroDesejado == 4) {
            System.out.println("\nDia 4 - Quarta");
        } else if (numeroDesejado == 5) {
            System.out.println("\nDia 5 - Quinta");
        } else if (numeroDesejado == 6) {
            System.out.println("\nDia 6 - Sexta");
        } else if (numeroDesejado == 7){
            System.out.println("\nDia 7 - Sábado");
        } else {
            System.out.println("\nNúmero inválido. Tente novamente.\n");
            diasDaSemana();
        }
    }
}

/*Escreva um algoritmo que leia um número inteiro (de 1 a 7)
representando o dia da semana e informe o nome do dia
correspondente*/
