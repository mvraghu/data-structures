package com.ds.minheap;

public class MinHeap {
	
	int arr[]= null;
	int index=0;
	
	public MinHeap(int capacity)
	{
		arr= new int[capacity +1];
	}
	
	
	public int getMin()
	{		
		return arr[1];
	}
	
	public void insert(int value)
	{
		index++;
		arr[index]=value;
		shiftUp(index);
		
		
	}
	
	public int getRight(int i){
		int right= 2*i + 1;
		if(right<=index)
			return right;
		
		return -1;
	}
	
	public int getLeft(int i)
	{
		int left= 2*i;
		if(left<=index)
			return left;
		return -1;
	}
	
	public int deleteMin()
	{
		int min= arr[1];
		arr[1]=arr[index];
		shiftDown(1);
		index--;
		return min;
	}
	//left = 2i
	//right= 2i + 1;
	//  2  3 4 5 6 7 
	//
	//
	//
	
	private void shiftDown(int pos)
	{
		int left = getLeft(pos);
		int right = getRight(pos);
		if(left <0 || right < 0)return;
		int min  = right;
		if(arr[left]<arr[right])
			min= left;
		
		if(arr[min] <  arr[pos])
		{
			swap(min ,pos);
			shiftDown(min);
		}
	}
// 1 2 3 4
	private void shiftUp(int pos) {
		
		int parent =(int) Math.ceil((double)(pos-1)/2);
		if(parent<1)return;
		if(arr[parent] > arr[pos])
		{
			swap(parent , pos);
			shiftUp(parent);
		}
		
	}


	private void swap(int parent, int child) {
		
		int temp= arr[parent];
		arr[parent]=arr[child];
		arr[child]=temp;
	}
	

}
