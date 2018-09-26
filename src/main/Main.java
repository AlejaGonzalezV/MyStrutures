package main;
import collections.*;
import interfaces.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		
		IQueue<Integer> cola = new Queue<Integer>();
		ILinkedList<String>lista = new LinkedList<String>();
		
		lista.addCircularLinkedList("A");
		lista.addCircularLinkedList("B");
		lista.addCircularLinkedList("C");
		lista.addCircularLinkedList("D");
		lista.addCircularLinkedList("E");
		System.out.println(lista.findCircularLinkedList("C"));
		lista.deleteCircularLinkedList("B");
		System.out.println(lista.sizeL());
//		System.out.println(lista.sizeL());
//		lista.deleteLinkedList(2);
//		System.out.println(lista.sizeL());
//		System.out.println("");


		
		System.out.println(lista.getRoot().getNext().getInfo());
//		System.out.println(lista.getRoot().getInfo());
		
		



		
	}

}
