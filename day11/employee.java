package day11;

public class employee {
	String name;
	int id;
	String department;
	int age;
	
	String getName() {
		return name;
		
		
	}
	int getid() {
		return id;
		
	}
	String getdepartment() {
		return department;
		
	}
	
	int getage() {
		return age;
		
	}
	void setname(String name){
		this.name=name;
	}
	void setid(int id) {
		this.id=id;
		
	}
	void setdepartment(String department) {
		this.department=department;
		
	}
	void setage(int age) {
		this.age=age;
	}
	employee(){

}
	


    employee(String name,int id,String department,int age)
    {
    	this.name=name;
    	this.id=id;
    	this.department=department;
    	this.age=age;
    }
	
    public String toString() {
    	return name;
    }
}

