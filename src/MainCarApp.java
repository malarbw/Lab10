import java.util.ArrayList;
import java.util.Scanner;

public class MainCarApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int userChoice;
		String confirm;
		String cont = "y";
		ArrayList<Cars> inventory = new ArrayList<Cars>();

		inventory.add(new Cars("Ford", "Explorer", 2013, 16000.00));
		inventory.add(new Cars("Toyota", "Camry", 2017, 26000.00));
		inventory.add(new Cars("Dodge", "Charger", 2016, 19000.00));
		inventory.add(new UsedCars("Ford", "Focus", 2014, 12000.00, 30246.02));
		inventory.add(new UsedCars("Chevy", "Malibu", 2007, 9500.00, 70285.34));
		inventory.add(new UsedCars("Honda", "Accord", 2003, 5000.00, 124820.34));

		
		while (cont.equalsIgnoreCase("y")) {
			
		
		for (Cars i : inventory) {
			System.out.println(i);

		}
		userChoice = Validator.getInt(scan, "Which car would you like? (Enter corresponding number): ", 1, 6);

		switch (userChoice) {
		case 1:
			System.out.println(inventory.get(0));
			System.out.println("Would you like to buy this car? (y/n): ");
			confirm = scan.nextLine();
			if (confirm.equalsIgnoreCase("y")) {
				inventory.remove(0);
				System.out.println("Excellent! Our finance deparment will be in touch shortly.");
			}
			break;
		case 2:
			System.out.println(inventory.get(1));
			System.out.println("Would you like to buy this car? (y/n): ");
			confirm = scan.nextLine();
			if (confirm.equalsIgnoreCase("y")) {
				inventory.remove(1);
				System.out.println("Excellent! Our finance deparment will be in touch shortly.");
			}
			break;
		case 3:
			System.out.println(inventory.get(2));
			System.out.println("Would you like to buy this car? (y/n): ");
			confirm = scan.nextLine();
			if (confirm.equalsIgnoreCase("y")) {
				inventory.remove(2);
				System.out.println("Excellent! Our finance deparment will be in touch shortly.");
			}
			break;
		case 4:
			System.out.println(inventory.get(3));
			System.out.println("Would you like to buy this car? (y/n): ");
			confirm = scan.nextLine();
			if (confirm.equalsIgnoreCase("y")) {
				inventory.remove(3);
				System.out.println("Excellent! Our finance deparment will be in touch shortly.");
			}
			break;
		case 5:
			System.out.println(inventory.get(4));
			System.out.println("Would you like to buy this car? (y/n): ");
			confirm = scan.nextLine();
			if (confirm.equalsIgnoreCase("y")) {
				inventory.remove(4);
				System.out.println("Excellent! Our finance deparment will be in touch shortly.");
			}
			break;
		case 6:
			System.out.println(inventory.get(5));
			System.out.println("Would you like to buy this car? (y/n): ");
			confirm = scan.nextLine();
			if (confirm.equalsIgnoreCase("y")) {
				inventory.remove(5);
				System.out.println("Excellent! Our finance deparment will be in touch shortly.");
			}
			break;
		}
		System.out.println("Would you like to buy another car? (y/n): ");
		cont = scan.nextLine();
		}
		System.out.println("Have a good day!");
		
		

	}
}
