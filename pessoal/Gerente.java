package pessoal;

public class Gerente  extends Funcionario {

	private int numeroGerente;
	private int senha;
	private int numeroFuncionarios;
	
	
	
	public Gerente() {
		super();
	}

	
	
//	public Gerente(int numeroGerente, int senha, int numeroFuncionarios) {
//		
//		this.numeroGerente = numeroGerente;
//		this.senha = senha;
//		this.numeroFuncionarios = numeroFuncionarios;
//	}

	
	public Gerente(String nome, String cpf, int salario, int numeroGerente, int senha, int numeroFuncionarios) {
		super(nome, cpf, salario);
		this.numeroGerente = numeroGerente;
		this.senha = senha;
		this.numeroFuncionarios = numeroFuncionarios;
	}

	
	
	public int getNumeroGerente() {
		return numeroGerente;
	}

	public void setNumeroGerente(int numeroGerente) {
		this.numeroGerente = numeroGerente;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public int getNumeroFuncionarios() {
		return numeroFuncionarios;
	}

	public void setNumeroFuncionarios(int numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}



	@Override
	public String toString() {
		return "Gerente [numeroGerente=" + numeroGerente + ", senha=" + senha + ", numeroFuncionarios="
				+ numeroFuncionarios + ", getNome()=" + getNome() + ", getCpf()=" + getCpf() + ", getSalario()="
				+ getSalario() + "]";
	}

	


	
	
}
