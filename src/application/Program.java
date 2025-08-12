package application;

import java.util.Scanner;
import view.Interface;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Interface uhm = new Interface();
//		"Selecione uma das opções abaixo:
//		"1- Cadastro.
//		"2- Depósito.
//		"3- Saque.
//		"4- Extrato.
//		"5- login.
//		"6- Voltar.
//		"7- Sair.

		int x;
		char continua;
		do {
			System.out.println("===========================================");
			System.out.println(uhm.toString());
			System.out.println("===========================================");
			 x = sc.nextInt();
			switch (x) {
			case 1://cadastro
				// public void Cadastro()
				// uhm.Cadastroo(); este é um objeto
				// public static void Cadastro()
				//Interface.Cadastro(); 
				System.out.println("===========================================");
				uhm.Cadastro(sc);
				System.out.println("===========================================");
				break;
			case 2:// Depósito
				System.out.println("===========================================");
				uhm.Deposito(sc);
				System.out.println("===========================================");
				break;
			case 3://saque
				System.out.println("===========================================");
				uhm.Saque(sc);
				System.out.println("===========================================");
				break;
			case 4://extrato
				System.out.println("===========================================");
				uhm.Extrato();
				System.out.println("===========================================");
				break;
			case 5:// login

				break;
			case 6://voltar
				System.out.println("===========================================");
				break;
			case 7://sair
				System.out.println("===========================================");
				System.out.println("Você escolheu sair.");
				System.out.println("Até a proxima.");
				System.out.println("===========================================");
				return;
			default:
				System.out.println("===========================================");
				System.out.println("Não existe esta opção.");
				System.out.println("===========================================");
				break;
			}
			System.out.println();
			System.out.println("===========================================");
			System.out.println("deseja voltar para o menu? digite y (sim) ou n (não).");
			System.out.println("===========================================");
			continua = sc.next().charAt(0);

		} while (continua != 'n');
		sc.close();
	}

}
