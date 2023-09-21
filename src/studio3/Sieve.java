package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Input the upper boundary.");
		int upperbound = in.nextInt();
		int[] nums = new int[upperbound+10];
		for (int i=2; i<=upperbound; i++)
			nums[i]=0;
		for (int i=2; i<=(int) Math.pow(upperbound,0.5); i++)
		{
			if (nums[i]!=1)
			{
				int multiply=i;
				while (multiply+i <= upperbound)
				{
					//System.out.println(multiply);
					multiply=multiply+i;
					nums[multiply]=1;
				}
			}
		}
		for (int i=2; i<=upperbound; i++)
			if (nums[i]==0) System.out.print(i + " ");
	}

}
