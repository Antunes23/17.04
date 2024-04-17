package estrutura_condicional;

import java.util.Scanner;

public class atv1 {
	
	public static void main(String[] args) {
		
		int inicio,fim;
		
		Scanner ler = new Scanner(System.in);
		
			System.out.println("Informe o primeiro valor");
		inicio = ler.nextInt();
		
		System.out.println("Informe o segundo valor");
		fim = ler.nextInt();   
		
			for (int i = inicio; i<=fim; i++) {
			if (i % 2 != 0) {
			System.out.println("Os números ímpares são: " + i );
			}
			else {
				System.out.println("O número é par " + i);
			}
		
	

	}
		{
		}
		}
}