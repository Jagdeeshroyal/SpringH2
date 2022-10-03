package com.example.springH2.controlller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springH2.entity.Department;
import com.example.springH2.services.DepartmentService;

@RestController
public class DepartmentControlller {
	
	@Autowired
	private DepartmentService dptServ;
	
	@PostMapping("/department")
	public Department save(@RequestBody Department dpt) {
		return dptServ.saveDpt(dpt);
	}

}
