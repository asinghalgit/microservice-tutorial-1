package com.learn.microservice.FinanceService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FinanceServiceController {

    @GetMapping(value = "/salary")
    public Integer getEmployeeSalary() {
        return 12000;
    }
}
