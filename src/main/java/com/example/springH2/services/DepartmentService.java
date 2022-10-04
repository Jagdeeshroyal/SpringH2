package com.example.springH2.services;

import java.util.List;

import com.example.springH2.entity.Department;
import com.example.springH2.error.DepartmentNotFoundException;


public interface DepartmentService {

	Department saveDpt(Department dpt);

	List<Department> fetchAll();

	Department fetchById(Long dptId) throws DepartmentNotFoundException;

	void deleteById(Long dptId);

	Department updateDepartmentById(Long dptId, Department dpt);

	Department fetchByName(String dptName);

	Department fetchByNameIgnoreCase(String dptName);

}
