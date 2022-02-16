package com.sbc.configuration;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfiguration {

    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r -> r.path("/register/**")
                        .uri("lb://REGISTRATION-SERVICE")
                        .id("registerModule"))
                .route(r -> r.path("/email/**")
                        .uri("lb://EMAIL-SERVICE")
                        .id("emailModule"))
                
                .build();
    }

}