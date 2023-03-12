package com.entity;

public class Student {
	private int studid;
	private String firstname;
	private String lastname;
	private String address;
	private String dateofbirth;
	private int age;
	private String phoneno;
	
	public Student()
	{
		
	}

	public Student(int studid, String firstname, String lastname, String address, String dateofbirth, int age,
			String phoneno) {
		super();
		this.studid = studid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.dateofbirth = dateofbirth;
		this.age = age;
		this.phoneno = phoneno;
	}

	public int getStudid() {
		return studid;
	}

	public void setStudid(int studid) {
		this.studid = studid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDateofbirth() {
		return dateofbirth;
	}

	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}

	@Override
	public String toString() {
		return "Student [studid=" + studid + ", firstname=" + firstname + ", lastname=" + lastname + ", address="
				+ address + ", dateofbirth=" + dateofbirth + ", age=" + age + ", phoneno=" + phoneno + "]";
	}

	
}
