package com.example.springH2.services;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springH2.entity.Department;
import com.example.springH2.error.DepartmentNotFoundException;
import com.example.springH2.repository.DepartmentRepo;

@Service
public class DepartmentServiceImpl implements DepartmentService{
	
	@Autowired
	private DepartmentRepo dptRepo;

	@Override
	public Department saveDpt(Department dpt) {
		return dptRepo.save(dpt);
		
	}

	@Override
	public List<Department> fetchAll() {
		// TODO Auto-generated method stub
		return dptRepo.findAll();
	}

	@Override
	public Department fetchById(Long dptId) throws DepartmentNotFoundException {
		// TODO Auto-generated method stub
		Optional<Department> dp =  dptRepo.findById(dptId);
		
		if(!dp.isPresent()) {
			throw new DepartmentNotFoundException("No department found with Id: "+dptId);
		}
		return dp.get();
	}

	@Override
	public void deleteById(Long dptId) {
		// TODO Auto-generated method stub
		dptRepo.deleteById(dptId);
	}

	@Override
	public Department updateDepartmentById(Long dptId, Department dpt) {
		// TODO Auto-generated method stub
		Department tempDpt = dptRepo.findById(dptId).get();
		if(Objects.nonNull(dpt.getDepartmentName()) && 
				!"".equalsIgnoreCase(dpt.getDepartmentName())) {
			tempDpt.setDepartmentName(dpt.getDepartmentName());
		}
		
		if(Objects.nonNull(dpt.getDepartmentAddress()) && 
				!"".equalsIgnoreCase(dpt.getDepartmentAddress())) {
			tempDpt.setDepartmentAddress(dpt.getDepartmentAddress());
		}
		
		if(Objects.nonNull(dpt.getDepartmentCode()) && 
				!"".equalsIgnoreCase(dpt.getDepartmentCode())) {
			tempDpt.setDepartmentCode(dpt.getDepartmentCode());
		}

		 return dptRepo.save(tempDpt);
		
	}

	@Override
	public Department fetchByName(String dptName) {
		// TODO Auto-generated method stub
		return dptRepo.findByDepartmentName(dptName);
	}
	
	@Override
	public Department fetchByNameIgnoreCase(String dptName) {
		// TODO Auto-generated method stub
		return dptRepo.findByDepartmentNameIgnoreCase(dptName);
	}
	
	
	
	

}
