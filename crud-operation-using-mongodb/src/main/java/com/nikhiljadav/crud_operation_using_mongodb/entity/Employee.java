package com.nikhiljadav.crud_operation_using_mongodb.entity;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Employee")
public class Employee {

    @Id
    private String uuid;

    @NotBlank(message = "Please provide valid firstname")
    private String firstName;

    @NotBlank(message = "Please provide valid lastname")
    private String lastName;

    @NotBlank(message = "Please provide valid department name")
    private String department;

    @Min(value = 1)
    @NotNull(message = "Please provide valid salary amount")
    private Double Salary;

    public String getUuid() {
        return uuid;
    }

    public Employee setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public Employee setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Employee setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Double getSalary() {
        return Salary;
    }

    public Employee setSalary(Double salary) {
        Salary = salary;
        return this;
    }

    public String getDepartment() {
        return department;
    }

    public Employee setDepartment(String department) {
        this.department = department;
        return this;
    }
}
