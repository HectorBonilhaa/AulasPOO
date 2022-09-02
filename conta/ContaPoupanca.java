package conta;

public class ContaPoupanca extends Conta {
	
	private	double rendimento;

	public ContaPoupanca() {
		super();
	}

	public ContaPoupanca(int numero, String titular, double saldo, double rendimento) {
		super(numero, titular, saldo);
		this.rendimento =  rendimento;
	}

	public double getRendimento() {
		return rendimento;
	}

	@Override
	public String toString() {
		return "ContaPoupanca [rendimento=" + rendimento + ", getNumero()=" + getNumero() + ", getTitular()="
				+ getTitular() + ", getSaldo()=" + getSaldo() + "]";
	}

	

	
	



	
		
	


	
	
	
}