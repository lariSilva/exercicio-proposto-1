package exercicio;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("Olá!");
		System.out.println("Vamos fazer uma continha?! XD");
		System.out.println("Digite um número inteiro:");

		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();

		System.out.println("Digite mais um número inteiro:");
		int n2 = sc.nextInt();
		sc.close();

		int resultado = n1 + n2;

		System.out.printf("O resultado da soma destes dois números inteiros é: %d%n", resultado);
		System.out.println("Muito obrigada! Volte sempre!");
	}

}
