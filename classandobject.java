package day5;

public class classandobject {
	
	String studentname="";
	int rollno;
	int age;
	String gender="";
	
	
	
	String carcompany="";
	int model;
	int year;
	String colour="";
	
	public static void main(String[]args) {
		classandobject	student=new classandobject();
		student.studentname="adani";
		student.rollno=23;
		student.age=22;
		student.gender="male";
		
		System.out.println(student.studentname);
		
		classandobject	student2=new classandobject();
		student.studentname="aambi";
		student.rollno=33;
		student.age=22;
		student.gender="male";
		
		System.out.println(student.gender);
		
		
		classandobject	student3=new classandobject();
		student.studentname="aadn";
		student.rollno=38;
		student.age=32;
		student.gender="male";
		
		System.out.println(student.age);
		
		
		classandobject	carcompany=new classandobject();
		carcompany.carcompany="honda";
		carcompany.model=45;
		carcompany.year=2000;
		carcompany.colour="black";
		
		System.out.println(carcompany.model);
		
						
		
	}

}
