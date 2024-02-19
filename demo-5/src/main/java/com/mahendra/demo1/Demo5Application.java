package com.mahendra.demo1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class Demo5Application implements CommandLineRunner{

	@Autowired private JdbcTemplate template;
	
	public static void main(String[] args) {
		SpringApplication.run(Demo5Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Employee> emps =  template.query("select emp_no, first_name, last_name from employees", new EmployeeRowMapper());
		int count = emps.size();
		System.out.println("Employee count "+count);
	}

}
