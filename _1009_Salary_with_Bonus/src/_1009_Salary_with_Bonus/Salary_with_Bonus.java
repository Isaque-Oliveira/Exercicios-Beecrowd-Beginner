package _1009_Salary_with_Bonus;

import java.util.Scanner;

public class Salary_with_Bonus {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);  
        
        String nome = sc.nextLine();
        double salario = sc.nextDouble();
        double vendas = sc.nextDouble();
        
        double total = salario + (vendas * 15) / 100;
        
        System.out.printf("TOTAL = R$ %.2f%n", total);
        
        sc.close();

	}

}
