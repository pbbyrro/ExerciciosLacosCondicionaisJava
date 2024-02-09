package exerciciosLacosCondicionais;

import java.util.Scanner;

public class ExercicioSwitch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		int escolha, quantidade;
		
		System.out.println("Escolha um produto (1 a 6):");
		escolha = ler.nextInt();
		System.out.println("Escolha a quantidade do produto:");
		quantidade = ler.nextInt();
		
		switch(escolha) {
			case 1:
				System.out.println("Valor total: R$" + 10*quantidade);
				break;
			case 2:
				System.out.println("Valor total: R$" + 15*quantidade);
				break;
			case 3:
				System.out.println("Valor total: R$" + 18*quantidade);
				break;
			case 4:
				System.out.println("Valor total: R$" + 12*quantidade);
				break;
			case 5:
				System.out.println("Valor total: R$" + 8*quantidade);
				break;
			case 6:
				System.out.println("Valor total: R$" + 13*quantidade);
				break;
		}
	}

}
