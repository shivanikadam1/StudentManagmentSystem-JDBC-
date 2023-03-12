package UI;

import java.sql.SQLException;
import java.util.Scanner;

import service.StudentService;



public class StudentMain {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String s;
		Scanner sc=new Scanner(System.in);
	      System.out.println("StudentManagementSystem");
	      System.out.println("1.View Studnt Details");
	      System.out.println("2.Add Student");
	      System.out.println("3.Update Student");
	      System.out.println("4.Delete Student");



	      System.out.println("EmployeeManagementSystem");
	  StudentService s1=new StudentService();

	      do
	      {
	    	  System.out.println("Enter the choice ");
	    	  int choice=sc.nextInt();
	    	  switch(choice)
	    	  {
	    	  case 1:
	    		 s1.ViewAll();
	    		  break;
	    	  case 2:
	    		  s1.insertStudent();
	    		break;
	    	  case 3:
	    		  s1.updateStudent();
	    		 break;
	    	  case 4:
	    		  s1.deleteStudent();
	    		  break;
	    		 
	    		  
	    	  }
	    	 
	    		 
	    	  System.out.println("do you want to continue");
	    	   s=sc.next();

	       }
		  while(s.equals("yes"));


		

	}

}
