package com.usa.practicejava;

public class Animal {
	
	//create on void method
	//create on static void method
	//create on static non void method
	
	public void salary() {
		System.out.println("Hello world");
		
	}
	public static void income() {
		System.out.println("Hello all");
		
	}
    public static int saving() {
	System.out.println("Hi");
	return 0;
}
    public static void main(String[] args) {
    	
    	 Animal obj = new Animal();
    	 obj.salary();
    	 
    	 Animal.income();
    	 Animal.saving();
    	 
    	
	
}



}
