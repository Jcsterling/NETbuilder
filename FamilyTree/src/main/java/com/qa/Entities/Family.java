package com.qa.Entities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.qa.Enums.Gender;
import com.qa.Service.FamilyService;

public class Family {
	
	
	
	public boolean male(String name) {
		FamilyService fservice = new FamilyService();
		
		if(fservice.getFamilyMember(name).getName() == null) {
			fservice.newFamilyMember(name, Gender.MALE);
		}

		if (fservice.getFamilyMember(name).getGender().equals(Gender.FEMALE)) {
	        return false;
			}
			else if (fservice.getFamilyMember(name).getName().equals(name)) {
				return false;
			}else {
			
				fservice.newFamilyMember(name, Gender.MALE);
				
				return true;
			}
	}
	
	public boolean female(String name) {
		
		FamilyService fservice = new FamilyService();

		if (fservice.getFamilyMember(name).getGender().equals(Gender.MALE)) {
        return false;
		}
		else if (fservice.getFamilyMember(name).getName().equals(name)) {
			return false;
		}else {
		
			fservice.newFamilyMember(name, Gender.FEMALE);
			
			return true;
		}
			
	}
	
	public boolean isMale (String name) {
		FamilyService fservice = new FamilyService();

		if( fservice.getFamilyMember(name).getGender().equals(Gender.MALE)) {
			return true;
			}
			else {
				return false;
			}
				
	}
	
	public boolean isFemale (String name) {
		
		FamilyService fservice = new FamilyService();

		if( fservice.getFamilyMember(name).getGender().equals(Gender.FEMALE)) {
		return true;
		}
		else {
			return false;
		}
	}
	
	public boolean setParent(String childName, String parentName) {
		
		FamilyService fservice = new FamilyService();
		boolean haveChild = fservice.getFamilyMember(childName) != null;
	    boolean haveParent = fservice.getFamilyMember(parentName) != null;

	        if (!haveChild){
	            fservice.newFamilyMember(childName);
	            return true;
	        }
	        if (!haveParent) {
	            fservice.newFamilyMember(parentName);
	            return true;
	        }
	        return false;
	        
	        
	}
	
	public String[] getParents(String name){
		FamilyService fservice = new FamilyService();
		
		String[] parents = fservice.getFamilyMember(name).getAllParents();
		
        return parents;
    }

    public String[] getChildren(String name){
    	FamilyService fservice = new FamilyService();
    	Person person = new Person();
		
    	String[] children = fservice.getFamilyMember(name).getAllChildren();
        return children;
    }

}
	
	
	