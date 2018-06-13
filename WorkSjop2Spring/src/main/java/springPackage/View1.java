package springPackage;
import org.springframework.stereotype.Component;

@Component
public class View1 implements View{

	public void show() {
		System.out.println("Hello World");
	}
}
