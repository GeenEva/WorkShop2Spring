package eva.workshop2spring.view;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


public class StartMenuView extends View{

	public void show() {
		System.out.println("\n- - - - Start Menu - - - -\n"
				+ "\nMaak uw keuze:"
				+ "\n1. Maak nieuw account aan"
				+ "\n2. Log in"
				+ "\n3. Verlaat Nevvo");
	}
}
	