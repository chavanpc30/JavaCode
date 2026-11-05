package class_Assign._Given_By_Manish;

import java.util.Scanner;

public class ScannerClass_Area_Cricumference_Triangle
{
public static void main(String[] args)
{
	//Area of Triangle = 0.5*base*height
	Scanner s1=new Scanner(System.in);
	
	System.out.println("Please Enter the value of Base:");
	int b= s1.nextInt();
	System.out.println("Please Enter the value of Height:");
	int h= s1.nextInt();
	
	double areaofTriangle= 0.5*b*h;
	System.out.println("The area of Triangle is:"+areaofTriangle);
	
	//Circumference of Triangle= a+b+c
	System.out.println("Enter the value of a:");
	int a= s1.nextInt();
	int cir= a*b*h;
	
	System.out.println("Cicumference of Triangle is:"+cir);
	s1.close();
}
}
