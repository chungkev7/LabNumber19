package dsa;

import java.util.Arrays;

public class MainApp {

	public static void main(String[] args) {
		MyArrayList list = new MyArrayList();
		list.addAtBeginning("Hello");
		list.addAtBeginning("Hello2");
		list.addAtBeginning("Hello3");
		list.addAtBeginning("Hello4");

		System.out.println(list);
		System.out.println(list.get(2));
		list.addAtEnd("Java is cool!");
		System.out.println(list);
		list.removeFromEnd();
		System.out.println(list);

		System.out.println("LinkedList starts here");
		MyLinkedList linkedList = new MyLinkedList();
		linkedList.addAtBeginning("help");
		linkedList.addAtBeginning("help1");
		linkedList.addAtBeginning("help2");
		System.out.println(linkedList);
		linkedList.removeFromBeginning();
		System.out.println(linkedList);
		linkedList.addAtEnd("Hello");
		System.out.println(linkedList);
		System.out.println(linkedList.get(1));

	}

}
