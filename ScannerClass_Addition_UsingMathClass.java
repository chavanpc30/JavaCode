package class_Assign._Given_By_Manish;

import java.util.Scanner;

public class ScannerClass_Addition_UsingMathClass
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	//Try to addition using math class and Scanner class together
	
	System.out.println("Enter the value of num1:");
	int num1=sc.nextInt();
	System.out.println("Enter the value of num2:");
	int num2=sc.nextInt();
	
	int add= Math.addExact(num1, num2);
	System.out.println("The Addition of two Number is:"+add);
	sc.close();
}
}
