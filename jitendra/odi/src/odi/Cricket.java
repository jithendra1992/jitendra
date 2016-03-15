package odi;

import java.util.Scanner;
public class Cricket extends CustomException{
	
	Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		Cricket c=new Cricket();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the TEAM1 Name");
			String t=sc.next();
			System.out.println("Enter the TEAM2 Name");
			String t1=sc.next();
			if(t.equalsIgnoreCase("IND") || t.equalsIgnoreCase("ind"))
			{
				System.out.println("Welcome to ODI IND Vs PAK");
				System.out.println("1st Innings Played my IND");
				Cricket c1=new Cricket();
				int i=c1.team();
				int p=c1.team();
				if(i>p)
				{
					System.out.println("India own the Match by " +(i-p) + " runs");
				}
				if(p>i)
				{
					System.out.println("Pakistan own the Match by " +(p-i) + " runs");
				}
			}
			else if(t.equalsIgnoreCase("PAK") || t.equalsIgnoreCase("pak"))
			{
				System.out.println("Welcome to ODI PAK Vs IND");
				System.out.println("1st Innings Played my IND");
				Cricket c1=new Cricket();
				int i=c1.team();
				int p=c1.team();
				if(i>p)
				{
					System.out.println("India own the Match by " +(i-p) + " runs");
				}
				if(p>i)
				{
					System.out.println("Pakistan own the Match by " +(p-i) + " runs");
				}
			}
			
			
	}
	public int team() 
	{
		System.out.println("Enter the overs played by Team");
		int k=sc.nextInt();
		if(k>=20)
		{
		System.out.println("Overs should be less than 20");
		System.exit(0);
		}
		System.out.println("Enter the runrate");
		float r=sc.nextFloat();
		int score=(int) (k*r);
		System.out.println("Score of team " +score +" runs /  6");
		return score;
	}
	
}