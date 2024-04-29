package com.collections.project;
import java.util.*;

import com.mysql.cj.protocol.x.SyncFlushDeflaterOutputStream;
public class ArrayListName {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		Scanner scanner=new Scanner(System.in);
		int i,n;
		System.out.println("Enter the n value:");
		n=scanner.nextInt();
		int a;
		System.out.println("Enter the user input:");
		for(i=0;i<n;i++)
		{
			a=scanner.nextInt();
			list.add(a);
		}
		System.out.println("output values are:");
		System.out.println(list);
		list.add(5,6);
		list.add(6,7);
		System.out.println("values after replaced:");
		System.out.println(list);
		list.remove(0);
		System.out.println("values after removing particular index:");
		System.out.println(list);
		boolean b=list.contains(6);
		System.out.println("mentioned value present or not:");
		System.out.println(b);
		Iterator iterator=list.iterator();
		System.out.println("iterated values are:");
		System.out.println(iterator.next());
		System.out.println(iterator.next());
		while(iterator.hasNext())
		{
			System.out.println(list);
			return;
		}
				
	}

}
