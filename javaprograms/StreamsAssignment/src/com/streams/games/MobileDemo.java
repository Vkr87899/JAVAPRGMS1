package com.streams.games;

import java.util.Arrays;
import java.util.Optional;

public class MobileDemo {
public static void main(String[] args) {
	Arrays.asList(new Mobile("samsung",9000),
			new Mobile("samsung",7000),
			new Mobile("nokia",6000),
			new Mobile("nokia",9000))
			.stream()
			.filter(mobile->mobile.getBrand().equals("samsung"))
			.forEach(System.out::prinln));
		
}
}
