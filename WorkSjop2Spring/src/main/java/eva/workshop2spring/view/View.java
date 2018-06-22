package eva.workshop2spring.view;

import java.util.Scanner;

public abstract class View {
	
	public void show() {} ;
	
	private Scanner userInput = new Scanner(System.in);
	
	public Integer getIntInput() {

		try {
			return Integer.parseInt(userInput.nextLine());
			
		} catch (NumberFormatException ex) {
			
			System.out.print("Verkeerde input. Vul aub een nummer in: ");
			return getIntInput();
		}
	}
}
