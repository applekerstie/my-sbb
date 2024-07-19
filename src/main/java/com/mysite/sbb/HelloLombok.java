package com.mysite.sbb;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
@Setter
public class HelloLombok {
	
	private final String hello;
	private int lombok;
	
	public static void main(String[] args) {
		HelloLombok hl = new HelloLombok("hello");
		
		hl.setLombok(5);
		System.out.println( hl.getHello());
		System.out.println( hl.getLombok());

	}

}
