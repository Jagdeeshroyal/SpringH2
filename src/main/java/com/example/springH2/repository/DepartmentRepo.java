package com.example.springH2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springH2.entity.Department;

@Repository
public interface DepartmentRepo extends JpaRepository<Department,Long>{

	Department findByDepartmentName(String dptName);
	
	Department findByDepartmentNameIgnoreCase(String dptName);

}
