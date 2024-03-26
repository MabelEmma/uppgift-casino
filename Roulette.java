package fk.examples.onlinecasino;
import java.util.Scanner;
import java.util.Random;


public class Roulette {
	
	public int bet(int money, int number, String color) {
		Random random = new Random();
		
		int randomNumber = random.nextInt(50) + 1;
		boolean isRed = random.nextBoolean();
		
		if(number==randomNumber && (color=="red")==isRed) {
			return money*2;
		} else {
			return 0;
		}
	}

	
}


/*
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
    */

