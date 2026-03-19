package Alea99;
import java.util.Scanner;


public class Alea99 {
	
	public static void main(String[] args) {
   
        int numberToGuess = (int)(Math.random() * 100);
        Scanner input = new Scanner(System.in);
        int guess = -1; 
        System.out.println("--- Guess the Magic Number ---");
        
 
        while (guess != numberToGuess) {
            System.out.print("Enter your guess (0-99): ");
            guess = input.nextInt();

            if (guess == numberToGuess) {
                System.out.println("Yes, the number is " + numberToGuess);
            } else if (guess < numberToGuess) {
            
                System.out.println("Your guess is lower than the number");
            } else {
               
                System.out.println("Your guess is higher than the number");
            }
        }
        
        input.close();
    }
	
	
	

}
