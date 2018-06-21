package springPackage;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//De @Primary annotatie geeft aan dat de geannoteerde klasse 
//de voorkeur heeft als er meerdere implementaties worden gevonden.

@Primary 
@Component
public class View1 implements View{

	public void show() {
		System.out.println("Hello World");
	}
}
	