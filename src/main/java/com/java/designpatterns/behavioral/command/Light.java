package com.java.designpatterns.behavioral.command;

//receiver
public class Light {
	
	private boolean on = false;
	
	public void toggle() {
		if (on) {
			off();
		} else {
			on();
		}
		on = !on;
	}
	
	public void on() {
		System.out.println("Light switched on.");
	}
	
	public void off() {
		System.out.println("Light switched off.");
	}
	
}
