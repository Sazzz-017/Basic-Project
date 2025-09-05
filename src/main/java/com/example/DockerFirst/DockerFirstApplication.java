package com.example.DockerFirst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DockerFirstApplication {

    public static int add(int a, int b) {
        return a + b;
    }
    public static int mul(int a,int b){
        return a*b;
    }
    public static int div(int a,int b){
        return a/b;
    }
    public static int min(int a,int b){
        return a-b;
    }

    public static void main(String[] args) {
        SpringApplication.run(DockerFirstApplication.class, args);
        System.out.println("App running... sum(2,3) = " + add(2, 3));
    }
}
