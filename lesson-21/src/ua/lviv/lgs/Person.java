package ua.lviv.lgs;

public class Person {

	@MyAnnotation("For name")
	String name;
	@MyAnnotation("For surName")
	String surName;
	@MyAnnotation("For hobby")
	String hobby;
	public Person(String name, String surName, String hobby) {
		super();
		this.name = name;
		this.surName = surName;
		this.hobby = hobby;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurName() {
		return surName;
	}
	public void setSurName(String surName) {
		this.surName = surName;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", surName=" + surName + ", hobby=" + hobby + "]";
	}
	
	
	
}
