package own;

class Test extends Pro5
{
	public int omega()
	{
		Test t=new Test();
		t.go();
		super.i=i+j+i;
		super.j=i+i+i;
		return super.i+super.j;
	}	
	public static void main(String[] args) {
		Test h=new Test();
		int v=h.omega();
		System.out.println(v);
	}
}
