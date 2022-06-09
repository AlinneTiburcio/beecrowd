package Exercicios;

import java.util.Scanner;

public class B1006 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		double a,b,c,media;
		a=2;
		b=3;
		c=5;
		
		System.out.println("\nEntre com a primeira nota: ");
		a = leia.nextDouble();
		
		System.out.println("\nEntre com a segunda nota :");
		b = leia.nextDouble();
		
		System.out.println("\nEntre com a terceira nota: ");
		c = leia.nextDouble();
		
		media = a+b+c;
		
		System.out.printf("\nMedia Geral: %.1f",media);	
		

	}
	
	
}
