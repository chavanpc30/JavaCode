package class_Assign._Given_By_Manish;

public class Math_Class_program 
{
	public static void main(String[] args)
	{
	
		int sum=Math.addExact(100, 20);
		System.out.println("The sum of two number is:"+sum);
		
		long result= Math.addExact(234567l, 234789l);
		System.out.println("The multiplication of two number is:"+result);
		
		System.out.println("The subtraction of two number is:"+Math.subtractExact(29, 89));
		
		System.out.println("The substraction of two long numberis:"+Math.subtractExact(3456679l, 56846544l));
		
		
	}
}
