package com.department.api.service;

import java.util.List;

import com.department.api.model.Department;

public interface DepartmentService {
	void saveDepartmet(Department dept);
	void saveDepartments(List<Department> dept);
	public List<Department>  getAllDepartments();
	public Department getDepatmentById(String deptId);

}
