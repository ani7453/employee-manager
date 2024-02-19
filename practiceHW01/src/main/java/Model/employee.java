package Model;

import java.sql.Date;

public class employee {
	
	private int empId;
	private String empName;
	private String Department;
	private Date DateOfJoin;
	
	public employee() { super(); }
	
	public employee(String name, String department, Date date) { 
		super();
		empName = name;
		Department = department;
		DateOfJoin = date;
	}

	
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	public Date getDateOfJoin() {
		return DateOfJoin;
	}
	public void setDateOfJoin(Date dateOfJoin) {
		DateOfJoin = dateOfJoin;
	}
	
	
	
	
}
