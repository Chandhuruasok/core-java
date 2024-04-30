package com.collections.project;
import java.util.*;
public class TreeSetName {

	public static void main(String[] args) {
		TreeSet treeset=new TreeSet();
		treeset.add("chennai");
		treeset.add("bangalore");
		treeset.add("hyderabad");
		treeset.add("cochin");
		treeset.add("pune");
		System.out.println("printing the values:");
		System.out.println(treeset);
		System.out.println(treeset.comparator());
		System.out.println("first value is:");
		System.out.println(treeset.first());
		System.out.println("values after cloning:");
		System.out.println(treeset.clone());
		System.out.println(treeset.contains("pune"));
	}

}
