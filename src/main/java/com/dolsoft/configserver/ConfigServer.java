package com.dolsoft.configserver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;


@SpringBootApplication
@EnableConfigServer
public class ConfigServer {

	@Autowired
	public static void main(String[] args) {
		SpringApplication.run(ConfigServer.class, args);
	}

}
