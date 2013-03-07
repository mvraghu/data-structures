package com.ds.linkedlist;

public class DoubleLinkedListNode {
	
	
	private DoubleLinkedListNode next;
	private DoubleLinkedListNode prev;
	private int value;
	private String key;


	
	public DoubleLinkedListNode(DoubleLinkedListNode nextNode,DoubleLinkedListNode prevNode,int value,String key)
	{
		this.next=nextNode;
		this.prev=prevNode;
		this.value=value;
		this.key=key;
	}
	
	public void setNext(DoubleLinkedListNode nextNode)
	{
		this.next=nextNode;
		
	}
	
	public DoubleLinkedListNode getNext( )
	{
		return this.next;
		
	}

	
	public DoubleLinkedListNode getPrev( )
	{
		return this.prev;
		
	}
	
	public void setPrev(DoubleLinkedListNode prevNode)
	{
		this.prev=prevNode;
		
	}

	
	public void setValue(int value)
	{
		this.value=value;
		
	}
	
	public int getValue()
	{
		return this.value;
	}
	
	public void setKey(String key)
	{
		this.key=key;
		
	}
	
	public String getKey()
	{
		return this.key;
	}




}
