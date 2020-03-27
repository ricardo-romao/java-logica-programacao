package br.com.ciandt.gian73.decisao;

import java.util.Scanner;

public class Ternario {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
	// O que a linha de baixo faz?
	Scanner sc = new Scanner(System.in);

	System.out.println("Digite o ano de nascimento");
	// O que sc.nextInt() faz?
	int anoDeNascimento = sc.nextInt();

	int idade = 2020 - anoDeNascimento;

	String resultado = (idade >= 18) ? "Adulto" : "Menor de idade";
	System.out.println(resultado);
    }

}
