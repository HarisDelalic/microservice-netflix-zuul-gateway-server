package com.dela.microservicenetflixzuulgatewayserver;

import brave.sampler.Sampler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class MicroserviceNetflixZuulGatewayServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceNetflixZuulGatewayServerApplication.class, args);
    }

    //    for sleuth
    @Bean
    public Sampler defaultSampler() {
        return Sampler.ALWAYS_SAMPLE;
    }

}
