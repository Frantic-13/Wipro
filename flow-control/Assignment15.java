import java.util.*;
import java.lang.*;
public class Assignment15
{
	public static void main(String args[])
	{	
		int num;
		Scanner sc= new Scanner(System.in);
		if(args.length==0)
		{
			System.out.println("Please enter a integer number");
			num=sc.nextInt();
		}
		else
		{
			num=Integer.parseInt(args[0]);
		}
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}