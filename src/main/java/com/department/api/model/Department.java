package com.department.api.model;

public class Department {
	
	private String deptId;

	private String deptLocation;

	private String deptName;

	public Department() {
		}

	
	
	public Department(String deptId, String deptLocation, String deptName) {
		super();
		this.deptId = deptId;
		this.deptLocation = deptLocation;
		this.deptName = deptName;
	}

	public String getDeptId() {
		return deptId;
	}

	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}

	public String getDeptLocation() {
		return deptLocation;
	}

	public void setDeptLocation(String deptLocation) {
		this.deptLocation = deptLocation;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

		
	
}
