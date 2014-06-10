package practiceset2;
import java.io.*;
import java.util.*;

public class listispalendrome {
	public static void main(String[] args){
		int option;
		LinkedList l=new LinkedList();
		while(true){
			System.out.println("Enter your choice");
			System.out.println("1. Insert Begin"+"\n"+"2. Insert End"+"\n"+"3. Palendrome");
			System.out.println("Enter 0 to exit");
			Scanner sc=new Scanner(System.in);
			option=sc.nextInt();
			switch(option){
			case 1: l.insertBegin();
			l.print();
			break;
			case 2: l.deleteFirst();
			l.print();
			break;
			case 3: l.Palendrome();
			break;
			case 0: System.exit(0);
			}
		}
	}
}

class LinkedList{
	private class Node{
		int data;
		Node next;
	}
	Node head=null;
	public void print(){
		Node n=new Node();
		n=head;
		while(n!=null){
			System.out.print(n.data+"->");
			n=n.next;
		}
	}
	public void Palendrome(){
		Node temp=head;
		Stack<Integer> s=new Stack<Integer>();
		while(temp.next!=null){
			s.push(temp.data);
			temp=temp.next;
		}
		temp=head;
		while(!s.empty()){
			if(temp.data==s.pop()){
				temp=temp.next;
			}
			else{
				System.out.println("Not a palendrome");
				break;
			}			
		}
		
	}
	public void insertBegin(){
		Node node=new Node();
		if(head==null){
			head=node;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the element");
			head.data=sc.nextInt();
			head.next=null;
		}
		else{
			node.next=head;
			System.out.println("Enter the element");
			Scanner sc=new Scanner(System.in);
			node.data=sc.nextInt();
			head=node;
		}
	}
	public void deleteFirst(){
		Node temp=head;
		if(head==null){
			System.out.println("No elements in the list");
		}
		else if(head.next==null){
			head=null;
		}
		else{
			head=temp.next;
			temp=null;
		}
	}
}