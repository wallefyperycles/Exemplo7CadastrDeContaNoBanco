package entities;

public class Dados {
	private String name;
	private int conta;
	private double saldoEmConta;

	public Dados() {
	}

	public Dados(String name, int conta) {
		this.name = name;
		this.conta = conta;
	}

	public void deposito(double deposito) {
		saldoEmConta +=deposito;
	}
	
	public void saque(double deposito) {
		saldoEmConta-=deposito+5;
	}
	
	public String toString() {
		  
		return
				"Nome do usuário: "
				+name
				+", Número da conta: "
				+conta
				+" ,Saldo da conta: "
				+ saldoEmConta;
	}

}
