package Application;
//importação de pacote:

import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		System.out.printf("----------Bem vindo a Tabuada-----------%n%n");
		System.out.println("Digite numero da Tabuada desejada: ");
		int numero = input.nextInt();
		
		System.out.println("Tabuada do numero: " +  numero);
		for(int i = 0; i <= 10; i++) {
			int resultado =  i * numero;
			System.out.printf("%d x %d = %d%n", i,numero,resultado);
		}
		
		input.close();
	}

}
