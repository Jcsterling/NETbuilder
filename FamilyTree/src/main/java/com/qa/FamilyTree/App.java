package com.qa.FamilyTree;

import com.qa.Entities.Family;

/**
 * Hello world!
 *
 */
public class App 
{
	static Family fam = new Family();
	
    public static void main( String[] args )
    {
    	
        System.out.println( "Hello World!" );
        
        fam.setParent("Georgia", "Maxine");
    }
}
