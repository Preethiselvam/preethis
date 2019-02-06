/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner n=new Scanner(System.in);
		int num=n.nextInt();
		if(num>0)
	{
		System.out.println("Possitive");
	}
	else if(num<0)
	{
		System.out.println("Negative");
	}
	else 
	{
		System.out.println("Zero");
	}
	}
}
