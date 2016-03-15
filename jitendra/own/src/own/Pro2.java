package own;

public class Pro2 {
	int i=5,j=10,k=5;
	static float f1,f2;
	int f3;
	public int jam()
	{
		f1=i+j;//15
		f2=i*j;//50
		f3=i+j*k;//55
		return f3;
	}
	public int jam1()
	{
		Pro2 p=new Pro2();
		p.jam();
		int p1=p.jam();
		return p1;
	}
	
	public static void main(String args[])
	{		
		Pro2 l=new Pro2();
		int m=l.jam1();
		System.out.println(m);
		Pro2 f=new Pro2();
		int f4=f.jam();
		
		if(m==f4)
		{
			System.out.println("added");
		}
		else
		{
			System.out.println("Not added");
		}
		
		
	}
}
