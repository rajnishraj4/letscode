package com.practice.letscode.datastructure.linkedlist.singly;

import lombok.Data;

@Data
public class SNode {
    private SNode next;
    private int data;

    public SNode(int data)
    {
        this.data=data;
    }

    public SNode()
    { }

    public static SNode getNewNode()
    {
        return getNewNode(null);
    }

    public static SNode getNewNode(Integer data)
    {
        SNode node=null;
        if(data==null)
           node = new SNode();
        else
           node = new SNode(data);
        node.next = null;
        return node;
    }

    public static SNode getSampleList(int size)
    {
        SNode list=null;
        SNode temp=null;
        for(int i=1;i<=size;i++)
        {
            if(list==null)
            {
                list= getNewNode(i);
                temp = list;
            }
            else
            {
                temp.setNext(getNewNode(i));
                temp = temp.getNext();
            }
        }
        return  list;
    }

    public static void printList(SNode list)
    {
        SNode temp = list;
        while(temp!=null)
        {
            System.out.print(temp.getData()+" ");
            temp = temp.getNext();
        }
        System.out.println();
    }
}
