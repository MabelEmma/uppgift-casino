package fk.examples.onlinecasino;
import java.util.Random;

public class WheelOfFortune {

	public static void main(String[] args) {
		Random random = new Random();
		
		int randomNumber = random.nextInt(100) + 1;
		System.out.println ("Det slumpmässiga numret är: " + randomNumber);
	}
}
