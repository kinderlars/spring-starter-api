package de.kinderlars.springstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "de.kinderlars.springstarter")
public class SpringStarterApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringStarterApplication.class, args);
  }

}
