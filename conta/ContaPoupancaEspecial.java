package conta;

public class ContaPoupancaEspecial extends ContaPoupanca {

	private String cartaoDebito;
	private int numeroCartaoD;
	
	
	public ContaPoupancaEspecial() {
		super();
	}


	public ContaPoupancaEspecial(int numero, String titular, double saldo, double rendimento, String cartaoDebito,
			int numeroCartaoD) {
		super(numero, titular, saldo, rendimento);
		this.cartaoDebito = cartaoDebito;
		this.numeroCartaoD = numeroCartaoD;
	}


	public String getCartaoDebito() {
		return cartaoDebito;
	}


	public int getNumeroCartaoD() {
		return numeroCartaoD;
	}


	@Override
	public String toString() {
		return "ContaPoupancaEspecial [cartaoDebito=" + cartaoDebito + ", numeroCartaoD=" + numeroCartaoD
				+ ", getRendimento()=" + getRendimento() + ", getNumero()=" + getNumero() + ", getTitular()="
				+ getTitular() + ", getSaldo()=" + getSaldo() + "]";
	}




}
