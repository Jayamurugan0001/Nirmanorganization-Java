package day10;

public class constructortask {
	int year;
	String make;
	
	constructortask(){
		int year;
		String make;
	}
	constructortask(String make){
	   
		this.make=" maruthi";
		
	}
	constructortask(String make,int year){
		this.year=2005;
		this.make= "audi";
		
	}
	void displaycardetails() {
		System.out.println(year);
		System.out.println(make);
	}
	
	
		
	}
	
	
   
