package br.com.catalisa;

import java.util.Scanner;

public class miniDesafio1 {
    public static void main(String[] args) {
        System.out.println("Bem-vinde a calculadora de dois números!");
        System.out.println("\n------------------------------------\n");
        numeros();
    }
    public static void numeros(){
        Scanner leitor = new Scanner(System.in);
        System.out.print("Insira um número: ");
        double numero1 = leitor.nextDouble();
        System.out.print("Insira mais um número: ");
        double numero2 = leitor.nextDouble();

        System.out.println("\n---------------OPÇÕES---------------\n");
        System.out.println("Se quiser somar esses números, digite 1");
        System.out.println("Se quiser subtrair esses números, digite 2");
        System.out.println("Se quiser multiplicar esses números, digite 3");
        System.out.println("Se quiser dividir esses números, digite 4");
        System.out.println("\n------------------------------------\n");
        int escolha = leitor.nextInt();
        System.out.println("\n------------------------------------\n");

        if (escolha == 1){
            soma(numero1,numero2);
        } else if (escolha == 2) {
            subtracao(numero1,numero2);
        } else if (escolha == 3) {
            multiplicacao(numero1,numero2);
        } else {
            divisao(numero1,numero2);
        }

        System.out.println("\nDeseja sair do programa?");
        System.out.println("\n---------------OPÇÕES---------------\n");
        System.out.println("1 - Sim");
        System.out.println("2 - Não");
        System.out.println("\n------------------------------------\n");
        int escolha2 = leitor.nextInt();

        if (escolha2 == 1) {
            System.exit(0);
        } else {
            System.out.println("\nError: Função não disponivél no momento\n");
        }

    }

    public static void soma(double numero1, double numero2){
        double soma = numero1 + numero2;

        System.out.println("O resultado da soma entre "+numero1+" e "+numero2+" é "+soma);
    }

    public static void subtracao(double numero1, double numero2){
        double subtracao = numero1 - numero2;

        System.out.println("O resultado da subtracao entre "+numero1+" e "+numero2+" é "+subtracao);
    }

    public static void multiplicacao(double numero1, double numero2){
        double multiplicacao = numero1 * numero2;

        System.out.println("O resultado da multiplicacao entre "+numero1+" e "+numero2+" é "+multiplicacao);
    }

    public static void divisao(double numero1, double numero2){
        double divisao = numero1 / numero2;

        System.out.println("O resultado da divisao entre "+numero1+" e "+numero2+" é aproximadamente "+divisao);
    }
}

/* Mini desafio 1

Nesse desafio você terá que desenvolver uma calculadora que vai:

● receber 2 números;
● exibir um menu de operações matemáticas;
● realizar calculo matemático e exibir o resultado
● opção de sair do programa*/