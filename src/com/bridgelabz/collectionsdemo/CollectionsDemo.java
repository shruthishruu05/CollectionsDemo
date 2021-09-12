package com.bridgelabz.collectionsdemo;
import java.util.*;
public class CollectionsDemo {
    public static void main(String [] args)
    {
    	doListDemo();
    	doStackDemo();
    	doQueueDemo();
    	doSetDemo();
    	doMapDemo();
    }

	private static void doMapDemo() {
		System.out.println("Map demonstration");
		Map<Integer, String> map = new HashMap<>();
		map.put(100, "apple");
		map.put(101, "Mango");
		map.put(101, "grapes");
		for(Map.Entry m:map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}	
	}

	private static void doSetDemo() {
	System.out.println("set demonstration");
	Set<String> set = new LinkedHashSet<>();
		set.add("Mango");
		set.add("Apple");
		set.add("Banana");
		set.add("Grapes");
		Iterator itr = set.iterator();
		 while(itr.hasNext())
		 {
			 System.out.println(itr.next());
		 }
		
	}
	

	private static void doQueueDemo() {
		System.out.println("\n queue demonstration");
		PriorityQueue<String> queue = new PriorityQueue<>();
		queue.add("Amit");  
		queue.add("Vijay");  
		queue.add("Karan");  
		queue.add("Jai");  
		queue.add("Rahul");  
		System.out.println("head:"+queue.element());  
		System.out.println("head:"+queue.peek());  
		System.out.println("iterating the queue elements:");  
		Iterator itr=queue.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		queue.remove();  
		queue.poll();  
		System.out.println("after removing two elements:");  
		Iterator<String> itr2=queue.iterator();  
		while(itr2.hasNext()){  
		System.out.println(itr2.next());  
		}
	}


	private static void doStackDemo() {
		System.out.println("stack demonstration");
		Stack<String> stack = new Stack<String>();
		stack.push("Mango");
		stack.push("Apple");
		stack.push("Banana");
		stack.push("Grapes");
		Iterator itr = stack.iterator();
		 while(itr.hasNext())
		 {
			 System.out.println(itr.next());
		 }
		
	}

	private static void doListDemo() {
		System.out.println("list demonstration");
		List<String> list=new ArrayList<String>();    
		 list.add("Mango");  
		 list.add("Apple");  
		 list.add("Banana");  
		 list.add("Grapes");   
		 Iterator itr = list.iterator();
		 while(itr.hasNext())
		 {
			 System.out.println(itr.next());
		 }
		  
	} 
	
}
