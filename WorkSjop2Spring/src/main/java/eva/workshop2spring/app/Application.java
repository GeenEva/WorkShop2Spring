package eva.workshop2spring.app;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import eva.workshop2spring.controller.Controller;
import eva.workshop2spring.controller.StartMenuController;
import eva.workshop2spring.view.StartMenuView;
import eva.workshop2spring.view.View;

@Component
public class Application {
	
	@Autowired
	Controller controller;
	
	
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigAll.class);
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
