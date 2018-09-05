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
	
	public String[] getAllChildren() {

	     String[] childNames = new String[children.size()];
	     
	     int index = 0;

	     for (Person eachPerson : children) {
	        childNames[index] = eachPerson.getName();
	        index++;
	        }
	    return childNames;
	}

	public void setChildren(ArrayList<Person> children) {
		this.children = children;
	}
	
	void addParent(Person parent) {
        this.parents.add(parent);
    }
	
	public String[] getAllParents() {

	     String[] parentNames = new String[parents.size()];
	     
	     int index = 0;

	     for (Person eachPerson : parents) {
	        parentNames[index] = eachPerson.getName();
	        index++;
	        }
	    return parentNames;
	}
	    
	 
	public List<Person> getParents() {
		return parents;
	}

	public void setParents(ArrayList<Person> parents) {
		this.parents = parents;
	}


}
