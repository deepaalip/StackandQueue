package com.bridgelabz.queue;

 
	public interface Inode<T extends Comparable> {
        T getKey();
        void setKey();

        Inode getNext();
        void setNext(Inode tempNode);
}

