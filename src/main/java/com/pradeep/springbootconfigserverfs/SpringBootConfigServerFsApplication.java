package com.pradeep.springbootconfigserverfs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;


@EnableConfigServer
@SpringBootApplication
public class SpringBootConfigServerFsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootConfigServerFsApplication.class, args);
	}

}
