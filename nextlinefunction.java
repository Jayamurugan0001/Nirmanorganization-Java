package day5;

import java.util.Scanner;
public class nextlinefunction {
	public static void main(String[]args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter your name");
		String name =Sc.nextLine();
		
		int length = name.length();
		System.out.println("length of word" +length);
        System.out.println("SubString");
        System.out.println(name.substring(0));
        System.out.println(name.substring(0,3));
        System.out.println(name.charAt(3));
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        
        
	}

}
