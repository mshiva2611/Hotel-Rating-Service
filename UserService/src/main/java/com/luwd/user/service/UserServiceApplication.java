package com.luwd.user.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class UserServiceApplication {


	public static void main(String[] args) {

		SpringApplication.run(UserServiceApplication.class, args);

		System.out.println("Start Ho Gya Hun Saheb");

	}

}
