package Exercicios;

import java.util.Scanner;

public class B1005 {

	public static void main(String[] args) {
		/*
		 Leia 2 valores de ponto flutuante de dupla precis�o A e B, que correspondem a 2 notas de um aluno. A seguir, calcule a m�dia do aluno, sabendo que a nota A tem peso 3.5 e a nota B tem peso 7.5 (A soma dos pesos portanto � 11). Assuma que cada nota pode ir de 0 at� 10.0, sempre com uma casa decimal.

         Entrada:
         O arquivo de entrada cont�m 2 valores com uma casa decimal cada um.

         Sa�da:
         Imprima a mensagem "MEDIA" e a m�dia do aluno conforme exemplo abaixo, com 5 d�gitos ap�s o ponto decimal e com um espa�o em branco antes e depois da igualdade. Utilize vari�veis de dupla precis�o (double) e como todos os problemas, n�o esque�a de imprimir o fim de linha ap�s o resultado, caso contr�rio, voc� receber� "Presentation Error".
		 */
		
		double a,b;
		double media;
		
		Scanner leia = new Scanner(System.in);
			
		System.out.println("Entre com a primeira nota");
		a = leia.nextDouble();
		System.out.println("Entre com a segunda nota");
		b = leia.nextDouble();
				
		
		media = a + b;
				
				
		System.out.printf("MEDIA = %.5f",media);
	

	}

}
