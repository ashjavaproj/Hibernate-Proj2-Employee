package com.kyc.test;

import java.util.Scanner;
import org.hibernate.Session;
import com.kyc.model.Employee;
import com.kyc.utility.HibernateUtil;

public class Main {

	Scanner sc=new Scanner(System.in);
	 public void setEmpInfo()
     {
    	 Session session=HibernateUtil.getSessionFactory().openSession();
    	 
    	  Employee emp=new Employee();
    	  System.out.println("Enter Employee Information ");
    	  System.out.print("Employee ID            = ");
    	   emp.setEmployeeId(sc.nextInt());
    	   System.out.print("Employee Name         = ");
    	   emp.setEmployeeName(sc.next());
    	   System.out.print("Employee Address      = ");
    	   emp.setAddress(sc.next());
    	   System.out.print("Employee Sallery      = ");
    	   emp.setSallery(sc.nextFloat());
    	   System.out.print("Employee Designation  = ");
    	   emp.setDesig(sc.next());
    	   System.out.print("Company Name          = "); 
    	   emp.setComName(sc.next());
    	   
    	   session.save(emp);
    	 
    	   session.beginTransaction().commit();
    	   System.out.println("**** Successfully Inserted ****");
     }
     public void getEmpInfo()
     {
    	 Session session=HibernateUtil.getSessionFactory().openSession();
    	 
    	       Employee emp = session.get(Employee.class, 1);
               System.out.print("  "+emp.getEmployeeId());
    	       System.out.print("     "+emp.getEmployeeName());
    	       System.out.print("     "+emp.getAddress());
    	       System.out.print("     "+emp.getSallery());
    	       System.out.print("     "+emp.getDesig());
    	       System.out.print("     "+emp.getComName());
    	       System.out.println();
    	       
    	       
     }
     public void loadEmpInfo()
     {
    	 
    	 Session session=HibernateUtil.getSessionFactory().openSession();
    	 System.out.print("Enter Employee Id U want to Display = ");
    	 int eid=sc.nextInt();
    	
    	Employee emp= session.load(Employee.class, eid);
    	
    	  System.out.print("  "+emp.getEmployeeId());
	       System.out.print("     "+emp.getEmployeeName());
	       System.out.print("     "+emp.getAddress());
	       System.out.print("     "+emp.getSallery());
	       System.out.print("     "+emp.getDesig());
	       System.out.print("     "+emp.getComName());
	       System.out.println();
	     }
     public void updateEmp()
     {
    	 Session session=HibernateUtil.getSessionFactory().openSession();
    	 System.out.print("Enter Employee Id U want to Update = ");
    	int eid=sc.nextInt();
    	 
    	            Employee emp= session.get(Employee.class, 1);
    	            System.out.print("Enter New Address     : ");
    	            emp.setAddress(sc.next());
    	            System.out.print("Enter New Designation : ");
    	            emp.setDesig(sc.next());
    	            System.out.println("Enter New Sallery   :");
    	            emp.setSallery(sc.nextFloat());
    	            
    	            session.update(emp);
    	            session.beginTransaction().commit();
    	            System.out.println("****Successfully Updated****");
     }
     public void deleteEmp()
     {
    	 System.out.print("Enter Employee Id U want to Delete = ");
    	 int eid=sc.nextInt();
    	
    	 Session session =HibernateUtil.getSessionFactory().openSession();
    	  Employee  emp= session.get(Employee.class, eid);
    	  session.delete(emp);
    	  session.beginTransaction().commit();
    	  System.out.println("**** Successfully Deleted ****");
     }
     public static void main(String[] args) {
    	 Scanner sc=new Scanner(System.in);
		Main main=new Main();
		while(true)
		{
		System.out.println("1=Insert Records ");
		System.out.println("2=Display Records using get()");
		System.out.println("3=Display Records using load()");
		System.out.println("4=Update Records ");
		System.out.println("5=Delete Records ");
		System.out.print("Enter Choice : ");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:	main.setEmpInfo();
		break;
		
		case 2: main.getEmpInfo();
		break;
		
		case 3: main.loadEmpInfo();
		break;
		
		case 4: main.updateEmp();
		break;
		
		case 5: main.deleteEmp();
		break;
		}
	}
}

}
