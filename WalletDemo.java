//This program tells the type of coin and values
public class WalletDemo {
	public static void main(String[] args) {
		Wallet wallet = new Wallet(5);
		Coin toonie = new Coin("Toonie", 200);
		System.out.println(toonie);
		Coin loonie = new Coin("Loonie", 100);
		System.out.println(loonie);
		Coin quarter = new Coin("Quarter", 25);
		System.out.println(quarter);
		Coin dime = new Coin("Dime", 10);
		System.out.println(dime);
		Coin nickel = new Coin("Nickel", 5);
		System.out.println(nickel);
		wallet.addCoin(toonie);
		wallet.addCoin(loonie);
		wallet.addCoin(quarter);
		wallet.addCoin(dime);
		wallet.addCoin(nickel);
		System.out.println(wallet);

	}
}
