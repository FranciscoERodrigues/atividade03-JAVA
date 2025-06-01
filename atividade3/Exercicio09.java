package atividade3;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salário atual: R$ ");
        float salarioAtual = sc.nextFloat();

        System.out.print("Digite o percentual de reajuste: ");
        float percentual = sc.nextFloat();

        
        float novoSalario = salarioAtual + (salarioAtual * percentual / 100);

    
        System.out.printf("O novo salário é: R$ %.2f\n", novoSalario);

        sc.close();
	}

}
