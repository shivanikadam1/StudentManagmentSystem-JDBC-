package com.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dao.StudentDao;

import com.entity.Student;

public class StudentDaoImpl implements StudentDao {

	@Override
	
		public List<Student> findAll() throws ClassNotFoundException, SQLException
		{
		ArrayList<Student>list=new ArrayList<Student>();
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/8657capgemini","root","root");
		PreparedStatement statement=con.prepareStatement("select * from studentdetails");
		ResultSet rs=statement.executeQuery();
		while(rs.next())
		{
			Student s=new Student();
			s.setStudid(rs.getInt(1));
			s.setFirstname(rs.getString(2));
			s.setLastname(rs.getString(3));
			s.setAddress(rs.getString(4));
			s.setDateofbirth(rs.getString(5));
			s.setAge(rs.getInt(6));
			s.setPhoneno(rs.getString(7));
			list.add(s);
		}
		con.close();
		return list;
		}
		
	

	@Override
	public void insertStudent(Student s) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/8657capgemini","root","root");
		PreparedStatement statement=con.prepareStatement("insert into studentdetails values(?,?,?,?,?,?,?)");
		statement.setInt(1, s.getStudid());
		statement.setString(2,s.getFirstname());
		statement.setString(3,s.getLastname());
		statement.setString(4, s.getAddress());
		statement.setString(5, s.getDateofbirth());
		statement.setInt(6, s.getAge());
		statement.setString(7, s.getPhoneno());
		statement.executeUpdate();
		con.close();
		
		
	}

	@Override
	public void updateStudent(Student s) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/8657capgemini","root","root");
		PreparedStatement statement=con.prepareStatement("update studentdetails set firstname=?,lastname=?,address=?,dateofbirth=?,age=?,phoneno=? where studid=?");
	
		statement.setString(1,s.getFirstname());
		statement.setString(2,s.getLastname());
		statement.setString(3, s.getAddress());
		statement.setString(4, s.getDateofbirth());
		statement.setInt(5, s.getAge());
		statement.setString(6, s.getPhoneno());
		statement.setInt(7, s.getStudid());
		statement.executeUpdate();
		con.close();
		
		
		
	}

	@Override
	public void deleteStudent( Student s) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/8657capgemini","root","root");
		PreparedStatement statement=con.prepareStatement("delete from  studentdetails where studid=? ");
		
		statement.setInt(1, s.getStudid());
		statement.executeUpdate();
		con.close();
	}




	

}
