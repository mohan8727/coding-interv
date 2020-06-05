class Node
{
	int data;

	Node (int data)
	{
	this.data=data;
	}
}
class Main
{
	
public static Node ms(Node n1, Node n2)
{
	
Node n1=null;
Node n2 = null;
if(n1==null)
{
	retrun n2;
}
else if(n2==null)
{
	return n1;
}
Node res=null;
if(n1.data<=n2.data)
{
	res=new Node(n1.data);
	res.next=ms(n1.next,n2);
}
else
{
	res= new Node(n2.val);
	res= new ms(n1,n2.next);
}
return res;
}

public static void main(String[] args)
{
	
	Node n1= new Node(1);
	n1.next=new Node(2);
	n1.next.next= new Node(4);

Node n2 = new Node(1);
n2.next= new NOde(3);
n2.next.next= new Node(4);

Node msl= new ms(n1,n2);
while(ms!=null)
{
System.out.println(msl.val+ " ");
msl=msl.next;
}
System.out.print();
}
}




