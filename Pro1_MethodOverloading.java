package class_Assign._Given_By_Manish;

public class Pro1_MethodOverloading
{//Wap to login to amazon using with email and mobile
	
	static void login(String email)
	{
		System.out.println("Login to the amazon with Email");
	}
	static void login(long mobileno)
	{
		System.out.println("Login to the amazon with MobileNumner");
	}
	public static void main(String[] args)
	{
		login("pooja@gmail.com");
		login(9876567890l);
//here we add the two login method with diffrent paramter i.e methodOverloading
		
		
	}
	
}
