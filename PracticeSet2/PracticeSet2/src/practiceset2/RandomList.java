package practiceset2;

public class RandomList {
	public static void main(String args[]){
		Node list=new Node(1);
		Node temp=list;
		for(int i=2;i<5;i++){
			temp.next=new Node(i);
			temp=temp.next;
		}
		
		temp=list.next;
		list.random=temp.next;
		while(temp!=null){
			temp.random=list;
			temp=temp.next;
		}
		temp=list.next;
		list.random=temp.next;
		while(temp!=null){
			temp.random=list;
			temp=temp.next;
		}
		
		System.out.println("Original List is:");
		temp=list;
		
		while(temp!=null){
			System.out.println("Node Data:"+temp.data);
			if(temp.random!=null)System.out.println("Node's random node data: "+temp.random.data);
			if(temp.next!=null)System.out.println("Node's next node data: "+temp.next.data);
			temp=temp.next;
		}
		
		Node cloned=null;
		temp=cloned;
		while(temp != null)
	    {
	        System.out.println(" Node data: "+temp.data);
	        if(temp.random!=null)System.out.println("random node data: "+temp.random.data);
	        if(temp.next!=null)System.out.println("next node data: "+temp.next.data);
			temp=temp.next;
	    }
	}
}

class Node{
		int data;
		Node next;
		Node random;
		Node(int n){
			data=n;
			next=null;
			random=null;
		}

	Node clonelist(Node origList){
		Node cloneList=null;
		Node temp=origList;
		while(temp!=null){
			Node newnode=new Node(temp.data);
			Node temp1=temp.next;
			temp.next=newnode;
			newnode.next=temp;
			temp=temp.next.next;
		}
		temp=origList;
		while(temp!=null){
			temp.next.random=temp.random.next;
			temp=temp.next.next;
		}
		temp=origList;
		cloneList=origList.next;
		while(temp!=null){
			Node temp1=temp.next;
			if(temp.next!=null)temp.next=temp.next.next;
			if(temp1.next!=null)temp1.next=temp1.next.next;
			temp=temp.next;
		}
		return cloneList;
	}
}
