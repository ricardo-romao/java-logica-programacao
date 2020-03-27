//Relacionais

package br.com.ciandt.gian73.operadores;

import java.util.Scanner;

public class Relacionais {

	public static void main(String[] args) {
		//O que faz a linha de baixo?
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a primeira nota");
		//O que faz a linha de baixo?
		double primeiraNota = sc.nextDouble();
		System.out.println("Digite a segunda nota");
		double segundaNota = sc.nextDouble();

		double media = (primeiraNota + segundaNota) / 2;

		if (media >= 7) {
			System.out.println("Aprovado");
		} else if (media < 4) {
			System.out.println("Reprovado");
		} else {
			System.out.println("Recuperação");
		}
	}

}