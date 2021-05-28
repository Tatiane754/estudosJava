package exerciciosFaculdade;

import java.util.Scanner;

public class atividade3 {
	public static void main(String[] args) {

		/*Aula 2 atividade 3*/
		/*Tatiane Almeida*/
		/*Atividade UCB*/
		/*Implemente um programa em Java que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele no mês. 
		 * Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, o programa deve mostrar como resultado 
		 * o seu nome e o seu salário no final do mês.*/
		
		 String nome;
		 double salarioFixo;
		 double totalVendas;
		 double salarioFinal;
		 
		 System.out.println("Informe o nome do Vendedor: ");
		 nome = new Scanner(System.in).nextLine();
		 
		 System.out.println("Qual o salário fixo do vendedor " + nome + "?");
		 salarioFixo = new Scanner(System.in).nextDouble();
		 
		 System.out.println("Qual o valor total de vendas realizadas esse mês pelo " + nome);
		 totalVendas = new Scanner(System.in).nextDouble();
		 		 
		 salarioFinal = (0.15*totalVendas) + salarioFixo;
		 
		 System.out.println("Rendimentos mensais do Funcionário " + nome + "\nSalário total: R$ "+salarioFinal);
		}

}