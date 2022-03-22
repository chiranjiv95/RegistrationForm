package com.registration.model;

			//pojo class
public class UserDetails {
	
	
	private String fname, lname, email, password, age, course;  //add , condition, age, course;

	//create construtor for object initialisation
	public UserDetails(String fname, String lname, String email, String password, String age,String course) //add : String condition, String age,String course
	
	{
		super();
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.password = password;
		//this.condition = condition;
		this.age = age;
		this.course = course;
	}

	//create a default constructor as well
	public UserDetails() {
		super();
	}

	//getters and setters
	
	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

//	public String getCondition() {
//		return condition;
//	}
//
//	public void setCondition(String condition) {
//		this.condition = condition;
//	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	

	
	
}
