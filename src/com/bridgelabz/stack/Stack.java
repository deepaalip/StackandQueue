package com.bridgelabz.stack;

public class Stack {
private final MyLinklist myLinklist;
	
	public Stack() {
		this.myLinklist = new MyLinklist();
	}
	public void push(Inode newNode) {
		myLinklist.add(newNode);
	}
	public void printStack() {
		myLinklist.printMyNodes();
	}
}
