package Stack;

public class Stack<Item> {
	
	class Node{
		Item item;
		Node next;	
	}
	
	Node first;
	int N;
	
	public void push(Item item) {
		Node oldfirst;
		oldfirst = first;
		first = new Node();
		first.item = item;
		first.next = oldfirst;
		N++;
	}
	
	public Node pop() {
		Node oldfirst;
		oldfirst = first;
		first = first.next;
		N--;
		return oldfirst;		
	}
	
	public boolean isEmpty() {
		if(first==null) return true;
		else return false;
	}
	public void PrintOut(){
		
		while(this.isEmpty()==false) System.out.println("Item: "+ this.pop().item +"");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stackBinh = new Stack<String>();
		stackBinh.push("a");
		stackBinh.push("b");
		stackBinh.push("c");
		stackBinh.push("d");
		stackBinh.PrintOut();
		
		
	}

}
