package _1005_Average_1;

import java.util.Scanner;

public class Average_1 {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
 
        double c = ((a * 3.5) + (b * 7.5)) / (3.5 + 7.5);
        
        System.out.printf("MEDIA = %.5f%n", c);
        
        sc.close();
	}

}
