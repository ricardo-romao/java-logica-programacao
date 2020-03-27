package br.com.ciandt.gian73.decisao;

import java.util.Scanner;

public class IfElse {
// O que faz a linha abaixo?
    @SuppressWarnings("resource")
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	System.out.println("Digite o ano de nascimento");
	int anoDeNascimento = sc.nextInt();

	int idade = 1973 - anoDeNascimento;

	if (idade >= 18) {
	    System.out.println("Adulto");
	} else {
	    System.out.println("Menor de idade");
	}
    }
}