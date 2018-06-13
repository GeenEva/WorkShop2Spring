package springPackage;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class View2 implements View{

	public void show() {
		System.out.println("Howdeee World");
	}
}
