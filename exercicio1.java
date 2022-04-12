package br.com.catalisa;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        comparacaoNumeros();
    }

    public static void comparacaoNumeros() {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Insira o valor de x: ");
        double x = leitor.nextDouble();
        System.out.print("Insira o valor de y: ");
        double y = leitor.nextDouble();

        if (y == x) {
            System.out.println("X e Y são iguais");
        } else {
            System.out.println("X e Y não são iguais");
        }
    }
}

/*Crie um algoritmo que leia dois valores (x e y) e informe se eles são
iguais*/
