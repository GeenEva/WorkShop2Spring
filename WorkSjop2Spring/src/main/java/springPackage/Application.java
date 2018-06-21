package springPackage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;


/*De ComponentScan-annotatie zorgt ervoor (indien er geen packages zijn opgegeven) dat vanaf 
de klasse die deze annotatie heeft, er in dezelfde en onderliggende packages wordt gescand 
naar componenten en beans.*/

//@Configuration
@ComponentScan 
public class Application {
	
	// @Autowired tells that Controller needs to be object injected.
	@Autowired Controller controller;
	
	
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
		
		//getBean: haal de bean uit de container
		Application app = context.getBean(Application.class);	
			
		app.start();
		
	}
	
	public void start() {
		controller.showView();
	}
	
	
	/*De @Bean annotatie wordt geplaatst op een methode, en geeft aan dat deze methode een bean 
	produceert (teruggeeft), die door de Spring container beheerd moet worden.
	Wat is nu het voordeel van de Bean annotatie op een methode ten opzichte van de Component op 
	een klasse? In een methode kun je logica opnemen om te bepalen welke implementatie wordt 
	afgeleverd aan de Spring container. Je kunt objecten ook van waarden voorzien in een methode. 
	Het wordt zo mogelijk door middel van een configuratie bestand een implementatie te selecteren.
	Spring scant voor de Bean annotaties, maar alleen in klassen die geannoteerd zijn 
	met Configuration. */
	
	@Bean//(name = {"TheBean" , "BeanyBoy"})
	public View getView() { 
		return new View1();
	}
	
	@Bean
	public Controller getController() {
		return new Controller();
	}
	
}
