package application;
import java.util.Scanner;
import entities.Dados;
public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Para abertura de conta digite os ítens abaixo.");
		System.out.println("Digite o seu nome abaixo: ");
		String name = sc.nextLine();
		//dados.setName(name);
		System.out.println("Insira o número da sua conta abaixo: ");
		int conta = sc.nextInt();
		//dados.setConta(conta);
		Dados dados = new Dados(name,conta);
		System.out.println("Deseja realizar um depósito inicial (y/n) ?");
		char resp = sc.next().charAt(0);
		if (resp == 'y') {
			System.out.println("Insira o valor do seu depósito: ");
			double deposito = sc.nextDouble();
			dados.deposito(deposito);
		}		
		
		System.out.println("Dados da conta");
		System.out.println(dados.toString());
		
		System.out.println("Faça um deposito: ");
		dados.deposito(sc.nextDouble());
		
		System.out.println("Dados da conta");
		System.out.println(dados.toString());
		
		System.out.println("Realize um saque: ");
		dados.saque(sc.nextDouble());
		
		System.out.println("Dados da conta");
		System.out.println(dados.toString());
		
		sc.close();

	}

}
