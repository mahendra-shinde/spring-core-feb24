package com.mahendra.demo1;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmployeeRowMapper implements RowMapper<Employee> 
{

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee emp = new Employee();
		int empId = rs.getInt("emp_no");
		String fname = rs.getString("first_name");
		String lname = rs.getString("last_name");
		
		emp.setEmpId(empId);
		emp.setFirstName(fname);
		emp.setLastName(lname);
		return emp;
	}
	
}
