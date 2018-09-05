package com.qa.Entities;

import java.util.ArrayList;
import java.util.List;

import com.qa.Enums.Gender;

public class Person {
	
	private String name;
	private Gender gender; 
	private List<Person>child;
	private Person[] parent;
	
	public Person() {
		super();
	}
	
	public Person(String name, Gender gender) {
		super();
		this.name = name;
		this.gender = gender;
		
	}

	public Person(String name, Gender gender, List<Person> child, Person[] parent) {
		super();
		this.name = name;
		this.gender = gender;
		this.child = child;
		this.parent = parent;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public List<Person> getChild() {
		return child;
	}

	public void setChild(List<Person> child) {
		this.child = child;
	}

	public Person[] getParent() {
		return parent;
	}

	public void setParent(Person[] parent) {
		this.parent = parent;
	}
	


}
