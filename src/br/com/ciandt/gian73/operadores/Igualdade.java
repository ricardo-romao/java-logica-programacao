//Igualdade

package br.com.ciandt.gian73.operadores;

import java.util.Scanner;

public class Igualdade {

	public static void main(String[] args) {
		//O que faz a linha de baixo?
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um valor ");
		//O que faz a linha de baixo?
		double valor = sc.nextDouble();

		if (valor == 15) {
			System.out.println("Acertou");
		} else {
			System.out.println("ERRROOOOUUU");
		}

	}

}

