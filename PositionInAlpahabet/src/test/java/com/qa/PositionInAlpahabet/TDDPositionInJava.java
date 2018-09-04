package com.qa.PositionInAlpahabet;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.qa.PositionInAlpahabet.Service.PositionInAlphabetService;



public class TDDPositionInJava {


	@Test
	public static void getCharacterPositionTest() {
		RunClass runner = new RunClass();
		PositionInAlphabetService service = new PositionInAlphabetService();
		service.addString("abc");
		
		service.findPosition();
		
		assertEquals("123", service.addString("abc"));

	}


}
