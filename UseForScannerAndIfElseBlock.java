package class_Assign._Given_By_Manish;

import java.util.Scanner;

public class UseForScannerAndIfElseBlock
{
public static void main(String[] args)

{
	Scanner sc=new Scanner(System.in);
	for(int i=1;i<=20;i++)
	{
		System.out.println("Enter your running age here:");
		int age=sc.nextInt();
		if(age>=18)
		{
			System.out.println("Congratulation you can vote....!!!!!");
		}
		else
		{
			System.out.println("person can't vote");
		}

	}
	sc.close();
}
	
}

