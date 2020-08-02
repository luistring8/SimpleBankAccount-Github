package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.conta;



public class programa {
	public static void main(String[]args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		conta conta;
		
		System.out.print("Insira o numero da conta");
		int nconta=sc.nextInt();
		sc.nextLine();
		System.out.print("Insira o nome do titular: ");
		String titular = sc.nextLine();
		System.out.print("Haverá deposito inicial? ");
		char resposta = sc.next().charAt(0);	
		
		if (resposta == 'S') {
			System.out.print("Insira o deposito inicial: ");
			double depositoI = sc.nextDouble();
			conta = new conta(nconta,titular, depositoI);
		}
		else {
			conta = new conta(nconta, titular);
		}
		System.out.println();
		System.out.print("dados da conta: ");
		System.out.print(conta);
		
		System.out.print("Insira o valor de depósito: ");
		double depositoI= sc.nextDouble();
		conta.deposito(depositoI);
		
		System.out.println("Insira o valor de saque: ");
		double saque = sc.nextDouble();
		conta.saque(saque);
		
		System.out.println("Dados atualizados ");
		System.out.println(conta);
		
		sc.close();
		
		
		
		
		
	}
	
	
		
		
	}
	

