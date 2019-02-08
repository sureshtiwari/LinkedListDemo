package com.demo;

public class Adding1 {
	
	public static void main(String args[])
	{
		createLinkedList();
	}
	
	public Node createLinkedList()
	{
		addNode();
		return null;
		
	}
	
	public void addNode()
	{
		
	}
	
	public void printList(Node head)
	{
		while(head!=null)
		{
			System.out.println(head.data + " ");
		}
	}
	public Node addOne(Node head) {
		Node head1 = head;
		int carry = 1;
		while (head1 != null) {
			if (carry == 1) {
				if (head1.data + 1 == 10) {
					head1.data = 0;
					carry = 1;
					if (head1.next == null) {
						Node newnode = new Node(1);
						head1.next = newnode;
						continue;
					}
				} else {
					head1.data = head1.data + 1;
					carry = 0;
					continue;
				}
			}
		}
		return head;
	}
}