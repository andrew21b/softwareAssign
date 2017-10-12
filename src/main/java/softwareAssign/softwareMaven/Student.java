package softwareAssign.softwareMaven;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
	
	private String name,userName;
	private int age,ID;
	private Date DOB;
	
	public Student(String name, int age, Date dob, int ID) {
		this.name = name;
		this.age = age;
		this.ID = ID;
		this.DOB = dob;
		//this.userName = name+ID;
	}
	
	
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String s) {
		this.name = s;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge (int age) {
		this.age = age;
	}
	
	public void setID(int id){
		this.ID = id;
	}
	
	public int getID(){
		return this.ID;
	}
	
	public Date getDob(){
		return this.DOB;
	}
	
	public String getUserName() {
		this.userName = name+Integer.toString(age);
		return this.userName;
	}
}
