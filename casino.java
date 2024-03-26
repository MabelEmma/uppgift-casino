package fk.examples.onlinecasino;
import java.util.Scanner;

public class casino {
	
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

        }
        else {
        	System.out.println("Vad tråkigt, vi ses nästa gång!");
        	continue;
        }
        
        scanner.close(); // Stäng Scanner när den inte längre behövs

       
        
        
		 }    
    }
		
		
		
		
		
		
	}
	
	
	
	

