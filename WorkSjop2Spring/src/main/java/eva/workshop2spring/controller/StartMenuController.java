package eva.workshop2spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import eva.workshop2spring.view.View;


public class StartMenuController implements Controller {

	@Autowired 
	private View view;
	
	public void showView() {
		view.show();
		startMenuSwitch(view.getIntInput());
	}

	public void startMenuSwitch(int choice) {
		switch(choice) {
		case 1:	System.out.println("So, lecker bezig. Maak nieuw account.");
				break;
		case 2:	System.out.println("So, lecker bezig. Log in.");
				break;
		case 0:	System.out.println("So, lecker bezig. Terug naar je moeder.");
				break;
			
		default:
		}
	}
}
