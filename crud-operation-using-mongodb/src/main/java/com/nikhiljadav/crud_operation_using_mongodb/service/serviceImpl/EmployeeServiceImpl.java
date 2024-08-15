package com.nikhiljadav.crud_operation_using_mongodb.service.serviceImpl;

import com.nikhiljadav.crud_operation_using_mongodb.entity.Employee;
import com.nikhiljadav.crud_operation_using_mongodb.repository.EmployeeRepository;
import com.nikhiljadav.crud_operation_using_mongodb.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeServiceImpl.class);

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployeeDetails() {
        LOGGER.info("Inside getAllEmployeeDetails service method");
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeByUUID(String uuid) {
        LOGGER.info("Inside getEmployeeByUUID service method");
        return employeeRepository.findById(uuid).orElse(new Employee());
    }

    @Override
    public Employee createEmployeeRecord(Employee employee) {
        LOGGER.info("Inside createEmployeeRecord service method");
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> createMultipleEmployeeRecord(List<Employee> employeeList) {
        LOGGER.info("Inside createMultipleEmployeeRecord service method");
        return employeeRepository.saveAll(employeeList);
    }

    @Override
    public Employee updateEmployeeRecord(String uuid, Employee employee) {
        LOGGER.info("Inside updateEmployeeRecord service method");
        Employee fetchedEmployee = employeeRepository.findById(uuid).orElse(null);
        if (Objects.nonNull(employee)){
            fetchedEmployee.setFirstName(employee.getFirstName());
            fetchedEmployee.setLastName(employee.getLastName());
            fetchedEmployee.setDepartment(employee.getDepartment());
            fetchedEmployee.setSalary(employee.getSalary());
        }
        return fetchedEmployee;
    }

    @Override
    public void deleteEmployeeRecordByUUID(String uuid) {
        LOGGER.info("Inside deleteEmployeeRecordByUUID service method");
        employeeRepository.deleteById(uuid);
    }
}
