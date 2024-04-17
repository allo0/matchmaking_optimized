package com.topas404.matchmaking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.topas404.matchmaking","com.topas404.matchmaking.controllers"})
public class MatchmakingApplication {

	public static void main(String[] args) {
		SpringApplication.run(MatchmakingApplication.class, args);
	}

}
