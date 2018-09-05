package com.qa.Entities;

import java.util.ArrayList;
import java.util.List;

import com.qa.Enums.Gender;

public class Person {
	
	private String name;
	private Gender gender; 
	private List<Person>children;
	private List<Person> parents;
	
	public Person() {
		super();
	}
	
	public Person(String name) {
		super();
		  this.name = name;
	      parents = new ArrayList<>();
	      children = new ArrayList<>();
	}
	
	public Person(String name, Gender gender) {
		super();
		this.name = name;
		this.gender = gender;
		
	}

	public Person(String name, Gender gender, List<Person> child, List<Person> parent) {
		super();
		this.name = name;
		this.gender = gender;
		   parents = new ArrayList<>();
		      children = new ArrayList<>();
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
	
	public void addChildren(Person child) {
        this.children.add(child);
    }

	public List<Person> getChildren() {
		return children;
	}

	public void setChildren(ArrayList<Person> children) {
		this.children = children;
	}
	
	void addParent(Person parent) {
        this.parents.add(parent);
    }
	
	public String[] getParents() {

	     String[] parentName = new String[parents.size()];
	     
	     int index = 0;

	     for (Person eachPerson : parents) {
	        parentName[index] = eachPerson.getName();
	        index++;
	        }
	    return parentName;
	}
	    
	 
	public ArrayList<Person> getParents() {
		return parents;
	}

	public void setParents(ArrayList<Person> parents) {
		this.parents = parents;
	}


}
