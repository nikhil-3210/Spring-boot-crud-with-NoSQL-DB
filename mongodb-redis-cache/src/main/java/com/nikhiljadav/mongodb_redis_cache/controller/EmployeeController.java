package com.nikhiljadav.mongodb_redis_cache.controller;

import com.nikhiljadav.mongodb_redis_cache.entity.Employee;
import com.nikhiljadav.mongodb_redis_cache.service.EmployeeService;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeController.class);

    @Autowired
    private EmployeeService employeeService;

    @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Employee> getAllEmployeeDetails(){
        LOGGER.info("Inside getAllEmployeeDetails method");
        return employeeService.getAllEmployeeDetails();
    }

    @GetMapping(value = "/{uuid}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Employee getEmployeeById(@PathVariable("uuid") String uuid){
        LOGGER.info("Inside getEmployeeById method");
        return employeeService.getEmployeeByUUID(uuid);
    }

    @PostMapping(value = "/", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Employee createEmployeeRecord(@Valid @RequestBody Employee employee){
        LOGGER.info("Inside createEmployeeRecord method");
        return employeeService.createEmployeeRecord(employee);
    }

    @PostMapping(value = "/multi", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Employee> createMultipleEmployeeRecord(@Valid @RequestBody List<Employee> employeeList){
        LOGGER.info("Inside createMultipleEmployeeRecord method");
        return employeeService.createMultipleEmployeeRecord(employeeList);
    }

    @PutMapping(value = "/{uuid}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Employee updateEmployeeRecord(@PathVariable("uuid") String uuid,@Valid @RequestBody Employee employee){
        LOGGER.info("Inside updateEmployeeRecord method");
        return employeeService.updateEmployeeRecord(uuid, employee);
    }

    @DeleteMapping(value = "{uuid}")
    public String deleteEmployeeRecord(@PathVariable("uuid") String uuid){
        LOGGER.info("Inside deleteEmployeeRecord method");
        employeeService.deleteEmployeeRecordByUUID(uuid);
        return String.format("Employee record with %s employee uuid deleted successfully", uuid);
    }
}
