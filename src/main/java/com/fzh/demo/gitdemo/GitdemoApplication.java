package com.fzh.demo.gitdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class GitdemoApplication {

    public static void main(String[] args) {

        System.out.println("second");
        System.out.println("third");
        SpringApplication.run(GitdemoApplication.class, args);
    }

}
