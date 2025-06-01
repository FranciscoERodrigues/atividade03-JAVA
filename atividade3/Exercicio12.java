package atividade3;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		        System.out.print("Digite a temperatura em graus Fahrenheit: ");
		        double fahrenheit = sc.nextDouble();

		        double celsius = (fahrenheit - 32) * 5 / 9;
		        
		        
		        System.out.printf("Temperatura em graus Celsius: %.2f°C\n", celsius);

		        sc.close();
		    }
		
	}


