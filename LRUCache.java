package com.ds.lru;

import java.util.Hashtable;
import com.ds.linkedlist.DoubleLinkedList;
import com.ds.linkedlist.DoubleLinkedListNode;

public class LRUCache {

	private Hashtable<String,DoubleLinkedListNode> table=null;
	private DoubleLinkedList list=null;
	private int size=0;
	
	public LRUCache(int capacity)
	{
		this.size=capacity;
	    table= new  Hashtable<String, DoubleLinkedListNode>(size);
	    list = new DoubleLinkedList();
	}
	// 4  3  2  1
	public void put(String key,int value)
	{
		if (table.size() == size)
			removeEntry();
		if(table.contains(key))
		{
			list.remove(table.get(key));
		}
		
	    list.insertAtHead(new DoubleLinkedListNode(null, null, value,key));
		table.put(key, list.getHead());
		display();
	}
	
	public DoubleLinkedListNode get(String key)
	{
		if( !table.containsKey(key))return null;
		DoubleLinkedListNode value=table.get(key);
		list.remove(value);
		list.insertAtHead(value);
		return value;
	}
	
	private void removeEntry()
	{
		String key=list.getTail().getKey();
		list.remove(list.getTail());
		table.remove(key);
	}
	
	private void display()
	{
		list.display();
		System.out.println("<----------------->");
	}
	
	
	
	
}
