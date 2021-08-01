package com.java.designpatterns.behavioral.command;

public class Switch {

	public void storeAndExecute(Command command) {
		command.execute();
	}
	
}
