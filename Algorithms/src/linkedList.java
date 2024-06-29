
public class linkedList<E> {
	class Node<E>{
		E data;
		Node<E> next;
		Node<E>prev;
		Node(E obj){
			data=obj;
			next=prev=null;
			
		}
	}
	private Node<E> head;
	private Node<E> taile;
	private int currentSize;
	public linkedList() {
		head=taile=null;
		currentSize=0;
	}
	public void addFirst(E obj) {
		Node<E> node=new Node<E>(obj);
		node.next=head;
		head=node;
		currentSize++;
		
	}
	public void addLast(E obj) {
		Node<E> node=new Node<E>(obj);
		if(head==null) {
			head=taile=node;
			currentSize++;
			return;
			
		}
			
		
		taile.next=node;
		taile=node;
		currentSize++;
		return;
		
		
	}
	public void insert(E obj) {
		Node<E> node=new Node<E>(obj);
	}
	public E removeFirst() {
		E temp=head.data;
		if(head==null)
			return null;
		
		else if(head==taile) {
			head=taile=null;
			currentSize--;
			return temp;
		}
		else {
			head=head.next;
			currentSize--;
			return temp;

		}
	
	}
	public E removeLast() {
		E temp=head.data;
		if(head==null)
			return null;
		if(head==taile)
			removeFirst();
		Node<E> current=head,prev=null;
		while(current!=taile) {
			prev=current;
			current=current.next;
			
		}
		prev.next=null;
		taile=prev;
		currentSize--;
		return current.data;
		
		
	}
	public E remove() {
		return null;
		
	}
	public E find(E obj) {
		
		return obj;
		
	}

	
}
