package com.nikhiljadav.mongodb_redis_cache.service;

import com.nikhiljadav.mongodb_redis_cache.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployeeDetails();

    Employee getEmployeeByUUID(String uuid);

    Employee createEmployeeRecord(Employee employee);

    List<Employee> createMultipleEmployeeRecord(List<Employee> employeeList);

    Employee updateEmployeeRecord(String uuid, Employee employee);

    void deleteEmployeeRecordByUUID(String uuid);
}
