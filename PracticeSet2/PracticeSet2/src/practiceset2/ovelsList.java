package practiceset2;
import java.io.*;
import java.util.*;

public class ovelsList {
	public static void main(String[] args){
		int option;
		ovList list=new ovList();
		while(true){
			System.out.println("Enter your choice");
			System.out.println("1. Insert Begin"+"\n"+"2. Insert End"+"\n"+"3. Palendrome");
			System.out.println("Enter 0 to exit");
			Scanner sc=new Scanner(System.in);
			option=sc.nextInt();
			switch(option){
			case 1: list.insertBegin();
			list.print();
			break;
			
			case 0: System.exit(0);
			}
		}
	}
}
	
class ovList{
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
		public void find(){
			Node n=head;
			Node m=head;
			while(m!=null && m.next!=null){
				n=n.next;
				m=m.next.next;
			}
			Node temp=n;
			
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