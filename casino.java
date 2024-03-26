package fk.examples.onlinecasino;
import java.util.Scanner;



public class casino {
	
	public static void main(String[]args) {
		System.out.println("Hello sisters! Welcome to our partyHouse");
		
		//Objekt av scanner
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Skriv in ditt namn: ");
		String namn = scanner.nextLine();
		
		System.out.println("Skriv in ditt saldo: ");
		int saldo = scanner.nextInt();
		
		//Objekt av player
		Player player = new Player(namn, saldo);
		
		System.out.println("Välkommen " + player.namn + ". Du har " + player.getBalance() + " kronor!");
		
		
		System.out.println("Vilket spel vill du spela?");
		System.out.println("1. Roulette");
		System.out.println("2. WheelOfFortune");
		int spel = scanner.nextInt();
		
		switch(spel) {
		case(1):
			Roulette roulette = new Roulette();
		
			System.out.println("Hur mycket pengar vill du satsa? ");
			int moneyInput = scanner.nextInt();
			System.out.println("Vilken siffra vill du satsa på? ");
			int numberInput = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Vilken färg vill du satsa på? ");
			String colorInput = scanner.nextLine();
			
			player.newBalance(moneyInput * -1);
			int result = roulette.bet(moneyInput, numberInput, colorInput);
			
			if(result == 0) {
				System.out.println("Du har förlorat.");
			} else {
				System.out.println("Du har vunnit!!!!");
			}
			
			player.newBalance(result);
			System.out.println("Ditt nya saldo är " + player.getBalance() + " kronor!");

		
			break;
		case(2):
			break;
		default:
			break;
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	/*
	int num;
	int vinst = num*2;
	
	public static void main(String[]args) {
		
		//Skapa objekt av scanner
		Scanner scanner = new Scanner(System.in);
		
		//datatyp vid loopen
		 boolean continuePlaying = true;
	
		//loop runt hela så man kan börja om
		 while (continuePlaying) {
		
		//Hämta spelarens namn och saldo och skriver ut det
		System.out.println("Hej och välkommen till detta casino Emma");
		System.out.println("Först ska vi se om du har råd att köpa en biljett");		
		
		System.out.println("Ange hur mycket pengar du har sammanlagt:");
        int num = scanner.nextInt(); // Läs in summan från användaren

        if(num < 50) {
        	System.out.println("Du har tyvärr inte råd, en biljett kostar 50kr.");
        continue;
        }
        else {
        	System.out.println("Tjoho! Du har råd! Du har chans att vinna dubbelt så mycket, alltså " + (num*2) + "kronor!");
        }
        
        
        System.out.println("Välj en siffra utav 1 eller 2: ");
        int num2 = scanner.nextInt();
        
        if(num2 == 1) {
        	System.out.println("Grattis, du har vunnit!");
        	System.out.println("Ditt nya saldo är: " + ((num*2)+(num))+ "kronor!");
        }
        else {
        	System.out.println("Tyvärr, det var fel. Lycka till nästa gång!");
        	System.out.println("Ditt nya saldo är: " + (num -50) + " kronor!");
        }
        
        
        System.out.println("Skulle du vilja vara med i en slumpmässig tävling?");
        System.out.println("Ange 1 om du vill vara med, annars ange 2");
        int num3 = scanner.nextInt();
        if(num3== 1){
        	System.out.println("Vad roligt!");
        	System.out.println("Välj en ny slumpmässig siffra: ");
        	int num4 = scanner.nextInt();
        	if (num4 == 25) {
        		System.out.println("TJOHO, du vann storpriset!");
        		System.out.println("1000kr har lagts till på ditt saldo");
        	}
        	else {
        		System.out.println("Tyvärr, du hade fel. BUHU");
        	}
        
        break;
        }
        else {
        	System.out.println("Vad tråkigt, vi ses nästa gång!");
        break;
        	
        }
        
		}    
	        scanner.close(); // Stäng Scanner när den inte längre behöver
	        
	        System.out.println("Test");

    }*/
	
	
	
	
	

