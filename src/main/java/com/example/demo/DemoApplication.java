package com.example.demo;

import javafx.application.Application;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        System.out.println("HelloWorld");
        Application.launch(GUIApplication.class, args);
    }
}
