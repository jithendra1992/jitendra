package own;
import java.util.Arrays;

public class Pro1 {
public static void main(String[] args) throws Exception {
	int i[]={2,3,4,5,1,6,9,11,5,6,24,7};
	Arrays.sort(i);
	printArray("Sorted array" , i);
	int j=Arrays.binarySearch(i,3);
	System.out.println("Found 3 @" +j);
}
public static void printArray(String message, int i[]) {
	System.out.println(message +"length= " +i.length+"");
	for (int k=0;k<i.length;k++)
	{
		if(k!=0)
		{
			System.out.print(",");
		}
		System.out.print(i[k]);
	}
	System.out.println();	
}

}
