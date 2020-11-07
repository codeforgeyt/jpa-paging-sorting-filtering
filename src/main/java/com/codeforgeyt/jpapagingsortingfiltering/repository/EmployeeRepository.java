package com.codeforgeyt.jpapagingsortingfiltering.repository;

import com.codeforgeyt.jpapagingsortingfiltering.model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
