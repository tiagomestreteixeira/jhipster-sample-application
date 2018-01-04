package io.github.jhipster.application.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;

public class SimpleFeignClientConfiguration {

    @Bean
    public Logger.Level feignLogger() {
        return Logger.Level.BASIC;
    }
}
