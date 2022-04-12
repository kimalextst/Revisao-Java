package br.com.catalisa;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        intervalo();
    }

    public static void intervalo(){
        Scanner leitor = new Scanner(System.in);
        System.out.print("Insira o valor de x: ");
        int x = leitor.nextInt();
        System.out.print("Insira o valor de y: ");
        int y = leitor.nextInt();
        System.out.print("Insira o valor de z: ");
        int z = leitor.nextInt();

        int menorNumero = 0;
        int maiorNumero = 0;

        if (y > x) {
            menorNumero = x;
            maiorNumero = y;
        } else {
            menorNumero = y;
            maiorNumero = x;
        }

        if (z >= menorNumero && z <= maiorNumero) {
            System.out.println(z + " pertence ao intervalo entre " + menorNumero + " e " + maiorNumero);
        } else {
            System.out.println(z + " não pertence ao intervalo entre " + menorNumero + " e " + maiorNumero);
        }
    }
}

/*Crie um algoritmo que leia dois valores (x e y) representando um
intervalo. Em seguida, leia um novo valor (z) e verifique se z pertence
ao intervalo [x, y]*/
