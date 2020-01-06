package com.department.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.department.api.model.Department;
import com.department.api.service.DepartmentService;
import com.department.api.service.impl.DepartmentServiceimpl;

@RestController
public class DepartmentController {
	

	@Autowired
	private DepartmentService deptService;

	@RequestMapping("/depts/{id}")
	public Department getDepartment(@PathVariable String id ) {
		
		return deptService.getDepatmentById(id);
	}
}
