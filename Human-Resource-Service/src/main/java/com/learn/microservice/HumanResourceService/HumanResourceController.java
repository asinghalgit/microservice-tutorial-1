package com.learn.microservice.HumanResourceService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class HumanResourceController {

    @GetMapping(value = "/joiningDate")
    public LocalDate getJoiningDate() {
        return LocalDate.now();
    }
}
