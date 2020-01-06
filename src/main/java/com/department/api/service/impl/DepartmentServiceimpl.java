package com.department.api.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.department.api.dao.DepartmentDAO;
import com.department.api.model.Department;
import com.department.api.service.DepartmentService;

@Service
public class DepartmentServiceimpl implements DepartmentService {
    @Autowired
	DepartmentDAO deptDao;
	
	@Override
	public void saveDepartmet(Department dept) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveDepartments(List<Department> dept) {
		// TODO Auto-generated method stub
		
	}

	
	@Override
	public Department getDepatmentById(String deptId) {
		Department dept = deptDao.getDepartmentById(deptId);
		return dept;
		
		
	}

	@Override
	public List<Department> getAllDepartments() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
