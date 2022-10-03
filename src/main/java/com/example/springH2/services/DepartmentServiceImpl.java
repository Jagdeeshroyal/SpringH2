package com.example.springH2.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springH2.entity.Department;
import com.example.springH2.repository.DepartmentRepo;

@Service
public class DepartmentServiceImpl implements DepartmentService{
	
	@Autowired
	private DepartmentRepo dptRepo;

	@Override
	public Department saveDpt(Department dpt) {
		return dptRepo.save(dpt);
		
	}

}
