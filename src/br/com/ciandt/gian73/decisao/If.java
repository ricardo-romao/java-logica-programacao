//IF

package br.com.ciandt.gian73.decisao;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		//O que faz a linha de baixo?
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite valor da compra");
		int valor = sc.nextInt();

		if (valor > 25) {
			System.out.println("Desconto");
		}
		System.out.println("Obrigado pela compra");

	}

}

