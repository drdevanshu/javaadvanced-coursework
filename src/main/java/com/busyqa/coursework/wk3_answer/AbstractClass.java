package com.busyqa.coursework.wk3_answer;

import java.util.*;

/*
 * 
 * Instructions:
 *  
 * You have to create another class (in this file) that extends the abstract class. 
 * Then you can create an instance of the new class.
 * Notice that setTitle method is abstract too and has no body. 
 * That means you must implement the body of that method in the child class.
 * In the editor, we have provided the abstract Book class and a Main class. 
 * In the Main class, we created an instance of a class called MyBook. 
 * Your task is to write just the MyBook class.
 * Your class mustn't be public.
 */

abstract class Book{
	String title;
	abstract void setTitle(String s);
	String getTitle(){
		return title;
	}
}

//Write MyBook class here

public class AbstractClass{
	
	@SuppressWarnings("unused")
	public static void main(String []args){
		
		Scanner sc=new Scanner(System.in);
		String title=sc.nextLine();
		
		/*Incomment the following portion of code once you have created MyBook class*/
		//MyBook new_novel=new MyBook();
		//new_novel.setTitle(title);
		//System.out.println("The title is: "+new_novel.getTitle());
      	sc.close();
		
	}
}