package com.collections.project;
import java.util.*;
public class QueueName {

	public static void main(String[] args) {
		Queue queue=new LinkedList();
		queue.add(1);
		queue.add(2);
		queue.add(3);
		System.out.println("Queue values are:");
		System.out.println(queue);
		System.out.println(queue.addAll(queue));
		System.out.println(queue.contains(4));
		System.out.println("Is empty or not:");
		System.out.println(queue.isEmpty());
		System.out.println("peek value is:");
		System.out.println(queue.peek());
		System.out.println("poll value is:");
		System.out.println(queue.poll());
		System.out.println("size of the queue is:");
		System.out.println(queue.size());
		System.out.println("removed value is:");
		System.out.println(queue.remove(queue));
		queue.clear();
		System.out.println(queue);
	}

}
