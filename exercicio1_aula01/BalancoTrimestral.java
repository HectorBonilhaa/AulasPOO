package exercicio1_aula01;

public class BalancoTrimestral {
	
	private double janeiro;
	public double fevereiro, marco, abril, maio, junho, julho, soma;
	
	
	// EXERCICIO AULA 03
	
	public BalancoTrimestral() {
	
	}
	
	public BalancoTrimestral(double janeiro, double fevereiro, double marco) {
		
		this.janeiro = janeiro;
		this.fevereiro = fevereiro;
		this.marco = marco;
	}
	
	
	public BalancoTrimestral(double janeiro, double fevereiro, double marco, double abril, double maio, double junho, double julho) {
		
		this.janeiro = janeiro;	
		this.fevereiro = fevereiro; 
		this.marco = marco; 
		this.abril = abril;		
		this.maio = maio;			
		this.junho = junho;
		this.julho = julho;
		
	}
	public double getJaneiro() {
		
		this.janeiro = 78000;
		return this.janeiro;
	}
	
	public void somarTrimestre(double mes1, double mes2, double mes3) {
		
		this.soma = mes1 + mes2 + mes3;
	}

	public double somarSemestre() {
		
		return this.soma = this.getJaneiro() + this.fevereiro + this.marco + this.abril + this.maio + this.junho + this.julho;
	}
}