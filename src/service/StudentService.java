package service;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.dao.impl.StudentDaoImpl;
import com.entity.Student;


public class StudentService {
	public void ViewAll() throws ClassNotFoundException, SQLException
	{
		List<Student>list=new StudentDaoImpl().findAll();
		for(Student s:list)
		{
			System.out.println(s);
		}
	}
	public void insertStudent() throws ClassNotFoundException, SQLException
	{
		Student s=new Student();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Id: ");
		int studid=sc.nextInt();
		System.out.println("Enter the First Name: ");
		String firstname=sc.next();
		System.out.println("Enter the Last Name: ");
		String lastname=sc.next();
		System.out.println("Enter the Address: ");
		String address=sc.next();
		System.out.println("Enter the Date Of Birth: ");
		String dateofbirth=sc.next();
		System.out.println("Enter Your Age: ");
		int age=sc.nextInt();
		System.out.println("Enter Your Phone no: ");
		String phoneno=sc.next();
		s.setStudid(studid);
		s.setFirstname(firstname);
		s.setLastname(lastname);
		s.setAddress(address);
		s.setDateofbirth(dateofbirth);
		s.setAge(age);
		s.setPhoneno(phoneno);
		new StudentDaoImpl().insertStudent(s);
	}
	public void updateStudent() throws ClassNotFoundException, SQLException
	{
		Student s=new Student();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the First Name: ");
		String firstname=sc.next();
		System.out.println("Enter the Last Name: ");
		String lastname=sc.next();
		System.out.println("Enter the Address: ");
		String address=sc.next();
		System.out.println("Enter the Date Of Birth: ");
		String dateofbirth=sc.next();
		System.out.println("Enter Your Age: ");
		int age=sc.nextInt();
		System.out.println("Enter Your Phone no: ");
		String phoneno=sc.next();
		System.out.println("Enter the Id: ");
		int studid=sc.nextInt();
		s.setStudid(studid);
		s.setFirstname(firstname);
		s.setLastname(lastname);
		s.setAddress(address);
		s.setDateofbirth(dateofbirth);
		s.setAge(age);
		s.setPhoneno(phoneno);
	
		new StudentDaoImpl().updateStudent(s);
	}
	public void deleteStudent() throws ClassNotFoundException, SQLException
	{
		Student s=new Student();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Id: ");
		int studid=sc.nextInt();
		s.setStudid(studid);
		new StudentDaoImpl().deleteStudent(s);
		
	}

}
