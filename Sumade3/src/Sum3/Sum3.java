package Sum3;
import java.util.Scanner;

public class Sum3 {

	public static void main(String[] args) {
		
		int n1 = (int)(Math.random() * 10);
        int n2 = (int)(Math.random() * 10);
        int n3 = (int)(Math.random() * 10);
		
		Scanner input = new Scanner(System.in);
	
		System.out.print("Suma: " + n1 + " + " + n2 + " + " + n3 + " = ");
        int answer = input.nextInt();

        if (n1 + n2 + n3 == answer) {
            System.out.println("¡Correcto!");
        } else {
            System.out.println("Incorrecto. La respuesta era " + (n1 + n2 + n3));
        }
	
	}
}
