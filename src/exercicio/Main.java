package exercicio;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("Ol�!");
		System.out.println("Vamos fazer uma continha?! XD");
		System.out.println("Digite um n�mero inteiro:");

		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();

		System.out.println("Digite mais um n�mero inteiro:");
		int n2 = sc.nextInt();
		sc.close();

		int resultado = n1 + n2;

		System.out.printf("O resultado da soma destes dois n�meros inteiros �: %d%n", resultado);
		System.out.println("Muito obrigada! Volte sempre!");
	}

}
