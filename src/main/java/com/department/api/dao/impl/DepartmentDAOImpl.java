package com.department.api.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.department.api.dao.DepartmentDAO;
import com.department.api.model.Department;

@Repository
public class DepartmentDAOImpl extends JdbcDaoSupport implements DepartmentDAO {
	
	@Autowired 
	DataSource dataSource;
	
	@PostConstruct
	private void initialize(){
		setDataSource(dataSource);
	}
	
	

	@Override
	public void insertDepartment(Department dept) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertDepartments(List<Department> depts) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Department> getAllDepartments() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Department getDepartmentById(String deptId) {
		
		String sql = "SELECT * FROM department WHERE dept_id = ?";
		return (Department)getJdbcTemplate().queryForObject(sql, new Object[]{deptId}, new RowMapper<Department>(){
			@Override
			public Department mapRow(ResultSet rs, int rwNumber) throws SQLException {
				Department dept = new Department();
				dept.setDeptId(rs.getString("dept_id"));
				dept.setDeptLocation(rs.getString("dept_location"));
             	dept.setDeptName(rs.getString("dept_name"));
				return dept;
			}
		});
	
		}


	


}


