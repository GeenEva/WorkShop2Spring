package springPackage;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


//@Component("TheView2")
public class View2 implements View{

	public void show() {
		System.out.println("Howdeee World");
	}
}
