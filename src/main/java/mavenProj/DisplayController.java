package mavenProj;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DisplayController {
	
	@RequestMapping("/hello")
	public String display() {
		return "Hello Kunal";
	}

}
