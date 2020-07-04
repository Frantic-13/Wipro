public class Assignment17
{
	public static void main(String args[])
	{
		int x=Integer.parseInt(args[0]);
		int rem,reverse=0;
		while(x>0)
		{
			rem=x%10;
			reverse=reverse*10+rem;
			x=x/10;
		}
		if(reverse==Integer.parseInt(args[0]))
			System.out.println(args[0]+" is a palindrome");
		else
			System.out.println(args[0]+" is not a palindrome");
	}
}