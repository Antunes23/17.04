package estrutura_condicional;

import java.util.Scanner;

public class atv2 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		double a,soma = 0,media;

		for (double i =1; i<=5; i++) {
			System.out.println("Informe um número");
			a = ler.nextDouble();
			
			soma += a;

		}
		media = soma / 5;
		System.out.println("A soma dos números é : "  +  soma +  " A média dos números é: " + media);

	}
}
