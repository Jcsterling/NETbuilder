package com.qa.FamilyTree;

import org.junit.Before;
import org.junit.Test;

import com.qa.Entities.Family;

/**
 * Unit test for simple App.
 */
public class FamilyTreeTest {
	
	@Before
	public void createInstance()
	{
		Family fam = new Family();

	}
	
	@Test
	public void returnGenderTest() {
		
		Family fam = new Family();

		//first parent entered will always be female
		fam.setParents("mike", "martha");
		
		//second parent will always be male
		fam.setParents("mike", "jim");
		
		fam.motherEnteredFirst()
		
		//should return true
		fam.isFemale();
		
		assertEquals(true, fam.female("martha"));
		
		
	}
	
	
	@Test
	public void getParentsTest() {
		
		
		
	}
	
	@Test 
	public void getChildrenTest() {
		
	}

}
