package com.collections.project;
import java.util.*;
public class LinkedListName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		LinkedList list=new LinkedList();
		list.add(1);
		list.add(1,1);
		System.out.println(list);
		list.clone();
		System.out.println("clone values are:");
		System.out.println(list);
		boolean a=list.contains(1);
		System.out.println(a);
		list.addFirst(0);
		list.addLast(2);
		System.out.println(list);
		System.out.println(list.containsAll(list));
		System.out.println(list.get(1));
		System.out.println("Hashcode is:");
		System.out.println(list.hashCode());
		System.out.println(list.toArray());
		System.out.println(list.size());
		System.out.println("removed values are:");
		System.out.println(list.pop());
		System.out.println(list.pop());
	}

}
