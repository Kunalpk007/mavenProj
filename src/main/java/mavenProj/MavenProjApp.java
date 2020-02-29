package mavenProj;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MavenProjApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SpringApplication app = new SpringApplication(MavenProjApp.class);
        app.setDefaultProperties(Collections.singletonMap("server.port", "8084"));
        app.run(args);
	}

}
