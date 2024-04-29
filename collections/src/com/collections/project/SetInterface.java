package com.collections.project;
import java.util.*;
public class SetInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hashset=new HashSet();
		System.out.println("List of movies are:");
		hashset.add("crime ");
		hashset.add("horror ");
		hashset.add("comedy");
		hashset.add("adventure");
		hashset.add("fantasy");
		hashset.add("comedy");
		System.out.println(hashset);
		System.out.println("clone values are:");
		System.out.println(hashset.clone());
		System.out.println("contains or not:");
		System.out.println(hashset.contains("fantasy"));
		System.out.println("empty or not:");
		System.out.println(hashset.isEmpty());
		System.out.println("size of the set is:");
		System.out.println(hashset.size());
		System.out.println("after removing values:");
		System.out.println(hashset.removeAll(hashset));
		
		
		}

}
