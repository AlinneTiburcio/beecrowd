package Exercicios;

import java.util.Scanner;

public class B1007 {

	public static void main(String[] args) {
		/*
		 Leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferen�a do produto de A e B pelo produto de C e D segundo a f�rmula: DIFERENCA = (A * B - C * D).

         Entrada
         O arquivo de entrada cont�m 4 valores inteiros.

         Sa�da
         Imprima a mensagem DIFERENCA com todas as letras mai�sculas, conforme exemplo abaixo, com um espa�o em branco antes e depois da igualdade.
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
