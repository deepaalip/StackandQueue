package com.bridgelabz.queue;

public class Queue {
 
private MyLinklist myLinklist = new MyLinklist();
	
	public Queue() {
		this.myLinklist = new MyLinklist();
	}
	
	public void enqueu(Inode newNode) {
		myLinklist.append(newNode);
	}
	
	public void printQueue() {
		myLinklist.printMyNodes();
	}
}
