package Ent100;
import java.util.Scanner;
public class Ent100 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		int number1 = (int)(Math.random() * 100);
        int number2 = (int)(Math.random() * 100);
		
        System.out.print("¿Cuánto es " + number1 + " + " + number2 + "? ");
        int answer = input.nextInt();

        System.out.println(number1 + " + " + number2 + " = " + answer + " es " + (number1 + number2 == answer));
		
		
		
	}	
}
