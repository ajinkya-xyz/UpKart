package xyz.ajinkya.UpKart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
/*@ComponentScan(basePackages = "xyz.ajinkya.UpKart")
@EnableAutoConfiguration*/
public class UpKartApplication {

	public static void main(String[] args) {
		SpringApplication.run(UpKartApplication.class, args);
	}

}
