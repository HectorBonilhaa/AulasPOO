package principal;

import conta.ContaCorrente;
import conta.ContaCorrenteEspecial;
import conta.ContaPoupanca;
import conta.ContaPoupancaEspecial;

public class Principal {

	public static void main(String[] args) {
		
//		Funcionario funcionario1 = new Funcionario("Roniejo", "123.456.789-45", 1800);
//
//			System.out.println(funcionario1.toString());
//		
//		Gerente gerente1 = new Gerente("Hectu", "171.453.789.45", 3400, 05,12345 , 15);
//			
//		System.out.println(gerente1.toString());
	
//		ContaPoupanca poupanca1 = new ContaPoupanca(845,"Hectu", 15000, 20);
//			System.out.println(poupanca1.toString());
//		
//		ContaCorrente corrente1 = new ContaCorrente(847, "Giovan", 18000, 20, 2500);
//			System.out.println(corrente1.toString());
//		
		
//		ContaPoupancaEspecial poupancaEspecial1 = new ContaPoupancaEspecial(845, "Hectu", 15000, 20, "Mastercard", 15484);
//			System.out.println(poupancaEspecial1.toString());
//	
	
		ContaCorrenteEspecial correnteEspecial1 = new ContaCorrenteEspecial(847, "Giovan", 18000, 20,2500, "Nubank", "231.456.321", 3200);
			System.out.println(correnteEspecial1.toString());
	}
						//**************************** FIM DO EXERCICIO ***********************************//

	
//		Conta contaNubia = new Conta(0001, "Nubia", 1000);
//		System.out.println("Saldo atual de " + contaNubia.getTitular() + " : " + contaNubia.getSaldo());
//		
//		Conta contaMatheus = new Conta(0002, "Matheus", 2000);
//		System.out.println("Saldo atual de " + contaMatheus.getTitular() + " : " + contaMatheus.getSaldo());
//		
//		contaMatheus.transferir(contaNubia, 500);
//		
//		System.out.println("Saldo atual de " + contaNubia.getTitular() + " : " + contaNubia.getSaldo());
//		System.out.println("Saldo atual de " + contaMatheus.getTitular() + " : " + contaMatheus.getSaldo());
		
//		boolean saquei = contaNubia.sacar(1000);
//		
//		if(saquei)
//			System.out.println("Saldo atual: " + contaNubia.saldo);
//		else
//			System.out.println("Você não tem saldo suficiente! \n Seu salto é de: " + contaNubia.saldo);
	
}
