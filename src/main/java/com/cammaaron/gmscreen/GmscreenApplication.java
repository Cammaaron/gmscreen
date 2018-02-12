package com.cammaaron.gmscreen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GmscreenApplication {

	public static void main(String[] args) {
		System.out.println(String.format("Database url set at %s with username %s", System.getenv("DATASOURCE_URL"), System.getenv("DATASOURCE_USERNAME")));
		SpringApplication.run(GmscreenApplication.class, args);
	}
}
