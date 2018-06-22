package eva.workshop2spring.app;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages= {"eva.workshop2spring.app", "eva.workshop2spring.controller", "eva.workshop2spring.dao", 
		"eva.workshop2spring.domain", "eva.workshop2spring.utility", "eva.workshop2spring.view"})
public class ConfigAll {

}
