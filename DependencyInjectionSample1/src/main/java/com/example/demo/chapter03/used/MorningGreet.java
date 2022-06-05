package com.example.demo.chapter03.used;

public class MorningGreet implements Greet{
	@Override
	public void greeting() {
		System.out.println("............................................");
		System.out.println("おはようございます！");
		System.out.println("............................................");
	}
}
