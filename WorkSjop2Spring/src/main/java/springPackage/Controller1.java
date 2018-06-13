package springPackage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Controller1 {

	/*
	 * From Evy:
	 *-  @Qualifier("TheView2") specifies which View will be used as View view ; here
	 * -  ("TheView2") specifies that new View2 will be injected to Controller.
	 * - ("TheBean") or ("Bunnie") : they are the names of a bean method in Application,
	 *   which returns new View1. So if we specify @Qualifier("TheBean") or
	 *   @Qualifier("Bunnie"), new View1 will be injected to Controller
	 */
	
	@Autowired @Qualifier("BeanyBoy") View view;
	
//	public Controller1() {}
	
	
	public Controller1(View view) {
		this.view = view;
	}
	
	
	public void showView() {
		view.show();
	}
}
