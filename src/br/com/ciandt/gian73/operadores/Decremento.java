//Decremento

package br.com.ciandt.gian73.operadores;

import java.util.Scanner;

public class Decremento {

	public static void main(String[] args) {
		//O que faz a linha de baixo?
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor :");
		//O que faz a linha de baixo?
		double valor = sc.nextDouble();

		System.out.println(--valor);
	}

}
