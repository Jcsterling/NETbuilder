package com.qa.Entities;

import java.util.ArrayList;
import java.util.List;

import com.qa.Enums.Gender;

public class Family {
	
	private String name;
	private Gender gender; 
	private List<ArrayList>child;
	private List<ArrayList> parent;
	
	public boolean male(String name) {
		
		setGender(gender);
		
		
		return false;
		
	}
	
	public boolean female(String name) {
		
		return false;
		
	}
	
	public boolean isMale () {
		if (this.getGender() == Gender.MALE) {
			return  true;
		}
		else 
		{
		return false;
		}
	}
	
	public boolean isFemale () {
		
		if (this.getGender() == Gender.FEMALE) {
			return  true;
		}
		else 
		{
		return false;
		}
		
	}
	
	public boolean setParent(String childName, String parentName) {
		return false;
	}
	
	public List<ArrayList> getParents(String name) {
		return getParent() ;
	}
	
	public List<ArrayList> getChildren(String name) {
		return getChild() ;
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

	public List<ArrayList> getChild() {
		return child;
	}

	public void setChild(List<ArrayList> child) {
		this.child = child;
	}

	public List<ArrayList> getParent() {
		return parent;
	}

	public void setParent(List<ArrayList> parent) {
		this.parent = parent;
	}
}
