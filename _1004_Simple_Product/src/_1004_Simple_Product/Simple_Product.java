package _1004_Simple_Product;

import java.util.Scanner;

public class Simple_Product {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        
        int c = a * b;
        
        System.out.println("PROD = " + c);
        
        sc.close();
	}

}
