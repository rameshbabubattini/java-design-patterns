package com.java.designpatterns.interpreter;

public class InterpreterDemo {

	public static void main(String[] args) {
		// String context = "Lions";
		// String context = "Tigers";
		// String context = "Bears";
		String context = "Lions Tigers Bears";
		// String context = "Lions Bears";
		// String context = "Tigers Bears";
		
		Expression define = buildInterpreterTree();
		System.out.println(context + " is" + define.interpret(context));
		
	}

	private static Expression buildInterpreterTree() {
		Expression terminal1 = new TerminalExpression("Lions");
		Expression terminal2 = new TerminalExpression("Tigers");
		return new AndExpression(terminal1, terminal2);
	}

}
