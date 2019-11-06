package dsa;

public class MyLinkedList implements MyList {

	private Node head;
	private int myLength = 0;
	private Node tail;

	public boolean removeAt(int index) {
		if (myLength < index || myLength > index) {
			return false;
		}
		return true;
	}

	public boolean insertAt(int index, String item) {
		if (myLength < index || myLength > index) {
			return false;
		}
		return false;
	}

	@Override
	public void addAtBeginning(String data) {
		// add a new Node and set it to the head
		head = new Node(head, data);
		myLength++;
	}

	@Override
	public void removeFromBeginning() {
		head = head.getNext();
		myLength--;
	}

	@Override
	public void addAtEnd(String data) {
		// check to make sure the list is not empty!
		// if empty add to the beginning (hint: we have some code for that!)
		// otherwise - create logic to add to the end (tail)
		// the reference to the next node should be null
		// increase the length
		if (myLength == 0) {
			head = new Node(head, data);
			myLength++;
		} else {
			Node node = new Node(null, data);
			node = node.getNext();
			tail = new Node(tail, data);
//			tail.setNext(node);
			myLength++;
		}
	}

	@Override
	public void removeFromEnd() {
		// think again about methods that you can reuse!
		if (myLength != 0) {
			tail.setNext(tail);
			myLength--;
		}
	}

	@Override
	public String get(int index) {
		if (index < myLength) {
			for (int i = index; i < myLength; i++) {
				Node node = new Node();
				return node.getData();
			}
		} else if (index > myLength) {
			for (int i = index; i > myLength; i--) {
				Node node = new Node();
				return node.getData();
			}
		}
		return head.getData();
	}

	@Override
	public int size() {
		return myLength;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		Node node = head;
		// follows the links between the nodes until it reaches the end
		while (node != null) {
			sb.append(node);
			node = node.getNext();
		}
		sb.append("]");
		return sb.toString();
	}
}
