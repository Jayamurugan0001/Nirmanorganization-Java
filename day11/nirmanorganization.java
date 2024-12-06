package day11;

public class nirmanorganization {
public static void main(String []args) {
	employee emp= new employee();
	emp.setname("mukesh");
	System.out.println(emp.getName());
	emp.setid(1234);
	System.out.println(emp.getid());
	emp.setdepartment("mca");
	System.out.println(emp.getdepartment());
	emp.setage(34);
	System.out.println(emp.getage());
	
	
	employee emp2= new employee();
	emp2.setname("maran");
	System.out.println(emp.getName());
	emp2.setid(1244);
	System.out.println(emp.getid());
	emp2.setdepartment("mca");
	System.out.println(emp.getdepartment());
	emp2.setage(35);
	System.out.println(emp.getage());
	System.out.println(emp);
	
	
	
	
	
}
}
