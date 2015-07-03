package com.mycompany.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import static com.mycompany.app.SecondMax.getSecondMax;

public class SecondMaxTest 
{
    @Test
    public void testEmptyArray(){
    	boolean thrown = false;
    	try{
    		int[] emptyArr = {};
    		getSecondMax(emptyArr);
    	}
    	catch(IllegalArgumentException exception){
    		thrown = true;
    	}
    	assertTrue(thrown);
    }
    
    @Test
    public void testOneElementArray(){
    	boolean thrown = false;
    	try{
    		int[] oneElementArr = {1};
    		getSecondMax(oneElementArr);
    	}
    	catch(IllegalArgumentException exception){
    		thrown = true;
		}
    	assertTrue(thrown);
    }
    
    @Test
    public void testEqualElementsArray(){
	boolean thrown = false;
	try{
		int[] equalElementsArr = {1,1,1};
		getSecondMax(equalElementsArr);
	}
	catch(IllegalArgumentException exception){
		thrown = true;
	}
	assertTrue(thrown);
    }
    
    @Test
    public void testSmallArray(){
		int[] smallArr = {1,2};
		assertEquals(getSecondMax(smallArr),1);
    }
    
    @Test
    public void testMiddleArray(){
		int[] middleArr = {1,1,1,1,2,2,2,2,2};
		assertEquals(getSecondMax(middleArr),1);
    }
    
    @Test
    public void testAnotherArray(){
    	boolean thrown = false;
    	try{
    		int[] anotherArr = {1,1,1,1,1,1};
    		getSecondMax(anotherArr);
    	}
    	catch(IllegalArgumentException exception){
    		thrown = true;
    	}
    	assertTrue(thrown);
    }
    
    @Test
    public void testAnotherMiddleArray(){
		int[] middleArr = {1,2,3,4,5,6,7,8,9,10};
		assertEquals(getSecondMax(middleArr),9);
    }
    
    @Test
    public void testAndAnotherArray(){
		int[] middleArr = {1,2,3,4,5,6,7,8,9,9,10};
		assertEquals(getSecondMax(middleArr),9);
    }
    
    @Test
    public void testAndNextArray(){
		int[] middleArr = {1,2,3,4,5,6,7,8,9,10,10};
		assertEquals(getSecondMax(middleArr),9);
    }
}
