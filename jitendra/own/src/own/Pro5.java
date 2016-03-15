package own;
public class Pro5  
	{
	int i=4,j=4;
	float f1,f2;
	
	public int go()
	{
		Pro5 p=new Pro5();
		int k=p.go1();
		this.i=i+j;
		this.j=i*j;
		return k;
	}
	public int go1() {
		this.i=i/2;
		this.j=j*8;
		return this.i+this.j;
	}
	public static void main(String args[])
	{
		Pro5 n=new Pro5();
		int l=n.go();
		System.out.println(l);
	}
}
