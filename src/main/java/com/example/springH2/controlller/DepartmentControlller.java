package com.example.springH2.controlller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springH2.entity.Department;
import com.example.springH2.error.DepartmentNotFoundException;
import com.example.springH2.services.DepartmentService;

@RestController
public class DepartmentControlller {
	
	@Autowired
	private DepartmentService dptServ;
	
	@PostMapping("/department")
	public Department save(@Valid @RequestBody Department dpt) {
		return dptServ.saveDpt(dpt);
	}
	
	@GetMapping("/departments")
	public List<Department> fetchAll() {
		return dptServ.fetchAll();
	}
	
	@GetMapping("/department/{id}")
	public Department fetchById(@PathVariable ("id")Long dptId) throws DepartmentNotFoundException
	{
		return dptServ.fetchById(dptId);
	}
	
	@DeleteMapping("/department/{id}")
	public String deleteById(@PathVariable("id")Long dptId) {
		dptServ.deleteById(dptId);
		return "Deleted "+dptId;
	}
	
	@PutMapping("/department/{id}")
	public Department updateDepartmentById(@PathVariable("id")Long dptId, @RequestBody Department dpt) {
		return dptServ.updateDepartmentById(dptId,dpt);
	}
	
	
	
	@GetMapping("/department/name/{dptName}")
	public Department fetchDepartmentByNameIgnoreCase(@PathVariable("dptName")String dptName) {
		return dptServ.fetchByNameIgnoreCase(dptName);
	}

}
