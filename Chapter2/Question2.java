package ctci;

/*
 * Implement an algorithm to find the nth to last element of a singly linked list
 */

public class Question2 {
	

	public static void main(String[] args){	
		Node ll1 = new Node(new int[]{0});
		Node ll2 = new Node(new int[]{0,1,2,3,4,5,6});
		
		pt(nthLast(ll1, 0));  //-1
		pt(nthLast(ll1, 1));  //0
		pt(nthLast(ll2, -1)); //-1
		pt(nthLast(ll2, 1));  //6
		pt(nthLast(ll2, 5));  //2
		pt(nthLast(ll2, 10)); //-1

	}
	
	//-1 returned means it didn't not a nthToLast elem
	public static int nthLast(Node head, int nthToLast){
		if(nthToLast <= 0){
			return -1;
		}
		if(nthToLast > head.size()){
			return -1;
		}
		else{
			Node n = head;
			for(int i = 0; i<head.size()-nthToLast; i++){
				n=n.next;
			}
			return n.val;
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
	public Node(int data){
		val=data;
		next=null;
	}
	public Node(int[] vals){
		if(vals==null || vals.length==0){
			return;
		}
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
