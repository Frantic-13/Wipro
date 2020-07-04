import java.lang.*;
import java.io.*;
import java.util.*;

class Video
{
	String videoName;
	boolean checkout;
	int rating;

	public Video(String vidname)
	{
		videoName=vidname;
	}
	public String getName()
	{
		return videoName;
	}

	public void doCheckout()
	{
		System.out.println("Video"+getName()+"checked out successfully");
		checkout=true;
	}
	public void doReturn()
	{	
		System.out.println("Video"+getName()+"checked out successfully");
		checkout=false;
	}
	public void recieveRating(int rate)
	{
		rating=rate;
	}
	public int getRating()
	{
		return rating;
	}
	public boolean getCheckout()
	{
		return checkout;
	}

}

class VideoStore
{
	Video[] store=new Video[10];
	static int noOfvideos=0;
	public void addVideo(String name)
	{
		store[noOfvideos]=new Video(name);
		System.out.println("Video "+store[noOfvideos].getName()+" added successfully");
		noOfvideos++;
	}

	public void doCheckout(String name)
	{	
		if(noOfvideos==0)
		{
			System.out.println("Empty Store");
			return;
		}
		for(int i=0;i<noOfvideos;i++)
		{
			if(store[i].videoName.equals(name))
			{
				store[i].doCheckout();
				break;
			}
		}
	}

	public void doReturn(String name)
	{
		if(noOfvideos==0)
		{
			System.out.println("Empty Store");
			return;
		}
		for(int i=0;i<noOfvideos;i++)
		{	
			if(store[i].videoName.equals(name))
			{
				store[i].doReturn();
				break;
			}
		}
	}
	public void recieveRating(String name,int rating)
	{
		if(noOfvideos==0)
		{
			System.out.println("Empty Store");
			return;
		}
		for(int i=0;i<noOfvideos;i++)
		{
			if(store[i].videoName.equals(name))
			{
				store[i].recieveRating(rating);
				System.out.println("Rating"+store[0].getRating()+"has been mapped to the video"+store[0].getName());
				break;
			}
			
		}
	}

	public void listInventory()
	{
		System.out.println("------------------------------------------------------");
		System.out.println("Video Name \t| Checkout Status \t| Rating");
		for(int i=0;i<noOfvideos;i++)
		{
			System.out.println(store[i].getName()+ "\t\t|" +store[i].getCheckout()+"\t\t|" +store[i].getRating());
		}
		System.out.println("------------------------------------------------------");
	}

}

public class VideoLauncher
{
	public static void main(String args[])
	{
		int choice;
		Scanner input=new Scanner(System.in);
		VideoStore videoStore=new VideoStore();
		String name;
		while(true)
		{
			System.out.println("MAIN MENU \n=========\n1. Add Videos: \n2. Check Out Video: \n3. Return Video: \n4. Receive Rating: \n5. List Inventory: \n6. Exit: \nEnter your choice(1..6): ");
			choice=input.nextInt();
			input.nextLine();

				if(choice==1)
				{ 
						System.out.println("Enter the name of the video you want to add: ");
						name =input.nextLine();
						videoStore.addVideo(name);
				}
				else if(choice==2)
				{
					System.out.print("Enter the name of the video you want to check out: ");
					name =input.nextLine();
					videoStore.doCheckout(name);
					break;
				}
				else if(choice==3)
				{
					System.out.print("Enter the name of the video you want to Return:");
					name =input.nextLine();
					videoStore.doReturn(name);
				}
				else if(choice==4)
				{
					System.out.println("Enter the name of the video you want to Rate: ");
					name =input.nextLine();
					System.out.println("Enter the rating for this video: ");
					int rate=input.nextInt();
					videoStore.recieveRating(name,rate);
				}
				else if(choice==5)
				{
					videoStore.listInventory();
				}
				else if(choice==6)
				{
					System.out.println("Enter ...!! Thanks for using the application");
					System.exit(1);
				}
				else
				{
					System.out.println("Enter correct choice");
				}
				
			
		}

	}
}