package Ecuadratica;
import java.util.Scanner;

public class Ecuadratica {
	
	public static void main(String[] args) {
		
		double discriminant;
		
		Scanner input = new Scanner(System.in); 
			System.out.print("Ingrese a, b, c: ");
			double a = input.nextDouble();
			double b = input.nextDouble();
			double c = input.nextDouble();

		 discriminant = (Math.pow(b, 2) - 4 * a * c);
		
		if (discriminant > 0) {
            double r1 = (-b + Math.pow(discriminant, 0.5)) / (2 * a);
            double r2 = (-b - Math.pow(discriminant, 0.5)) / (2 * a);
            System.out.println("La ecuación tiene dos raíces: " + r1 + " y " + r2);
        } else if (discriminant == 0) {
            double r1 = -b / (2 * a);
            System.out.println("La ecuación tiene una raíz: " + r1);
        } else {
            System.out.println("The equation has no real roots");
        }
	
        
	}
}
