package Search;
import java.util.NoSuchElementException;

public class BST<Key extends Comparable<Key>, Value> {
	private Node root;
	
	class Node{
		private Key key;
		private Value value;
		private Node Left, Right;
		private int size;
		
		public Node(Key key, Value value, int size){
			this.key = key;
			this.value = value;
			this.size = size;			
		}
		
	}
	/*Construction*/
	public BST() {
		
	}
	
	public boolean isEmpty() {
		
		return (size()==0);
		
	}
	
	public int size() {
		return size(root);
	}
	
	private int size(Node node) {
		if(node==null) return 0;
		else
			return node.size;
		
	}
	
	public boolean contains(Key key) {
		
		if(key==null) throw new IllegalArgumentException("argurment is null");
		
		return get(key)!=null;
		
	}
	
	private Value get(Key key) {
		return get(root, key);
	} 
	
	private Value get(Node Root, Key Key) {
		
		if(Root==null) return null;
		int compare = Root.key.compareTo(Key);
		if(compare==0) return Root.value;
		if(compare>0) Root = Root.Left;
		else Root = Root.Right;
		return get(Root, Key);			
		
	}
	
	public void put(Key key, Value value) {
		if(key==null) throw new IllegalArgumentException("agurment of put method is null");
		if(value ==null){
			//delete(key);
			return;
		}
		
		root = put(root, key, value);
		
	}
	
	private Node put(Node node, Key key, Value value){
		if(node==null) return new Node(key, value, 1);
		int compare = node.key.compareTo(key);
		if(compare==0) node.value = value;
		else if(compare<0) node.Right = put(node.Right, key, value);
		else node.Left = put(node.Left, key, value);
		root.size = size(root.Left) + size(root.Right) +1;
		return node;
	}
	
	public void deleteMin() {
		if(isEmpty()) throw new NoSuchElementException("Tree is empty!");
		root = deleteMin(root);
	}
	
	private Node deleteMin(Node node){
		if(node.Left==null) return node.Right;
		node.Left = deleteMin(node.Left);
		node.size = size(node.Left) + size(node.Right)+1;
		return node;
	}
	public void deleteMax() {
		if(isEmpty()) throw new NoSuchElementException("Tree is empty!");
		root = deleteMax(root);
	}
	
	private Node deleteMax(Node node){
		if(node.Right==null) return node.Left;
		node.Right = deleteMax(node.Right);
		node.size = size(node.Left) + size(node.Right)+1;
		return node;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
