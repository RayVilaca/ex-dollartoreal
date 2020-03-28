package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double price, bought, real;
		
		System.out.print("What is the dollar price? ");
		price = sc.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		bought = sc.nextDouble();
		
		real = CurrencyConverter.currencyConverter(price, bought);
		System.out.printf("Amount to be paid in Reais: %.2f%n", real);
		
		sc.close();
		
	}

}
