package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conn {
	public static void main(String[] args) {
		System.out.println(Conn.getDB());
	}
	
	public static Connection getDB() {
		
		Connection conn= null;
//		String url="jdbc:mysql://localhost:3306/dbudemyhw01?UseUnicode=true &amt; caracterEncodeing=UTF-8";
		String url="jdbc:mysql://localhost:3306/dbudemyhw01";
		String user="root";
		String password = "project4M";
		
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn= DriverManager.getConnection(url, user, password);
			
		}catch(SQLException ex){
			ex.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	
}
