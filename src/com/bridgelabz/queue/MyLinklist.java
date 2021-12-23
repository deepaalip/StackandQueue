package com.bridgelabz.queue;

public class MyLinklist {
	public   Inode head;
    public   Inode tail;

    public MyLinklist(){
            this.head = null;
            this.tail = null;
        }
    public void add(Inode newNode) {
        if(this.tail == null){
            this.tail=newNode;
        }
        if(this.head== null){
            this.head=newNode;

        }else{
            Inode tempNode = this.head;
            this.head = newNode;
            this.head.setNext(tempNode);
         }
        }
     public void append(Inode newNode){
        if(this.head == null){
            this.head=newNode;
        }
        if(this.tail== null){
            this.tail=newNode;
        }else{
            this.tail.setNext(newNode);
            this.tail=newNode;
        }
        }
     public void insert(Inode myNode ,Inode newNode){
        Inode tempNode = myNode.getNext();
        myNode.setNext(newNode);
        newNode.setNext(tempNode);
        }
     public Inode popLast(){
        Inode tempNode = this.head;
        tempNode = tempNode.getNext();
        tempNode.setNext(null);
        return tail;
        }
     public void size(){
        int counter = 1;
        Inode tempNode = this.head;
        while(tempNode != this.tail) {
            if (tempNode.getNext() == null) {

            } else {
                tempNode = tempNode.getNext();
                counter++;
            }

        }
            System.out.println("Size of current Linked List is: "+counter);
        }
     public void search(Inode myNode) {
            Inode tempNode = this.head;
            while(tempNode != null ) {
                if (myNode.getKey() == tempNode.getKey()) {
                    System.out.println("Element found :"+myNode.getKey());
                    break;
                }
                tempNode=tempNode.getNext();
            }
        }
      public void insertUsingKey(Inode myNode,Inode value){
            Inode tempNode = this.head;
            while(tempNode != null ) {
                if (myNode.getKey() == tempNode.getKey()) {
                    Inode temp =tempNode.getNext();
                    tempNode.setNext(value);
                    tempNode = tempNode.getNext();
                    tempNode.setNext(temp);
                    break;
                }
                tempNode=tempNode.getNext();
            }
        }
      public void deleteKey(Inode myNode ){
            Inode tempNode = this.head;
            while(tempNode != null ) {
                if (myNode.getKey() == tempNode.getKey()) {
                    Inode temp =tempNode.getNext();
                    //tempNode= null;
                    Inode demoNode = this.head;
                    demoNode = demoNode.getNext();
                    demoNode.setNext(temp);
                    break;
                }
                tempNode=tempNode.getNext();
            }
        }
    public  void printMyNodes(){
        StringBuffer myNodes = new StringBuffer("My Nodes:");
        Inode tempNode = head;
        while(tempNode.getNext()!= null){
            myNodes.append(tempNode.getKey());
            if(!tempNode.equals(tail))
                myNodes.append("->");
                tempNode=tempNode.getNext();
        }
        myNodes.append(tempNode.getKey());
        System.out.println(myNodes);

    }

}
