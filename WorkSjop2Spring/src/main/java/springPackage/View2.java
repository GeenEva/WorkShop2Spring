package springPackage;
import org.springframework.stereotype.Component;

@Component
public class View2 implements View{

	public void show() {
		System.out.println("Goodbye World");
	}
}
