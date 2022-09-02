package exercicio1_aula01;



public class PrincipalBT {

	public static void main(String[] args) {
		
	//Exercicio aula03
    	
//		BalancoTrimestral receitinhaT = new BalancoTrimestral(58000, 43000,72000);
//    		System.out.println("A receita de janeiro é: " + receitinhaT.janeiro + "R$");
//    		System.out.println("A receita de fevereiro é: " + receitinhaT.fevereiro + "R$");
//    		System.out.println("A receita de marco é: " + receitinhaT.marco + "R$");
//    		
//    		receitinhaT.soma = receitinhaT.janeiro + receitinhaT.fevereiro + receitinhaT.marco;
//    		System.out.println("A receita do primeiro trimestre é de: " + receitinhaT.soma + "R$");
    		
    	//....................................................................................................	
    			
    		System.out.println("*****************************************************************");
    		
    		
    		BalancoTrimestral semestre = new BalancoTrimestral(0, 85000, 70000, 48000, 39000, 25000, 44000);
    		
    		System.out.println("A receita de cada mês:" + "\n Janeiro: " + semestre.getJaneiro() + "\n Fevereiro: " + semestre.fevereiro +
    				"\n Março: " + semestre.marco + "\n Abril: " + semestre.abril + "\n Maio: " + semestre.maio + 
    				"\n Junho: " + semestre.junho + "\n Julho : " + semestre.julho);
    			
    		
    	System.out.printf("\n A receita semestral é de :" +  semestre.somarSemestre() + "R$");
    	
    	//FIM DO EXERCICIO 3 //
	}
}
