import java.util.*;
import java.lang.*;
public class Assignment1
{
	public static void main(String args[])
	{
		int num;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number");
		num=sc.nextInt();
		if(num<0)
			System.out.println("Negative");
		else if(num>0)
			System.out.println("Positive");
		else
			System.out.println("Zero");
		sc.nextLine();
		int num1,num2;
		System.out.println("Enter 2 negative numbers");
		num1=sc.nextInt();
		num2=sc.nextInt();
		if(((num1%10)*(-1))==((num2%10)*(-1)))
			System.out.println("true");
		else
			System.out.println("false");

	}
} 