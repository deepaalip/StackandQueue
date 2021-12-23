package com.bridgelabz.stack;

 
	public interface Inode<T extends Comparable> {
        T getKey();
        void setKey();

        Inode getNext();
        void setNext(Inode tempNode);
}

