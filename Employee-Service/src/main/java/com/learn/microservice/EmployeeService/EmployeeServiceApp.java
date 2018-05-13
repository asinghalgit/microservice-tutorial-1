package com.learn.microservice.EmployeeService;

import com.learn.microservice.finance.service.api.FinanceServiceControllerApi;
import com.learn.microservice.human.resource.service.api.HumanResourceControllerApi;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackageClasses = {HumanResourceControllerApi.class,
        FinanceServiceControllerApi.class})
@EnableDiscoveryClient
@SpringBootApplication
public class EmployeeServiceApp {

    public static void main(String[] args) {
        SpringApplication.run(EmployeeServiceApp.class, args);
    }
}
