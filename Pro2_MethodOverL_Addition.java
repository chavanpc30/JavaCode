package class_Assign._Given_By_Manish;

public class Pro2_MethodOverL_Addition
{
	static void add(int a, int b)
	{
		System.out.println("Addition of Two integer value");
	}
	static void add(int a, double b)
	{
		System.out.println("Addition of 1 integer and 1 double value");
	}
	static void add(double a, double b)
	{
		System.out.println("Addition of Two double value");
	}
	static void add(double a, int b)
	{
		System.out.println("Addition of 1 double & 1 integer value");
	}
	static void add(long a, int b)
	{
		System.out.println("Addition of 1 long & 1 integer value");
	}
	static void add(long a, double b)
	{
		System.out.println("Addition of 1 long & 1 double value");
	}
	static void add(long a, long b)
	{
		System.out.println("Addition of Two long value");
	}
	
	public static void main(String[] args)
	{
		add(100,200);
		add(100,20.90);
		add(10.50,20.50);
		add(100.50,200);
		add(1567890l,200);
		add(1005678l,200.50);
		add(10234560l,203455540l);

//Here we add one add method name multiple time but list of paramter is diffrent 
		//i.e. Method overloading
}
}
