package com.collections.project;
import java.util.*;
public class Mapping {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Map<Integer,String> map=new HashMap<Integer,String>();   
		System.out.println("Printing List of vehicles using map:");
		map.put(1, "car");
		map.put(2, "bike");
		map.put(3, "bicycle");
		map.put(4, "bus");
		map.put(5, "train");
		map.put(6, "Aeroplane");
		map.put(1, "ship");
		System.out.println(map);
		System.out.println(map.containsKey(1));
		System.out.println("size of the map is:");
		System.out.println(map.size());
		System.out.println(map.put(90,"motor"));
		map.replace(90,"motor");
		
		HashMap<Integer,String> hashmap=new HashMap<Integer,String>();
		System.out.println("Printing list of teams using hashmap:");
		hashmap.put(1, "csk");
		hashmap.put(2, "mi");
		hashmap.put(3,"rcb");
		hashmap.put(4, "rr");
		hashmap.put(5, "srh");
		hashmap.put(6, "mi");
		System.out.println(hashmap);
		System.out.println("clone values are:");
		System.out.println(hashmap.clone());
		System.out.println(hashmap.containsKey(0));
		System.out.println(hashmap.containsValue("csk"));
		System.out.println(hashmap.get(1));
		
	}

}
