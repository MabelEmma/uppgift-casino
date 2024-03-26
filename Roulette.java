package fk.examples.onlinecasino;
import java.util.Scanner;

public class Roulette {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Uppmana användaren att välja mellan rött eller svart
	        System.out.println("Välj en färg: skriv in rött eller svart)");
	        String choice = scanner.next();

	        // Kontrollera användarens val och skriv ut motsvarande meddelande
	        if (choice.equals("rött")) {
	        	System.out.println("Du valde rött.");
	        } else if (choice.equals("svart")) {
	        	System.out.println("Du valde svart.");
	        } else {
	            System.out.println("Ogiltigt val. Välj 1 för rött eller 2 för svart.");
	        }
	    
	        
	        System.out.println("Najs! Hur mycket pengar vill du satsa?");
	        int num1 = scanner.nextInt();
	        System.out.println("Okej, du satsar alltså " + num1 + "kronor.");
	        
	        
	        
	        scanner.close(); // Stäng Scanner när den inte längre behövs
	    }
	

	
}
