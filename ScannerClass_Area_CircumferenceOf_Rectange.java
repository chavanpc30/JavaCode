package class_Assign._Given_By_Manish;

import java.util.Scanner;

public class ScannerClass_Area_CircumferenceOf_Rectange
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	
	//Area of Rectange= Length*Width
	System.out.println("Enter the value of length");
	int l= sc.nextInt();
	System.out.println("Enter the value of width");
	int w= sc.nextInt();
	
	int areaOfrectangle=l*w;
	System.out.println("Area of Rectangle is:"+areaOfrectangle);
	
	//Circumference of Rectangle= 2(l+w)
	
	int cirofRectangle =2*(l+w);
	System.out.println("The circumference of rectangle is:"+cirofRectangle);
	sc.close();
	
	
}
}
