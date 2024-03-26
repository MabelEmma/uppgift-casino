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
	public int getBalance() {
		return saldo;
	}
	
	//Metod för att beräkna nytt saldo
	public void newBalance(int balanceChange) {
		this.saldo = this.saldo + balanceChange;
	}
	
	
}
