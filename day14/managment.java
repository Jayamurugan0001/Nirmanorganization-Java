package day14;

import java.util.Scanner;

public class managment {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		employee emp=new employee();
		
		boolean istrue=true;
		int choice;
		
		while (istrue) {
			System.out.println("select the option  ");
			System.out.println("1 to add the details  ");
			System.out.println("2 to update the details ");
			System.out.println("3 to show the details  ");
			System.out.println("enter your choice    ");
			choice = sc.nextInt();
			
			
			
		}{
			switch(choice) {
			case 1 :{
				System.out.println("enter id:  ");
				int id=sc.nextInt();
				System.out.println("enter name:  ");
				String name=sc.nextLine();
				System.out.println("enter phoneno: ");
                String phoneno=sc.nextLine();			
				System.out.println("enter the department:  ");
				String department=sc.nextLine();
				
				
				emp.setId(id);
				emp.setName(name);
				emp.setPhoneno(id);
				emp.setDepartment(department);
				
				
				System.out.println("good");
				break;
				 
				
		
				
				
			}
			
			
			
			case 2:{
				System.out.println("enter id:  ");
				int id=sc.nextInt();
				System.out.println("enter name:  ");
				String name=sc.nextLine();
				System.out.println("enter phoneno: ");
                String phoneno=sc.nextLine();			
				System.out.println("enter the department:  ");
				String department=sc.nextLine();
				
				
				emp.setId(id);
				emp.setName(name);
				emp.setPhoneno(id);
				emp.setDepartment(department);
				
				
				System.out.println("good");
				break;
			}
			case 3:{
				System.out.println(emp.toString());
				break;
			}
			case 0:{
				is true =false;
				System.out.println("thankyou");
				break;
				
			}
		    default:{
		    	System.out.println("please enter the correct choice");
		    }
			}
		
		}
	}
	

	
	
	

