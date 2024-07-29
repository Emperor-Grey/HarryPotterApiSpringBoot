package com.dev.HarryPotter;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HarryPotterApplication {

  public static void main(String[] args) {
    SpringApplication.run(HarryPotterApplication.class, args);
  }

  @Bean
  public CommandLineRunner cRunner() {
    return args -> {
      System.out.println("Connected to database...,Running Application.");
    };
  }
}
