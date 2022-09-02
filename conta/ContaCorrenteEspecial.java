package conta;

public class ContaCorrenteEspecial extends ContaCorrente {
	
	private String cartaoCredito;
	private String numeroCartaoD;
	private double investimento;
	
	
	public ContaCorrenteEspecial() {
		super();
	}


	public ContaCorrenteEspecial(int numero, String titular, double saldo, double tarifa, double limite,
			String cartaoCredito, String numeroCartaoD, double investimento) {
		super(numero, titular, saldo, tarifa, limite);
		this.cartaoCredito = cartaoCredito;
		this.numeroCartaoD = numeroCartaoD;
		this.investimento = investimento;
	}


	public String getCartaoCredito() {
		return cartaoCredito;
	}


	public String getNumeroCartaoD() {
		return numeroCartaoD;
	}


	public double getInvestimento() {
		return investimento;
	}


	@Override
	public String toString() {
		return "ContaCorrenteEspecial [cartaoCredito=" + cartaoCredito + ", numeroCartaoD=" + numeroCartaoD
				+ ", investimento=" + investimento + ", getTarifa()=" + getTarifa() + ", getLimite()=" + getLimite()
				+ ", getNumero()=" + getNumero() + ", getTitular()=" + getTitular() + ", getSaldo()=" + getSaldo()
				+ "]";
	}
	
	
	
}
