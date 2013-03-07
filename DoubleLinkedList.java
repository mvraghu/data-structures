package com.ds.linkedlist;

public class DoubleLinkedList {

	private DoubleLinkedListNode head=null;
	private DoubleLinkedListNode tail=null;
	// 1 
	public void insert(DoubleLinkedListNode newNode)
	{
		
		if(newNode==null)return;
		if(head==null)
		{
			head= tail=newNode;
		}else
		{
			newNode.setPrev(tail);
			tail.setNext(newNode);
			tail= tail.getNext();
		}
	}
	
	
	public void insertAtHead(DoubleLinkedListNode newHead)
	{
		
		if(newHead==null)return;
		if(head==null)
		{
			insert(newHead);
			return;
		}	
		DoubleLinkedListNode temp=head;
		temp.setPrev(newHead);
		head=newHead;
		head.setNext(temp);
	}
	
	public void remove(DoubleLinkedListNode node)
	{
		if(node ==null || head==null)return;
		DoubleLinkedListNode temp=null;
		if(head==node)
		{
		    temp=head.getNext();
			temp.setPrev(null);
			head=temp;
			return;
		}
		
		DoubleLinkedListNode current=head;
		while(current!=null)
		{
			if(current==node)
			{
			    temp=current.getNext();
				DoubleLinkedListNode prev= current.getPrev();
				prev.setNext(temp);
				return;
			}
			current=current.getNext();
		}
		
	}
	
	public DoubleLinkedListNode getHead()
	{
		return head;
	}
	
	public DoubleLinkedListNode getTail()
	{
		return tail;
	}
	
	public void display()
	{
		DoubleLinkedListNode current=head;
		while(current!=null)
		{
			System.out.println(current.getValue());
			current= current.getNext();
		}
	}

	
}
