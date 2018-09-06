package com.qa.FamilyTree;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.qa.Entities.Family;
import com.qa.Enums.Gender;
import com.qa.Service.FamilyService;

/**
 * Unit test for simple App.
 */
public class FamilyTreeTest {
	Family fam; 
	FamilyService service;
	
	@Before
	public void createInstance()
	{
		fam = new Family();

		service = new FamilyService();
	}
	
	@Test
	public void assignGenderTest() {
		
		

		

        fam.female("bellatrix");

        
	
//		assertEquals(true, fam.female("bellatrix"));
		
		assertEquals(false, fam.male("bellatrix"));
	}
	
	@Test
	public void checkGenderTest() {
		
		fam.male("sirius");
        assertEquals(true, fam.isMale("sirius"));
	}
	
	
	@Test
	public void getParentsTest() {
		
		fam.setParent("jim", "bob");
		fam.getParents("jim");
		assertEquals("bob", fam.getParents("jim"));
		
	}
	
	@Test 
	public void getChildrenTest() {
		
	}

}
