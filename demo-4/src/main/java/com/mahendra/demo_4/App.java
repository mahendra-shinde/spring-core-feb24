package com.mahendra.demo_4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Hello world!
 *
 */
public class App 
{
	static final String URL="jdbc:mysql://20.219.229.165:3306/hr";
	static final String USER="mahendra";
	static final String PASS="pass@1234";
	
    public static void main( String[] args )
    {
        // Step 1 : Load JDBC Driver
    	
    	try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return;
		}
    	
    	// Step 2: Connect the database
    	Connection con = null;
    	try {
    	con = DriverManager.getConnection(URL, USER, PASS);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return;
		}
    	
    	// Step 3 : Exceute a Query and get the results
    	
    	
    	ResultSet ts;
		try {
			Statement st = con.createStatement();
			ts = st.executeQuery("select emp_no, first_name, last_name from employees");
			System.out.println("Emp No | FIRSTNAME      |  LASTNAME    ");
			while(ts.next()) {
				System.out.printf("\n%6d | %-20s | %-20s ", ts.getInt(1), ts.getString(2), ts.getString(3));
				
	    	}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return;
		}
    	
		
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	
    }
}
