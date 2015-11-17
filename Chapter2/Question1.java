package ctci;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.LinkedList;

/*
 * Write code to remove duplicates from an unsorted linked list 
 * FOLLOW UP
 * How would you solve this problem if a temporary buffer is not allowed?
 */

public class Question1 {
	

	public static void main(String[] args){	
		Node ll1 = new Node(new int[]{});
		Node ll2 = new Node(new int[]{0});
		Node ll3 = new Node(new int[]{0,1});
		Node ll4 = new Node(new int[]{0,0});
		Node ll5 = new Node(new int[]{0,0,1,1});
		Node ll6 = new Node(new int[]{0,1,1,2,3,4,4,5,6});
		Node ll7 = new Node(new int[]{0,1,2,3,4,5,6});
		
		pt(removeDup(ll1)); //0
		pt(removeDup(ll2)); //0
		pt(removeDup(ll3)); //0,1
		pt(removeDup(ll4)); //0
		pt(removeDup(ll5)); //0,1
		pt(removeDup(ll6)); //0,1,2,3,4,5,6
		pt(removeDup(ll7)); //0,1,2,3,4,5,6

	}
	
	//Checks if str1 is str2 rotated
	public static Node removeDup(Node head){
		if(head == null){
			return null;
		}
		if(head.size() == 0 ){
			return head;
		}else{
			Hashtable<Integer, Boolean> ht = new Hashtable<Integer, Boolean>();
			Node n = head;
			ht.put(n.val, true);
			while(n!=null && n.next!=null){
				if(ht.get(n.next.val)){
					//skip
					n.next=n.next.next;
					n=n.next;
				}
				else{
					//add 
					ht.put(n.val, true);
					n=n.next;
				}
			}
			return head;
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
