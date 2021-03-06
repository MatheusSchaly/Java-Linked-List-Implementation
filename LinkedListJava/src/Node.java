/**
 * @author Matheus Henrique Schaly
 * @date Jul 23, 2017
 * @description Creates a Node object.
 */

public class Node {
	
	private int data;
	private Node next;

	public Node(int data) {
		setData(data);
		setNext(null);
	}
	
	public int getData() {
		return data;
	}
	
	public void setData(int data) {
		this.data = data;
	}
	
	public Node getNext() {
		return next;
	}
	
	public void setNext(Node next) {
		this.next = next;
	}
	
}
