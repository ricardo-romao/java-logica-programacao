package br.com.ciandt.gian73.operadores;

import java.util.Scanner;

public class Incremento {
    // O que faz a linha de baixo?
    @SuppressWarnings("resource")
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	System.out.println("Digite o valor para incrementar no console:");
	double valor = sc.nextDouble();

	System.out.println(++valor);
    }

}
