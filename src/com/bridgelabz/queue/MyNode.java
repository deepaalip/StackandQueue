package com.bridgelabz.queue;

public class MyNode<K extends Comparable> implements Inode<K> {
    private K key;
    private Inode next;

    public MyNode(K key) {
        this.key =key;
        this.next=null;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public void setKey() {
        this.key=key;
    }

    public Inode<K> getNext() {
        return next;
    }

    public void setNext(Inode next) {
        this.next =(MyNode<K>) next;
    }


	


}



