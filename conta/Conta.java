package conta;

public class Conta {
	
	private int numero;
	private String titular;
	private double saldo;
	
		
	public Conta() {
		System.out.println("Construtor Default");
	}
	
	public Conta(int numero, String titular, double saldo) {
		this.numero = numero;
		this.titular = titular;
		this.depositar(saldo);
		System.out.println("Construtor Parametrizado");
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public String getTitular() {
		return this.titular;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public boolean sacar(double valor) {
		if (this.saldo < valor) {
			return false;
		} else {
			double novoSaldo = this.saldo - valor;
			this.saldo = novoSaldo;
			return true;
		}
	}
	
	public void depositar(double deposito) {
		this.saldo = this.saldo + deposito;
	}
	
	public void transferir(Conta destino, double valor) {
		if (this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			destino.saldo = destino.saldo + valor;
		} else {
			System.out.println("Não há saldo suficiente para transferência");
		}
	}
}