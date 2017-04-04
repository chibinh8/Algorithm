package Queue;

public class Queue<Item> {
	
	private class Node{
		Item item;
		Node next;		
	}
	
	private Node last;
	private Node first;
	private int N;
	public void enqueue(Item item) {
		Node oldlast;
		oldlast = last;
		last = new Node();
		last.item = item;
		last.next = null;

		if(first == null) first = last;
		else {
			oldlast.next = last;
		}
		N++;
	}
	
	public Node dequeue() {
		Node oldfirst = first;
		first = first.next;
		N--;
		return oldfirst;
	}
	
	public boolean isEmpty() {
		if(first==null) return true;
		else return false;
	}
	public void PrintOut(){
		
		while(this.isEmpty()==false) System.out.println("Item: "+ this.dequeue().item +"");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> myQueue = new Queue<Integer>();
		myQueue.enqueue(1);
		myQueue.enqueue(3);
		myQueue.enqueue(7);
		myQueue.enqueue(5);
		myQueue.enqueue(10);
		myQueue.enqueue(500);
		myQueue.PrintOut();
		
	}

}
