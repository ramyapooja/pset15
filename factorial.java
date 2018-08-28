/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int fact1=1;
		for(int i=1;i<=a;i++)
		{
			fact1=fact1*i;
		}
		int fact2=1;
		for(int i=1;i<=b;i++)
		{
			fact2=fact2*i;
		}
		int res=fact1/fact2;
		System.out.println(res);
	}
}
