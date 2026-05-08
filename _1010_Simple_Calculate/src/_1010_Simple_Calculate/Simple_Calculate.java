package _1010_Simple_Calculate;

import java.util.Scanner;

public class Simple_Calculate {

	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
        
        int prod1 = sc.nextInt();
        int quant1 = sc.nextInt();
        double price1 = sc.nextDouble();
        int prod2 = sc.nextInt();
        int quant2 = sc.nextInt();
        double price2 = sc.nextDouble();
        
        double total = ((double) quant1 * price1) + ((double) quant2 * price2);
        
        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
        
        sc.close();
	}

}
