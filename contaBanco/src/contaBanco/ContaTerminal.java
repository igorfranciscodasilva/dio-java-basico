package contaBanco;

import java.util.Scanner;

public class ContaTerminal {
	
	public static void main(String[] args) {		
	    Scanner scanner = new Scanner(System.in);
	    
		System.out.println("Bem vindo ao banco");
		System.out.println("Para acessar sua conta digite seus dados.");				
		
		System.out.print("qual seu nome: ");
		String nome = scanner.nextLine();	
								
		System.out.print("Digite o numero da sua agencia com o seguinte formato EX: 000-0. agencia: ");
		String agencia = scanner.nextLine();
		
		System.out.print("Agor digite o numero da sua conta: ");
		int numeroConta = scanner.nextInt();
		
		System.out.print("Agora digite o valor que deseja depositar. valor:");	
		double saldo = scanner.nextDouble();
		
		System.out.println("Muito obrigado! Estamos analizando seus dados.");
		System.out.println("Olá " + nome + ", obrigado por acessar sua conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo de " + saldo + " já está disponível para saque.");
	}
}
