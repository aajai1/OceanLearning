package com.ajai.automation;

public class Student {
	
	int rollNo;
	String name;
	String dob;
	Address address;
	
	public Student(int RollNo,String Name,String Dob) {
		this.rollNo=RollNo;
		this.name=Name;
		this.dob=Dob;
	}
	public static void main(String[] args) {
		Student ajai = new Student(15052,"ajai","01/02/2025");
		ajai.address = new Address(104, "puducherry", "pondy");
		ajai.address.setDoorNo(1056);
		System.out.println(ajai.address.getLocality());
		System.out.println(ajai.address.toString());
	}
}
