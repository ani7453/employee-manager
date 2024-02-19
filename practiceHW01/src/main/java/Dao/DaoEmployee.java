package Dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;

import Model.employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DaoEmployee implements implEmployee{
	
	public static void main(String[] args) {
		
		
//		employee e = (employee) new DaoEmployee().queryById(2);
//		System.out.println(e.getDepartment()+"\t"+e.getEmpName()+"\t"+e.getDepartment()+"\t"+e.getDateOfJoin());
		
		
//		new DaoEmployee().deleteEmp(10);
		
		
//[Create]
//		DateFormat format = new SimpleDateFormat("MM-DD-YYYY");
//		Date sqlDate;
//		try {
//			sqlDate = new Date(format.parse("02-14-2024").getTime());
//			employee eem = new employee("Emmeline","IT", sqlDate);
//			new DaoEmployee().addEmp(eem);
//		} catch (ParseException e) {
//			e.printStackTrace();
//		}
		
//[convertDate]
//		String date = "2024-01-01";
//		
//		Date sqlDate = new DaoEmployee().convertDate(date);
//		
//		System.out.println(sqlDate);
		
		
//[Query All]		
//		List<Object> list = new DaoEmployee().queryAll();
//		employee[] empArr = list.toArray( new employee[list.size()] );
//		for(employee e : empArr) {
//			System.out.println(e.getEmpId()+"\t"+e.getEmpName()+"\t\t"+e.getDepartment()+"\t\t"+e.getDateOfJoin()+"\n");	
//		}
		
		
//[Update]		
		
//		Date sqlDate = new DaoEmployee().convertDate(2024, 02, 14);
//		
//		employee e = (employee) new DaoEmployee().queryById(13);
//		e.setEmpName("Potter");
//		e.setDepartment("MARKETING");
//		e.setDateOfJoin(sqlDate);
//		new DaoEmployee().updateEmp(e);
//		System.out.println(e.getEmpId()+"\t"+e.getEmpName()+"\t"+e.getDepartment()+"\t"+e.getDateOfJoin());
		
		
		
		
	}
	
	
	
	@Override
	public void addEmp(Object o) {
		int status= -1;
		String sql="INSERT INTO dbudemyhw01.employee (empName, Department, DateOfJoin) VALUES (?,?,?)";
		//get Connection
		Connection conn = Conn.getDB();
		//alter employee obj
		employee emp = (employee) o;
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, emp.getEmpName());
			ps.setString(2, emp.getDepartment());
			ps.setDate(3, emp.getDateOfJoin());
			status = ps.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		if(status == -1) {
			System.out.println("Create Failure");
		}else {
			System.out.println("Create success");
		}
		
	}
	
	@Override
	public List<Object> queryAll() {
		String sql = "SELECT * FROM dbudemyhw01.employee";
		Connection conn = Conn.getDB();
		List<Object> list = new ArrayList();
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				employee emp = new employee();
				emp.setEmpId(rs.getInt("empId"));
				emp.setEmpName(rs.getString("empName"));
				emp.setDepartment(rs.getString("Department"));
				emp.setDateOfJoin(rs.getDate("DateOfJoin"));
				list.add(emp);
			}
			
		}catch(SQLException e) { e.printStackTrace(); }
		
		return list;
	}
	
	@Override
	public Object queryById(int empId) {
		String sql = "SELECT * FROM dbudemyhw01.employee WHERE empId=?";
		Connection conn = Conn.getDB();
		employee emp = null;
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, empId);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				emp = new employee();
				emp.setEmpId(rs.getInt("empId"));
				emp.setEmpName(rs.getString("empName"));
				emp.setDepartment(rs.getString("Department"));
				emp.setDateOfJoin(rs.getDate("DateOfJoin"));
			}
			
		}catch(SQLException e) { e.printStackTrace(); }
		
		return emp;
	}

	@Override
	public Object queryByName(String name) {
		String sql = "SELECT * FROM dbudemyhw01.employee WHERE name=?";
		Connection conn = Conn.getDB();
		employee emp = null;
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, name);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				emp = new employee();
				emp.setEmpId(rs.getInt("empId"));
				emp.setEmpName(rs.getString("empName"));
				emp.setDepartment(rs.getString("Department"));
				emp.setDateOfJoin(rs.getDate("DateOfJoin"));
			}
			
		}catch(SQLException e) { e.printStackTrace(); }
		
		return emp;
	}

	@Override
	public List<Object> queryByDepart(String department) {
		String sql = "SELECT * FROM dbudemyhw01.employee WHERE department=?";
		Connection conn = Conn.getDB();
		List<Object> list = new ArrayList();
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, department);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				employee emp = new employee();
				emp.setEmpId(rs.getInt("empId"));
				emp.setEmpName(rs.getString("empName"));
				emp.setDepartment(rs.getString("Department"));
				emp.setDateOfJoin(rs.getDate("DateOfJoin"));
				list.add(emp);
			}
			
		}catch(SQLException e) { e.printStackTrace(); }
		
		return list;
	}

	@Override
	public List<Object> queryByDate(Date date) {
		String sql = "SELECT * FROM dbudemyhw01.employee WHERE department=?";
		Connection conn = Conn.getDB();
		List<Object> list = new ArrayList();
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setDate(1, date);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				employee emp = new employee();
				emp.setEmpId(rs.getInt("empId"));
				emp.setEmpName(rs.getString("empName"));
				emp.setDepartment(rs.getString("Department"));
				emp.setDateOfJoin(rs.getDate("DateOfJoin"));
				list.add(emp);
			}
			
		}catch(SQLException e) { e.printStackTrace(); }
		
		return list;
	}

	@Override
	public Object updateEmp(Object o) {
		String sql ="UPDATE dbudemyhw01.employee \n"
					+ "SET empName=?, Department=?, DateOfJoin=? \n"
					+ "WHERE empId=?";
		Connection conn = Conn.getDB();
		employee emp = (employee) o;
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, emp.getEmpName());
			ps.setString(2, emp.getDepartment());
			ps.setDate(3, emp.getDateOfJoin());
			ps.setInt(4, emp.getEmpId());
			ps.executeUpdate();
		}catch(SQLException e) { e.printStackTrace(); }
		
		
		return emp;
	}

	@Override
	public void deleteEmp(int empId) {
		String sql ="DELETE FROM employee WHERE empId=?";
		Connection conn = Conn.getDB();
	
	try {
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, empId);
		ps.executeUpdate();
	}catch(SQLException e) { e.printStackTrace(); }
	
	}



	@Override
	public Date convertDate(int y, int m, int d) {
		LocalDate localDate = LocalDate.of(y, m, d);
	    Date sqldate = Date.valueOf(localDate);
		return sqldate;
	}
	
	@Override
	public Date convertDate(String date) {
		int y, m, d;
		y = Integer.parseInt(date.substring(0, 4));
		m = Integer.parseInt(date.substring(5, 7));
		d = Integer.parseInt(date.substring(8));
		
		LocalDate localDate = LocalDate.of(y, m, d);
	    Date sqldate = Date.valueOf(localDate);
		return sqldate;
	}
	

}
