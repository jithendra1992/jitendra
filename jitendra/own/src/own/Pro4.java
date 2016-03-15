package own;
import java.util.Scanner;

public class Pro4 extends Pro3{

	int i,sum,num;
	Scanner sc=new Scanner(System.in);
	public void main()
	{
		System.out.println("Enter no.on values to be added");
		int n=sc.nextInt();
		System.out.println("Entered " +n+ "number");
		for(i=0;i<n;i++)
		{
			num=sc.nextInt();
			sum=sum+num;
		}
		System.out.println("Sum of all the entered number are " +sum);
		sc.close();
	}
	
	public  void  main1()
	{
	Scanner in=new Scanner(System.in);
	System.out.println("Do you want to add sum of Two numbers");
	String t=in.next();
	if(t.equalsIgnoreCase("Y") && t.equalsIgnoreCase("y"))
	{
		lead();
		System.out.println("Do you want to add again");
		String t1=in.next();
		if(t1.equalsIgnoreCase("Y") && t1.equalsIgnoreCase("y"))
		{
			lead();
		}
		else if(t.equalsIgnoreCase("N") && t.equalsIgnoreCase("n"))
		{
			System.out.println("Thank you");
		}else {
			System.out.println("Thank you");
		}
	}
	else if(t.equalsIgnoreCase("N") && t.equalsIgnoreCase("n"))
		{
		System.out.println("Do you want to add Sum of n number");
		String t1=in.next();
		if(t1.equalsIgnoreCase("Y") && t1.equalsIgnoreCase("y"))
		{
			main();
		}
		else if(t1.equalsIgnoreCase("N") && t1.equalsIgnoreCase("n"))
		{
			System.out.println("Thank you");
		}
	
	}
	in.close();
	}
	public static void main(String[] args)
	{
				Pro4 p2=new Pro4();
				p2.main1();		
	}
	
}
