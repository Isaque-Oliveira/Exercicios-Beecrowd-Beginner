package _1006_Average_2;
import java.util.Scanner;

public class Average_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        
        double result = ((a * 2.0) + (b * 3.0) + (c * 5.0)) / (2.0 + 3.0 + 5.0);
        
        System.out.printf("MEDIA = %.1f%n", result);
        
        sc.close();

	}

}
