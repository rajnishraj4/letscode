package com.practice.letscode.datastructure.linkedlist.singly;

public class LinkedListOpr {

    private static SNode list =null;
    public static void main(String ...args)
    {
        list = SNode.getSampleList(6);
        SNode.printList(list);
        list = getReversedList(list);
        SNode.printList(list);
        getRecReverse(list);
        SNode.printList(list);
    }

    public static SNode getReversedList(SNode list)
    {
        SNode head = list;
        SNode temp = list.getNext();
        head.setNext(null);

        while(temp!=null)
        {
            list = temp;
            temp = temp.getNext();
            list.setNext(head);
            head = list;
        }
        return head;
    }

    public static SNode getRecReverse(SNode node)
    {
        if(node==null)
            return null;
        SNode curr = getRecReverse(node.getNext());
        if(curr==null)
            list = node;
        else
        {
            node.setNext(null);
            curr.setNext(node);
        }
        return node;
    }
}
