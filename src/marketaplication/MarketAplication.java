package marketaplication;

import java.util.Scanner;

public class MarketAplication {

	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String cont;
		do {

			MarketsProducts m = new MarketsProducts();

			System.out.println("\n" + "\n" + "Would you like continue adding Products, press [yes] or [no]");
			cont = input.next();
		} while (cont.equalsIgnoreCase("yes"));

		System.out.println("Thanks for choosing us!");

	}

	public static void levelChoice(String P) {

		System.out.println(P);

	}

}
