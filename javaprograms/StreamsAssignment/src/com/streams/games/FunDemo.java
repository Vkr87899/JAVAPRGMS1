package com.streams.games;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

public class FunDemo {

	public static void main(String[] args) {
		Function<String, List<String>> reference = (str) -> {
			List<String> listString = Arrays.asList(str.split(""));
			return listString;
		};
		System.out.println(reference.apply("java is fun"));

	}
}
