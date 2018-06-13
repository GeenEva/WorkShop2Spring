package springPackage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.*;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan
public class Application {
	
	@Autowired Controller1 controller1;
	
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
		Application app = context.getBean(Application.class);
		
		app.start();

	}
	
	public void start() {
		
		controller1.showView();
		
	}
	
	@Bean
	public View getView() { return new View1();};
	
}
