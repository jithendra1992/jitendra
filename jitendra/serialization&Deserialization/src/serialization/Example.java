package serialization;

import java.io.FileInputStream;
import java.io.EOFException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

public class Example implements Serializable 
{
	
	private static final long serialVersionUID = 1L;
	int id;
	String Name;
	double salary;
	
	public void serializationExample()throws Exception
	{
		Scanner scanner=new Scanner(System.in);
		Example example;
		FileOutputStream fos=new FileOutputStream("D:/myfile.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		System.out.println("Enter how many data you want to insert");
		int len=scanner.nextInt();
		
		for(int i=0;i<=len-1;i++)
		{
			example=new Example();
			System.out.println("Enter Id");
			example.id=scanner.nextInt();
			System.out.println("Enter Name");
			example.Name=scanner.next();
			System.out.println("Enter Salary");
			example.salary=scanner.nextDouble();
			oos.writeObject(example);
		}
		System.out.println("done");
		oos.close();
		fos.close();
		scanner.close();
		
	}
	public void deSerialization() throws Exception
	{
		Example example;
		FileInputStream fis=new FileInputStream("D:/myfile.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Object object;
		while((object=ois.readObject())!=null)
		{
			example=(Example)object;
			System.out.println("Id = " +example.id);
			System.out.println("Name = "+example.Name);
			System.out.println("Salary = "+example.salary);
		}
		ois.close();fis.close();
	}
	public static void main(String[] args) throws Exception
	{
		try
		{
			Example example=new Example();
			example.serializationExample();
			example.deSerialization();
		}
		catch(EOFException e)
		{
			
			System.out.println("Thank you");
		}
		
	}

}
