package springPackage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Controller1 {

	@Autowired View view;
	
//	public Controller1() {}
	
	
	
	public Controller1(View view) {
		this.view = view;
	}
	
	
	public void showView() {
		view.show();
	}
}
