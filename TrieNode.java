package com.ds.trie;

import java.util.LinkedList;
import java.util.List;

public class TrieNode {

	
	private char content;
	private LinkedList<TrieNode> children=null;
	private boolean isWord=false;
	public int prefix=0;
	
	public TrieNode(char content)
	{
		this.content=content;
		children= new LinkedList<TrieNode>() ;
	}
	
	public LinkedList<TrieNode>  getChildren()
	{
		return children;
	}
	
	public TrieNode contains(char c)
	{
		for(TrieNode t:children)
		{
			if(t.getContent()!=c)continue;
			return t;
		}
		return null;
	}
	
	public char getContent()
	{
		return content;
	}
	
	public void setContent(char c)
	{
		 content=c;
	}

	public boolean isWord()
	{
		return isWord;
	}
	
	public void setisWord(boolean word)
	{
		isWord=word;
	}

}
