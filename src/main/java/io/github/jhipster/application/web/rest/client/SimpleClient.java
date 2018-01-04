package io.github.jhipster.application.web.rest.client;

import feign.Param;
import io.github.jhipster.application.config.SimpleFeignClientConfiguration;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@FeignClient(name = "myExample", configuration = SimpleFeignClientConfiguration.class)
public interface SimpleClient {
    @RequestMapping(method = RequestMethod.POST, value = "/auth")
    ResponseEntity<String> getSomeText(@Param("username") String username, @Param("password") String password);
}
