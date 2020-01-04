package com.onetomanytest;

import com.onetomanytest.service.IDatabase;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class OneToManyTestApplication {

    private final IDatabase iDatabase;

    public OneToManyTestApplication(IDatabase iDatabase) {
        this.iDatabase = iDatabase;
    }

    public static void main(String[] args) {
        SpringApplication.run(OneToManyTestApplication.class, args);
    }

    @Bean
    public CommandLineRunner runner(){
        return a ->{
            iDatabase.createDatabase();
        };
    }
}
