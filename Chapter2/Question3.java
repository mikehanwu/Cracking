package ctci;


/*
 * Implement an algorithm to delete a node in the middle of a single linked list, given only access to that node
 * 
 * EXAMPLE
 * Input: the node ‘c’ from the linked list a->b->c->d->e
 * Result: nothing is returned, but the new linked list looks like a->b->d->e
 */

public class Question3 {
	

	public static void main(String[] args){	
		Node ll = new Node(new int[]{0,1,2,3,4,5,6});
		
		remove(ll.next);
		pt(ll); //0, 2, 3, 4, 5, 6
		
		remove(ll);
		pt(ll); //2, 3, 4, 5, 6
		
	}
	
	public static boolean remove(Node toRemove){
		//can't remove nothing or if nothing after the node
		if(toRemove == null || toRemove.next==null){
			return false;
		}
		else{
			Node next = toRemove.next;
			toRemove.val = next.val;
			toRemove.next = next.next;
			return true;
		}
	}
	
	private static void pt(Object obj){
		System.out.println(obj);
	}
	
	private static void pt(Node head){
		while(head!=null){
			System.out.print(head.val + ", ");
			head=head.next;
		}
		System.out.println();
	}
}

class Node{
	int val;
	Node next;
	public Node(){
		next = null;
	}
	public Node(int data){
		val=data;
		next=null;
	}
	public Node(int[] vals){
		if (vals == null || vals.length == 0)
			return;
		Node node = this;
		node.val = vals[0];
		for(int i = 1; i<vals.length; i++){
			node.append(vals[i]);
			node=node.next;
		}
	}
	public void append(int data){
		Node n = this;
		while(n.next!=null)
			n=n.next;
		n.next=new Node(data);
	}
	public int size(){
		int size = 0;
		Node n = this;
		while(n!=null){
			size++;
			n=n.next;
		}
		return size;
	}
}
