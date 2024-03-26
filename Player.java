package fk.examples.onlinecasino;

public class Player {

	String namn;
	int saldo;
	
	//Konstruktor
	public Player(String namn, int saldo) {
		this.namn = namn;
		this.saldo = saldo;
	}
	
	//Metod för att hämta spelarens namn
	public String getName() {
		return namn;
	}
	
	//Metod för att hämta saldo
	public double getBalance() {
		return saldo;
	}
	
	
}
