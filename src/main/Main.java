package main;
import collections.*;
import interfaces.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		
		IQueue<Integer> cola = new Queue<Integer>();
		ILinkedList<String>lista = new LinkedList<String>();
		
		lista.addDoublyLinkedList("A");
		lista.addDoublyLinkedList("B");
		lista.addDoublyLinkedList("C");
		lista.addDoublyLinkedList("D");
		lista.addDoublyLinkedList("E");
		System.out.println(lista.find("C"));
		lista.deleteDoublyLinkedList("B");
		System.out.println(lista.sizeL());
//		System.out.println(lista.sizeL());
//		lista.deleteLinkedList(2);
//		System.out.println(lista.sizeL());
//		System.out.println("");


		
		System.out.println(lista.getRoot().getNext().getInfo());
		System.out.println(lista.getRoot().getInfo());
		
		



		
	}

}
