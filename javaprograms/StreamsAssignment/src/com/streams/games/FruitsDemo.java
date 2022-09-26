package com.streams.games;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FruitsDemo {

	public static void main(String[] args) {
	String fruit=Arrays.asList("blueBerry","Mango","jam","blackBerry","banana")
		.stream()
		.filter((str)->str.contains("Berry"))
		.sorted()
		.findFirst().orElse("no such berry fruit");
		System.out.println(fruit);
		
	
	
		
	
	
		
		
		

}
}
