class Node
{
	int data;
	Node next;
	Node(int data)
	{
		this.data=data;
	}
}
class Main
{
	public static Node add(Node n1,Node n2)
	{
		Node resnull, head=null;
		int car=0;
		while(n1!=null||n2!=null)
		{
			int sum=0;
			if(n1!=null)

			{
				sum+=n1.data;
				n1=n1.next;
			}
			if(n2!=null)
			{
				sum+=n2.data;
				n2= n2.next;
			}
			sum+=car;

			int val =sum%10;
			car=sum/10;
			Node nod= new Node(val);
			if(res!=null)
			{
				res.next=node;
				res=res.next;
			}
			else
			{
				res=head=node;
			}
			if(car>0)
			{
				res.next= new Node(car);
			}
			return head;
		}

	public static void main(String[] args)
	{
		Node n1= new Node(2);
		n1.next=new Node(4);
		n1.next.next= new Nod(3);
		Node n2 = new Node(5);
		n2.next= new Node(6);
		n2.next.next=new Node(8);

		Node res= add(n1,n2);
		while(res!=null)
		{
			System.out.println(res.val+" ");
			res= res.next;
		}
	
	// sop here 
	}



	}