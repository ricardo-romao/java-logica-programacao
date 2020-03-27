package br.com.ciandt.gian73.decisao;

import java.util.Scanner;

public class Switch {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
	// O que faz a linha de baixo?
	Scanner sc = new Scanner(System.in);

	System.out.println("Escreva uma linguagem de programação");
	// O que faz a linha de baixo?
	String linguagem = sc.next();

	switch (linguagem) {
	case "Java":
	    System.out.println("Dev Java");
	    break;
	case "DotNet":
	    System.out.println("Dev DotNet");
	    break;
	case "Javascript":
	    System.out.println("Dev Javascript");
	    break;
	default:
	    System.out.println("Errooou!");
	    break;
	}
    }

}
