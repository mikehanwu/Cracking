package ctci;

/*
 * You have two numbers represented by a linked list, where each node contains a single digit 
 * The digits are stored in reverse order, such that the 1’s digit is at the head of the list 
 * Write a function that adds the two numbers and returns the sum as a linked list
 * 
 * EXAMPLE
 * Input: (3 -> 1 -> 5), (5 -> 9 -> 2) 
 * Output: 8 -> 0 -> 8
 */

public class Question4 {
	

	public static void main(String[] args){	
		Node ll1 = new Node(new int[]{0});
		Node ll2 = new Node(new int[]{5});
		Node ll3 = new Node(new int[]{1,0});
		Node ll4 = new Node(new int[]{2,2,2});
		
		pt(add(ll1,ll2)); //5
		pt(add(ll2,ll3)); //15
		pt(add(ll2,ll4)); //227
		pt(add(ll3,ll4)); //232
		pt(add(ll4,ll4)); //444
		
	}
	
	public static int[] add(Node head1, Node head2){
		//can't remove nothing or if nothing after the node
		if(head1==null || head2==null){
			return null;
		}
		else{
			int val1 = 0;
			int size1 = head1.size();
			int val2 = 0;
			int size2 = head2.size();
			Node n1 = head1;
			Node n2 = head2;
			for(int x = size1-1; x>=0; x--){
				val1 = val1 + (int) Math.pow(10, x)*n1.val;
				n1=n1.next;
			}
			for(int y = size2-1; y>=0; y--){
				val2 = val2 + (int) Math.pow(10, y)*n2.val;
				n2=n2.next;
			}
			//change sum to single digit array to make into linkedlist
			int sum = val1 + val2;
			int numOfDigits = Integer.toString(sum).length();
			int[] sumAsArray = new int[numOfDigits];
			for(int i = numOfDigits-1; i>=0; i--){
				sumAsArray[i] = sum%10;
				sum=sum/10;
			}
			return sumAsArray;
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
	
	private static void pt(int[] array){
		for(int i = 0; i<array.length;i++){
			System.out.print(array[i]);
		}
		pt("");
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
