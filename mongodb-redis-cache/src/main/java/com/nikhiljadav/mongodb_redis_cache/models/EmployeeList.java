package com.nikhiljadav.mongodb_redis_cache.models;

import java.util.List;

public class EmployeeList {

    private List<EmployeePojo> employeePojos;

    public List<EmployeePojo> getEmployeePojos() {
        return employeePojos;
    }

    public EmployeeList setEmployeePojos(List<EmployeePojo> employeePojos) {
        this.employeePojos = employeePojos;
        return this;
    }
}
