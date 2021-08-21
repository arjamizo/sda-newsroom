package pl.sda.sdanewsroom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@SpringBootApplication
@ComponentScan("pl.sda")
public class SdaNewsroomApplication {

	public static void main(String[] args) {
		SpringApplication.run(SdaNewsroomApplication.class, args);
	}

}
