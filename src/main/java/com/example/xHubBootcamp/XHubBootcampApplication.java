package com.example.xHubBootcamp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class XHubBootcampApplication {
    public static void main(String[] args) {
        SpringApplication.run(XHubBootcampApplication.class, args);
        //ConfigurableApplicationContext context = SpringApplication.run(XHubBootcampApplication.class, args);
        //Customer e = context.getBean(Customer.class);
        //e.display();
    }

}
