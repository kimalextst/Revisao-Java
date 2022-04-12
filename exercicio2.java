package br.com.catalisa;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        reajusteSalario();
    }

    public static void reajusteSalario(){
        Scanner leitor = new Scanner(System.in);

        System.out.print("Insira o valor do salário: R$");
        double salario = leitor.nextDouble();

        double salarioReajustado = salario - (salario * 0.07);

        System.out.println("\nO valor do salário reajustado é: R$"+salarioReajustado);
    }
}

/*Crie um algoritmo que lê o salário de um funcionário, reajusta o
salário em 7% e mostra o resultado*/
