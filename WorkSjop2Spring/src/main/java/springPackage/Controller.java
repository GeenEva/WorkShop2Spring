package springPackage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/*De annotatie Component wordt gebruikt om aan te geven dat een klasse een kandidaat 
 is voor een autodetectie wanneer annotatie-gebaseerde configuratie wordt gebruikt.*/
//@Component 
public class Controller {

	/*
	 * From Evy:
	 *-  @Qualifier("TheView2") specifies which View will be used as View view ; here
	 * -  ("TheView2") specifies that new View2 will be injected to Controller.
	 * - ("TheBean") or ("Bunnie") : they are the names of a bean method in Application,
	 *   which returns new View1. So if we specify @Qualifier("TheBean") or
	 *   @Qualifier("Bunnie"), new View1 will be injected to Controller
	 */
	
	@Autowired //Zorgt ervoor dat dit object geinjecteerd wordt
//	@Qualifier("BeanyBoy") 
	private View view;
	
	public Controller() {}
	
	
	public Controller(View view) {
		this.view = view;
	}
	
	
	public void showView() {
		view.show();
	}
}
