package wee3.day2;

public class FindIntersection {
	public static void main(String args[])
	{
	
	
int[]  num0= {3,2,11,4,6,7};
int[] num1= {1,2,8,4,9,7};
for(int i=0; i<num0.length; i++)
{
	for(int j=0; j<num1.length; j++)
	{
		if(num0[i]==num1[j])
		{
			System.out.println("the mach element in both array"+" "+num0[i]);
		}
	}
}
}
}