package Dao;

import java.util.ArrayList;
import java.util.List;

import Model.department;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DaoDepartment implements implDepartment{
	
	public static void main(String[] args) {
		List list = new DaoDepartment().queryAll();
		System.out.println(list);
	}

	@Override
	public int addDepart(Object o) {
		int status=-1;
		String sql="INSERT INTO department (dpartName) VALUES (?)";
		Connection conn = Conn.getDB();
		department d = (department) o;
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, d.getDepartName());
			status = ps.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
				
		return status;
	}
	
	@Override
	public List<Object> queryAll() {
		String sql = "SELECT * FROM department";
		Connection conn = Conn.getDB();
		List<Object> list = new ArrayList();
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				department depart = new department();
				depart.setDepartId(rs.getInt("dpartId"));
				depart.setDepartName(rs.getString("DpartName"));
				list.add(depart);
			}
		}catch(SQLException e) { e.printStackTrace(); }
		return list;
	}
	
	@Override
	public Object queryById(int departId) {
		String sql = "SELECT * FROM department WHERE dpartId=?";
		Connection conn = Conn.getDB();
		department d = null;
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, departId);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				d= new department();
				d.setDepartId(rs.getInt("dpartId"));
				d.setDepartName(rs.getString("dspartName"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return d;
	}

	@Override
	public Object queryByName(String name) {
		String sql = "SELECT * FROM department WHERE dpartName=?";
		Connection conn = Conn.getDB();
		department d = null;
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, name);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				d= new department();
				d.setDepartId(rs.getInt("dpartId"));
				d.setDepartName(rs.getString("dpartName"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return d;
	}

	
	@Override
	public void deleteDepart(int departId) {
		String sql = "DELETE FROM department WHERE dpartId=?";
		Connection conn = Conn.getDB();
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, departId);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void updateDepart(Object o) {
		String sql = "UPDATE department SET dpartName=? WHERE dpartId=?";
		Connection conn = Conn.getDB();
		department d = (department) o;
		
		try {
			PreparedStatement ps = conn.prepareCall(sql);
			ps.setString(1, d.getDepartName());
			ps.setInt(2, d.getDepartId());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}



}
