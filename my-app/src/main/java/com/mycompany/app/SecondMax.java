package com.mycompany.app;


public class SecondMax
{

    public static int getSecondMax(int[] numbers){
       
        if(numbers==null){
            throw new IllegalArgumentException("you should input some array");
        }
        if(numbers.length==0){
            throw new IllegalArgumentException("array is empty");
        }
        if(numbers.length==1){
        	throw new IllegalArgumentException("array is too small");
        }
        
        int max;
        int secondMax;
        max = numbers[0];
        int i=0;
        while(i<numbers.length && numbers[0]==numbers[i]){
        	i++;
        }
        if(i==numbers.length){
        	throw new IllegalArgumentException("all elements are equal");
        }
        
        if(numbers[0]>numbers[i]){
        	secondMax = numbers[i];
        }
        else{
        	max = numbers[i];
        	secondMax = numbers[0];
        }
        i++;
        while(i<numbers.length){
        	if(numbers[i]>max){
        		secondMax = max;
        		max = numbers[i];
        	}
        	else if(numbers[i]<max && numbers[i]>secondMax){
        		secondMax = numbers[i];
        	}
        	i++;
        }
        
        return secondMax;
    }
}
