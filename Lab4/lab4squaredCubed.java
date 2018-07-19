package Lab4;

import java.util.Scanner;

public class lab4squaredCubed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scnr = new Scanner(System.in);
		int userInput;
		String cont = "y";
		
		System.out.println("Learn your squares and cubes!\n");
		
		do {			
			System.out.println("Enter an integer:");
			userInput = scnr.nextInt();
			System.out.println("Number\tSquared\tCubed");
			System.out.println("=======\t=======\t======");
			
			for (int i = 1; i <= userInput; i++) {
				System.out.println(i + "\t" + (i*i) + "\t" + (i*i*i));
			}	
			System.out.print("\nContinue? (y/n): ");
			cont = scnr.next();
			System.out.println("");

		} while (cont.equals("y"));
		
		System.out.println("Bye!");
			
	}
}
	