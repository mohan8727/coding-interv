import java.util.Arrays;

class Main
{
public static void  push(int arr[])
{

int x=0;
for(int i: arr)
{

if(i!=0)
{
arr[x++]=i;

}

} 
for(int i=x;i<arr.length;i++)
{
arr[i]=0;

}
}
public static void main(String[] args)
{

int arr[]={1,2,0,4,0,5,0,1};
push(arr);
System.out.print(Arrays.toString(arr));
}

}



