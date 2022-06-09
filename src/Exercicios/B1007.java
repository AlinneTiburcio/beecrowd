package Exercicios;

import java.util.Scanner;

public class B1007 {

	public static void main(String[] args) {
		/*
		 Leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

         Entrada
         O arquivo de entrada contém 4 valores inteiros.

         Saída
         Imprima a mensagem DIFERENCA com todas as letras maiúsculas, conforme exemplo abaixo, com um espaço em branco antes e depois da igualdade.
		 */
		
		int a,b,c,d,diferenca;
		
		Scanner leia = new Scanner(System.in);
		
		//System.out.println();
		a = leia.nextInt();
		//System.out.println();
		b = leia.nextInt();
		//System.out.println();
		c = leia.nextInt();
		//System.out.println();
		d = leia.nextInt();
		
		
		diferenca = (a*b-c*d);
		
		System.out.println("DIFERENCA = "+diferenca);
		
		

	}

}
