package com.leetcode.code2;

public class NodeOperations {
    Node head = null;
    Node tail = null;

    public void addNode(int data){

        Node newNode = new Node(data);
        if(head==null){
            head= newNode;
            tail= newNode;

        }
        else{
            tail.next=newNode;
            tail= newNode;

        }

    }

    public void printNodes(){
        Node current= head;
        if(current==null){
            System.out.println("Nothing to print");
            return;
        }

        while(current!=null){
            System.out.println(current.data+" ");
            current=current.next;

        }
    }


}
