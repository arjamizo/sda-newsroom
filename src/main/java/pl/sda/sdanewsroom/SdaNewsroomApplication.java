package pl.sda.sdanewsroom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("pl.sda")
public class SdaNewsroomApplication {

	public static void main(String[] args) {
		SpringApplication.run(SdaNewsroomApplication.class, args);
	}

}
