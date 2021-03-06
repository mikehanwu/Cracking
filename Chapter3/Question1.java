package ctci;

/*
 * Describe how you could use a single array to implement three stacks.
 */

public class Question1 {
	

	public static void main(String[] args){	
		Node ll1 = new Node(new int[]{0});
		Node ll2 = new Node(new int[]{5});
		Node ll3 = new Node(new int[]{1,0});
		Node ll4 = new Node(new int[]{2,2,2});
		
	}
	
	public static Node findLoop(Node head){
		return null;
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
