package dev.vality.javaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class JavaServiceApplication extends SpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaServiceApplication.class, args);
    }

}
