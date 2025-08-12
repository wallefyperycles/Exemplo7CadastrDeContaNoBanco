package view;

import java.util.Scanner;
import entities.Dados;

public class Interface {
	private Dados dados;
	
	public void Cadastro(Scanner sc) {
// metodo void
		System.out.println("Para abertura de conta digite os ítens abaixo.");
		sc.nextLine();
		System.out.println("Digite o seu nome abaixo: ");
		String name = sc.nextLine();
		System.out.println("Insira o número da sua conta abaixo: ");
		int conta = sc.nextInt();
		dados = new Dados(name, conta);
		System.out.println("Deseja realizar um depósito inicial (y/n) ?");
		char resp = sc.next().charAt(0);
		if (resp == 'y') {
			System.out.println("Insira o valor do seu depósito: ");
			double deposito = sc.nextDouble();
			dados.deposito(deposito);
		}

		System.out.println("Dados da conta");
		System.out.println(dados.toString());
		System.out.println();

	}

	public void Deposito(Scanner sc) {
		if (dados == null) {
			System.out.println("Nenhuma conta cadastrada:");
			return;
		}
		System.out.println("Insira o valor do deposito: ");
		dados.deposito(sc.nextDouble());

		System.out.println("Dados da conta");
		System.out.println(dados.toString());
		System.out.println();
	}

	public void Saque(Scanner sc) {
		if(dados == null) {
			System.out.println("Nenhuma conta cadastrada:");
			return;
		}
		System.out.println("Custo de R$ 5,00 de IOF para cada saque.");
		System.out.println("Realize um saque: ");
		dados.saque(sc.nextDouble());

		System.out.println("Dados da conta");
		System.out.println(dados.toString());
		System.out.println();
	}
	
	public void Extrato() {
		if (dados == null) {
			System.out.println("Nenhuma conta cadastrada.");
			return;
		}
		System.out.println(dados.toString());
		System.out.println();
	}
	public String toString() {
		return "Selecione uma das opções abaixo: \n" 
				+ "1- Cadastro.\n" 
				+ "2- Depósito.\n" 
				+ "3- Saque.\n"
				+ "4- Extrato.\n" 
				+ "5- login.\n" 
				+ "6- Voltar.\n" 
				+ "7- Sair.\n";
	}

}