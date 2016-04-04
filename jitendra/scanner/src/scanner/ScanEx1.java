package scanner;
import java.util.Scanner;
public class ScanEx1 {

	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter roll no:");
		int rollno=sc.nextInt();
		System.out.println("Enter your name");
		String name=sc.next();
		System.out.println("Enter Percentage");
		float per=sc.nextFloat();
		System.out.println("Student Details"+"\n" +"rollno: "+rollno+"\n"+"name: "+name+"\n"+"percentage: "+per+"%");
		sc.close();
	}
}
