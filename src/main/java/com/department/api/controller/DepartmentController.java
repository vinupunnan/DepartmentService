package com.department.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {

	@RequestMapping("/dept")
	public String getDepartment() {
		return "Department List";
	}
}
