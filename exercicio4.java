package br.com.catalisa;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        multiplicacaoXY();
    }

    public static void multiplicacaoXY(){
        Scanner leitor = new Scanner(System.in);
        System.out.print("Insira o valor de X: ");
        int x = leitor.nextInt();
        System.out.print("Insira o valor de Y: ");
        int y = leitor.nextInt();

        int multiplicacao = x * y;

        System.out.println("\nO resultado da multiplicação entre X e Y é "+multiplicacao);
    }
}

/*Crie um algoritmo que lê dois números inteiros, X e Y, e mostre o
resultado da multiplicação de x por y*/
