package day14;

public class employee {
	private int id;
	private String name;
	private int phoneno;
	private String department;
	
	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getPhoneno() {
		return phoneno;
	}



	public void setPhoneno(int phoneno) {
		this.phoneno = phoneno;
	}



	public String getDepartment() {
		return department;
	}



	public void setDepartment(String department) {
		this.department = department;
	}



	@Override
	public String toString() {
		return "employee [id=" + id + ", name=" + name + ", phoneno=" + phoneno + ", department=" + department + "]";
	}

 employee(){
 }
 

	public employee(int id, String name, int phoneno, String department) {
		super();
		this.id = id;
		this.name = name;
		this.phoneno = phoneno;
		this.department = department;
	}
	
 

}
