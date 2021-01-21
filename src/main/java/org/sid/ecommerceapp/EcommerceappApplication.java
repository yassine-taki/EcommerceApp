package org.sid.ecommerceapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@CrossOrigin("*")
public class EcommerceappApplication {

    public static void main(String[] args) {
        SpringApplication.run(EcommerceappApplication.class, args);
    }

}
