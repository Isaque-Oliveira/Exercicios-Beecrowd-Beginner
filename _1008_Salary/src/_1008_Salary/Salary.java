package _1008_Salary;

import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        
        int number = sc.nextInt();
        int hour = sc.nextInt();
        double money = sc.nextDouble();
        
        double salary = (double) hour * money;
        
        System.out.println("NUMBER = " + number);
        System.out.printf("SALARY = U$ %.2f%n", salary);
        
        sc.close();

	}

}
