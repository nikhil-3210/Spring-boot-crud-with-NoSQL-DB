package com.nikhiljadav.mongodb_redis_cache.repository;

import com.nikhiljadav.mongodb_redis_cache.entity.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, String> {
}
