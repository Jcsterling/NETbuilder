package com.qa.Entities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.qa.Enums.Gender;

public class Family {
	
	 private HashMap<String, Person> family = new HashMap<String, Person>();

	
	public boolean male(String name) {
		
		
		
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

}
	
	
	