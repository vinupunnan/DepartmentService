package com.department.api.dao;

import java.util.List;

import com.department.api.model.Department;

public interface DepartmentDAO {
	
	void insertDepartment(Department dept);
	void insertDepartments(List<Department> depts);
	List<Department> getAllDepartments();
	Department getDepartmentById(String deptId);

}
