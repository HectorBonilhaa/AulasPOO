package conta;

public class ContaCorrente extends Conta {
	

	private	double tarifa;
	private	double limite;
	
	public ContaCorrente() {
		super();
	}

	public ContaCorrente(int numero, String titular, double saldo, double tarifa, double limite) {
		super(numero, titular, saldo);
		this.tarifa = tarifa;
		this.limite = limite;
	}

	public double getTarifa() {
		return tarifa;
	}

	public double getLimite() {
		return limite;
	}

	@Override
	public String toString() {
		return "ContaCorrente [tarifa=" + tarifa + ", limite=" + limite + ", getNumero()=" + getNumero()
				+ ", getTitular()=" + getTitular() + ", getSaldo()=" + getSaldo() + "]";
	}

	
	
	
	

}
