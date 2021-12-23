package com.bridgelabz.queue;

public class QueueMain {
	public static void main(String[] args) {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		Queue queue = new Queue();
		queue.enqueu(myFirstNode);
		queue.enqueu(mySecondNode);
		queue.enqueu(myThirdNode);
		
		queue.printQueue();
}
}