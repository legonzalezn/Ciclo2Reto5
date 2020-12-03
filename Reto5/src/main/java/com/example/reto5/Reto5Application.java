package com.example.reto5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import com.example.reto5.vistas.Serie;

@SpringBootApplication
@ComponentScan("com.example.reto5")
public class Reto5Application {

    public static void main(String[] args) {
        //SpringApplication.run(Reto5Application.class, args);
        new Serie().setVisible(true);
    }

    public static void runSpring(String[] args) {
        SpringApplication.run(Reto5Application.class, args);
    }

}
