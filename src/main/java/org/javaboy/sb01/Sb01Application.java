package org.javaboy.sb01;

import org.javaboy.common.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Sb01Application {

    public static void main(String[] args) {
        User user = new User();
        SpringApplication.run(Sb01Application.class, args);
    }

}
