package com.learn.microservice.human.resource.service.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;

@FeignClient(value = "HUMAN-RESOURCE-SERVICE")
public interface HumanResourceControllerApi {

    @GetMapping(value = "/joiningDate")
    LocalDate getJoiningDate();
}
