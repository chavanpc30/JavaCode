package class_Assign._Given_By_Manish;

import java.util.Scanner;

public class Scanner_AreaAndCircumferenceOfCricle 
{
public static void main(String[] args) 
{
	//Area of circle= pi*r*r
	Scanner s1= new Scanner(System.in);
	System.out.println("Please Enter the Radius");
	int radius=s1.nextInt();
	double area=Math.PI*radius*radius;
	System.out.println("The area of circle is:"+area);
	
	//area of Circumference= 2*pi*r
	double circumference= 2*Math.PI*radius;
	System.out.println("The area of circumference is:"+circumference);
	
	s1.close();
}
}
