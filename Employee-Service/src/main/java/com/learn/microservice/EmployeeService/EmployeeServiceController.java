package com.learn.microservice.EmployeeService;

import com.learn.microservice.finance.service.api.FinanceServiceControllerApi;
import com.learn.microservice.human.resource.service.api.HumanResourceControllerApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeServiceController {

    @Autowired
    private HumanResourceControllerApi humanResourceControllerApi;

    @Autowired
    private FinanceServiceControllerApi financeServiceControllerApi;

    @GetMapping(value = "/employee/{id}")
    public Employee getEmployeeDetails(@PathVariable Integer id) {
        return Employee.builder()
                .employeeId(id)
                .joiningDate(humanResourceControllerApi.getJoiningDate())
                .salary(financeServiceControllerApi.getEmployeeSalary())
                .build();
    }
}
