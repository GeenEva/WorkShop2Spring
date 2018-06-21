package springPackage;

import org.springframework.beans.factory.annotation.Autowired;

public class StartMenuController implements Controller {

	@Autowired 
	private View view;
	
	public void showView() {
		view.show();

	}

}
