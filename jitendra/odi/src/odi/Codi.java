package odi;

import java.util.Scanner;
public class Codi extends CustomException {
private static final long serialVersionUID = 1L;
float run_rate;
 int iscore,pscore;
 	public static void main(String[] args) 
	{
		Codi c=new Codi();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the TEAM1 Name");
			String t=sc.next();
			System.out.println("Enter the TEAM2 Name");
			String t1=sc.next();
			if(t.equalsIgnoreCase("IND") || t.equalsIgnoreCase("ind"))
			{
				System.out.println("Welcome to ODI IND Vs PAK");
				System.out.println("1st Innings Played my IND");
				c.ind();c.pak();
			}
			else if(t.equalsIgnoreCase("PAK") || t.equalsIgnoreCase("pak"))
			{
				System.out.println("Welcome to ODI PAK Vs IND");
				System.out.println("1st Innings Played my IND");
				c.ind();c.pak();
			}
	}
	public void ind()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the overs played by india");
		
		int overs=sc.nextInt();
		System.out.println("Enter the RunRate");
		float run_rate=sc.nextFloat();
		if(overs>=21)
		{
			System.out.println("CustomException");
			System.exit(0);
		}
			iscore=(int)(overs*run_rate);
		   	System.out.println("India score "+iscore +"/6");
	}
	public void pak() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the overs played by pakisthan");
		
		int overs=sc.nextInt();
		System.out.println("Enter the RunRate");
		float run_rate=sc.nextFloat();
		if(overs>=21)
		{
			System.out.println("CustomException");
			System.exit(0);
		}
		 	pscore=(int)(overs*run_rate);
		 	System.out.println("Pakisthan score "+ pscore +"/10");
		if(pscore>iscore)
			{
				System.out.println("Pakisthan won the match" +(pscore-iscore)+ " runs");
			}
		else if(iscore>pscore)
		{
			System.out.println("India won the match " +(iscore-pscore)+ " runs");
		}			
	}
}