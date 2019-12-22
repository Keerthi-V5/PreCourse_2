package com.Exercise7;

class LNode{
    int data;
    LNode next;
}

public class MidLL {

    LNode head;

    LNode createNode(int data){
        LNode temp = new LNode();
        temp.data = data;
        temp.next = null;

        return temp;
    }
    LNode insert(int data){

        if(head == null){
            LNode temp = createNode(data);
            head = temp;
        }
        else{
            LNode temp = createNode(data);
            temp.next = head;
            head = temp;
        }

        return head;
    }

    void display(){
        LNode temp = head;
        while(temp.next != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println(temp.data);
    }

    int findMidList(){
        LNode fast = head;
        LNode slow = head;
        LNode mid;

        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        mid = slow;
        return mid.data;

    }

    public static void main(String args[]){
        System.out.println("Finding mid node in the linked list");
        MidLL mll = new MidLL();

        mll.insert(2);
        mll.insert(4);
        mll.insert(6);
        mll.insert(8);
        mll.insert(10);
        mll.insert(120);

        mll.display();

        System.out.println("Mid node of the list is : "+mll.findMidList());


    }

}
