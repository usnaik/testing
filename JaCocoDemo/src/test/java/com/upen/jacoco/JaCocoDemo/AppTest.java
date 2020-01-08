package com.upen.jacoco.JaCocoDemo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

	String input1="noon";
	boolean expected=true;
	
	App app=new App();
	
	@Test
    public void isPalindromeTest(){

		assertEquals(expected, app.isPalindrome(input1));

    }

	@Test
    public void isNotPalindromeTest(){

		assertEquals(false, app.isPalindrome("abc"));

    }
	
	@Test(expected = IllegalArgumentException.class)
    public void isNotPalindromeExceptionTest(){

		assertEquals(false, app.isPalindrome(null));

    }
	
}
