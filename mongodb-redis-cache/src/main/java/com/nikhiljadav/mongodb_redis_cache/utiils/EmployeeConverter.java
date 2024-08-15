package com.nikhiljadav.mongodb_redis_cache.utiils;

import com.nikhiljadav.mongodb_redis_cache.entity.Employee;
import com.nikhiljadav.mongodb_redis_cache.models.EmployeePojo;

public class EmployeeConverter {

    public static EmployeePojo toPojo(Employee employee) {
        if (employee == null) {
            return null;
        }

        EmployeePojo pojo = new EmployeePojo();
        pojo.setUuid(employee.getUuid());
        pojo.setFirstName(employee.getFirstName());
        pojo.setLastName(employee.getLastName());
        pojo.setDepartment(employee.getDepartment());
        pojo.setSalary(employee.getSalary());

        return pojo;
    }

    public static Employee toEntity(EmployeePojo pojo) {
        if (pojo == null) {
            return null;
        }

        Employee employee = new Employee();
        employee.setUuid(pojo.getUuid());
        employee.setFirstName(pojo.getFirstName());
        employee.setLastName(pojo.getLastName());
        employee.setDepartment(pojo.getDepartment());
        employee.setSalary(pojo.getSalary());

        return employee;
    }
}
