package com.klef.jfsd.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootMvcsdpProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMvcsdpProjectApplication.class, args);
		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Hammaya....Project is running..!!");
	}

}
