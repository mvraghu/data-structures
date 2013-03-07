package com.ds.trie;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Trie {

	private TrieNode rootNode=null;
	
	public Trie()
	{
		rootNode= new TrieNode(' ');
	}
	public void insert(String word)
	{
		char [] chars= word.toCharArray();
		if(chars==null || chars.length==0)return;
		TrieNode current =rootNode;
		int charCount=0;
		for(char c : chars)
		{
			TrieNode t= current.contains(c);
			if(t!=null)
			{
				current=t;
				current.prefix++;
			}
			else
			{
				TrieNode newNode=new TrieNode(c);
				newNode.prefix=1;
				current.getChildren().add(newNode);
				current=newNode;
			}
			if(charCount==chars.length-1)
			{
				current.setisWord(true);
			}
			
			charCount++;

		}
	}
	//word
	public boolean search(String word)
	{
		if(word==null || word.length()==0)return false;
		char [] chars=word.toCharArray();
		TrieNode node=rootNode;
		for(char c:chars)
		{
			node = node.contains(c);
			if(node==null)return false;
		}
		return node!=null && node.isWord();
	}
	
	public void searchList(String word)
	{
		
		if(word==null || word.length()==0)return ;
		TrieNode node=rootNode;
		String prefix="";
		for(char c:word.toCharArray())
		{
			node = node.contains(c);
			prefix+=c;
		}
		//List<String> wordList= new List<String>();		
		 searchWords(node,prefix);
	}
	
	public void searchWords(TrieNode node,String prefix )
	{
		if(node==null)return ;
		for(TrieNode to : node.getChildren())
		{
			String word =prefix ;
			word+=to.getContent() ;
			if(to.isWord())
			{
				System.out.println(word);
			}
			if(to.getChildren()==null)
			{
				//word="";
				return;
			}
			searchWords(to,word);
		}

		
	}
	
	//cats cat rate
	public void delete(String word)
	{
		if(word==null || word.length()==0)return ;
		char [] chars=word.toCharArray();
		TrieNode node=rootNode;
		//cats
		for(char c:chars)
		{
			node = node.contains(c);
			if(node!=null )
			{
				node.prefix--;
			}


		}
		if(node!=null)
		{
			node.setisWord(false);
		}
		//full text found

	}
}
