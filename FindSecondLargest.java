package wee3.day2;

import java.util.Arrays;

public class FindSecondLargest {
public  static void main(String arg[])
{
	int[] data = {3,2,11,4,6,7};
	Arrays.sort(data);
	for(int i=0; i<data.length; i++)
	{
if(data[i]==data[4])
{
	System.out.println("my second largest+" +data[i]);
}
	}
}
}

