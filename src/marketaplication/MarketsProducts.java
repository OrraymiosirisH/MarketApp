package marketaplication;

import java.util.Scanner;

public class MarketsProducts {

	private static Scanner input = new Scanner(System.in);
	private static Scanner desc = new Scanner(System.in);
	private static Scanner price = new Scanner(System.in);
	private static Scanner taxa = new Scanner(System.in);

	public MarketsProducts() {

		double realtaxamount = 0;
		double Subtotal = 0;
		double Total = 0;
		double Totalnotax = 0;
		System.out.println(
				".......................................WELCOME TO Global MARKET.............................................."
						+ " \n ");

		System.out.println("How Many Items do you like to purchase?" + "\n ");

		int level = input.nextInt();

		double[] myList = new double[level];
		String[] myDesc = new String[level];

		if ((level > 0) && (level < 1000)) {

			for (int i = 0; (i < level); i++) {
				System.out.print("\n" + (i + 1) + ")Item NAME:");
				myDesc[i] = desc.nextLine();
				System.out.print((i + 1) + ")Item price:US$");
				myList[i] = price.nextDouble();

				Subtotal += myList[i];

			}

			System.out.print("\n" + "Now please Enter the Tax Amount for these " + level + " Items:");
			double taxcharged = taxa.nextDouble();
			realtaxamount = taxcharged / 100;

			Totalnotax = Subtotal * realtaxamount;

			Total = Totalnotax + Subtotal;

			System.out.print("\n" + "Sub-total is:US$" + Subtotal);
			System.out.print("\n" + "Tax Rate:" + taxcharged + "%.");
			System.out.print("\n" + "Tax Charged:US$" + Totalnotax);
			System.out.print("\n" + "Total Amount Due:US$" + Total);

		}

	}

}
