package springPackage;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Primary
@Component//("TheView2")
public class View2 implements View{

	public void show() {
		System.out.println("Howdeee World");
	}
}
