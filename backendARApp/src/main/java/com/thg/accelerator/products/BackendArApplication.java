package com.thg.accelerator.products;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BackendArApplication {
    private static final Logger log = LoggerFactory.getLogger(BackendArApplication.class);


    public static void main(String[] args) {
        SpringApplication.run(BackendArApplication.class, args);
    }

//    @Bean
//    public CommandLineRunner demo(DatabaseRepository databaseRepository) {
//        return (args) -> {
//            databaseRepository.save(new Task ("Work", "HIGH"));
//            databaseRepository.save(new Task ("Clean", "MEDIUM"));
//            databaseRepository.save(new Task ("Cook", "LOW"));
//
//            // fetch all customers
//            log.info("Task found with findAll():");
//            log.info("-------------------------------");
//            for (Task task : databaseRepository.findAll()) {
//                log.info(task.toString());
//            }
//            log.info("");}

//                ;}
@GetMapping("/helloWorld")
public String helloWord(){
    return "Hello, Ru!";
}
}