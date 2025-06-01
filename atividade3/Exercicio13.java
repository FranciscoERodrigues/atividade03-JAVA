package atividade3;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Digite a primeira nota (peso 2): ");
        double nota1 = sc.nextDouble();

        System.out.print("Digite a segunda nota (peso 3): ");
        double nota2 = sc.nextDouble();

        System.out.print("Digite a terceira nota (peso 5): ");
        double nota3 = sc.nextDouble();

       
        double mediaFinal = (nota1 * 2 + nota2 * 3 + nota3 * 5) / 10;

     
        System.out.printf("A média final do aluno é: %.2f\n", mediaFinal);

        sc.close();
    }
}
