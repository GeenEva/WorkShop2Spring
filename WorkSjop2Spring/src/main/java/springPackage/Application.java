package springPackage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class Application {
	
	@Autowired Controller controller;
	
	
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
		Application app = context.getBean(Application.class);	
			
		app.start();
		
	}
	
	public void start() {
		controller.showView();
	}
	
	
	@Bean
	public View getView() { 
		return new StartMenuView();
	}
	
	@Bean
	public Controller getController() {
		return new StartMenuController();
	}
	
}
