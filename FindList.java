package wee3.day2;


import java.util.ArrayList;
import java.util.List;

public class FindList {
public static void main(String args[])
{
	int count=0;
	int num[] =   {1,2,3,1,4,5,1,6};



	for(int i=0; i<num.length; i++)
	{
		if(num[i]==1)
		{
			count++;
		}
			
	}
	System.out.println(count);

}
}
