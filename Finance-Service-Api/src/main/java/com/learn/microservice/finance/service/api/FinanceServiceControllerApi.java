package com.learn.microservice.finance.service.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "FINANCE-SERVICE")
public interface FinanceServiceControllerApi {

    @GetMapping(value = "/salary")
    Integer getEmployeeSalary();
}
