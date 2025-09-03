package com.tanfed.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class GatewayServerApplication {
	
	@GetMapping("/test")
	public String test() throws Exception {
		return "Service Deployed Successfully!";
	}

	public static void main(String[] args) {
		SpringApplication.run(GatewayServerApplication.class, args);
	}

}
