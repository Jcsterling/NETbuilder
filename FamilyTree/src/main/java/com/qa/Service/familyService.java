package com.qa.Service;

import java.util.HashMap;

import com.qa.Entities.Person;
import com.qa.Enums.Gender;

public class FamilyService {
	
	 private HashMap<String, Person> family = new HashMap<String, Person>();

	
	 public Person getFamilyMember(String name){
	        return family.get(name);
	 }
	 
	 public void newFamilyMember(String name) {
         Person newPerson = new Person(name);
         family.put(name, newPerson);
	 }
	 public void newFamilyMember(String name, Gender gender) {
	     Person newPersonGenderAssigned = new Person(name);
	     newPersonGenderAssigned.setGender(gender);
	     family.put(name, newPersonGenderAssigned);
	 }

 

}
