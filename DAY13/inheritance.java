package DAY13;


class Animal{
	void makesound() {
	System.out.println("this animal makes sound");
}
}
class dog extends Animal{
	void makesound() {
		System.out.println("dog barks");
		
	}
}
class cat extends Animal{
	void makesound() {
		System.out.println("cat meow");
		
	}
}
public class inheritance {
	public static void main(String[] args){
	
		dog d=new dog();
		cat c=new cat();
		d.makesound();
		c.makesound();
	}
	

}
