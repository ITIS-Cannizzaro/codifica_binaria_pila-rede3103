import java.util.Stack;
public class Main 
{
	public static void main(String[]args)
	{
		int cont=0;
		Stack mystack = new Stack();
		int num=255;
		while(num>0)
		{
		mystack.push(num%2);
		num=num/2;	
		}
		while(mystack.isEmpty()==false)
		System.out.print(mystack.pop());
	}
}
