package class_Assign._Given_By_Manish;

import java.util.Scanner;

public class ScannerClass_Area_CircumferenceOf_Square
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	
	//Area of Square= side*side 
	System.out.println("The the value of side:");
	int side=sc.nextInt();
	int areaOfSquare = side*side;
	System.out.println("Area of Square is:"+areaOfSquare);
	
	//Circumference of Square= 4*side
	 int Circumference= 4*side;
	 System.out.println("The Circumference of Square is:"+Circumference);
	 sc.close();
}
}
