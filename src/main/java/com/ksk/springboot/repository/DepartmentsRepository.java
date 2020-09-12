package com.ksk.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ksk.springboot.model.Departments;

@Repository
public interface DepartmentsRepository extends JpaRepository<Departments, String> {

}
