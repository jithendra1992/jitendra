package own;
import java.util.Scanner;

public class Pro3 {
	
	int i,j,sum;
	
	Scanner sc=new Scanner(System.in);
	public void lead()
	{
		System.out.println("Enter i value");
		int i=sc.nextInt();
		System.out.println("Enter j value");
		int j=sc.nextInt();
		int sum=i+j;
		System.out.println("Result of two values are "+sum);
	}
	public static void main(String[] args) {
		Pro3 p=new Pro3();
		p.lead();
	}
}
