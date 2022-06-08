package com.vipul.web.dao;

import java.sql.DriverManager;
import java.sql.*;
import com.vipul.web.model.Employee;

public class EmployeeDao {
	
	public Employee getEmployee(int uId) {
		Employee e = new Employee();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","Vipul@060101");
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("select * from employee where empId=" + uId);
			if(rs.next()) {
				e.setEmpName(rs.getString("empName"));
				e.setSalary(rs.getDouble("salary"));
				e.setGender(rs.getString("gender"));
			}
			
		} catch (Exception e1) {
			// TODO: handle exception
		}
		
		return e;
		
	}
	
}
