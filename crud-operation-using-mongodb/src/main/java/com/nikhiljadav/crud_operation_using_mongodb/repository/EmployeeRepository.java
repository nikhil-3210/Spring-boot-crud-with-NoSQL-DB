package com.nikhiljadav.crud_operation_using_mongodb.repository;

import com.nikhiljadav.crud_operation_using_mongodb.entity.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, String> {
}
