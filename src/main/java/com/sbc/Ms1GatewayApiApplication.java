package com.sbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.http.codec.ServerCodecConfigurer;

@SpringBootApplication
@EnableEurekaClient
public class Ms1GatewayApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ms1GatewayApiApplication.class, args);
	}

	/*
	 * @Bean public ServerCodecConfigurer serverCodecConfigurer() { return
	 * ServerCodecConfigurer.create(); }
	 */
}
