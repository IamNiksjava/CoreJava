package com.basic;
import java.util.*;
public class ReadFromKeyBoard {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
	   /*
		System.out.println("Enter Name");
		String name=sc.nextLine();	
		System.out.println("Your Name is "+name);
		System.out.println("Enter Your SurName");
		String nx=sc.next();
		System.out.println(nx);
		*/
		sc.useRadix(2);
		int x=sc.nextInt();
		System.out.println(x);
		

	}

}
