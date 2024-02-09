package exerciciosLacosCondicionais;

import java.util.Scanner;

public class ExercicioIF1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		int A, B, C;
		
		System.out.println("Insira o valor de A:");
		A = ler.nextInt();
		System.out.println("Insira o valor de B:");
		B = ler.nextInt();
		System.out.println("Insira o valor de C:");
		C = ler.nextInt();
		
		if ((A + B) == C) {
			System.out.println("A soma de A e B é igual a C.");
		} else if ((A + B) > C) {
			System.out.println("A soma de A e B é maior do que C.");
		} else {
			System.out.println("A soma de A e B é menor do que C.");
		}
	}

}
