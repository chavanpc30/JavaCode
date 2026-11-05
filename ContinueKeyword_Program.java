package class_Assign._Given_By_Manish;

public class ContinueKeyword_Program
{
	public static void main(String[] args) 
	{
		for(int month=1;month<=12;month++)
		{
			for(int day=1;day<=31;day++)
			{
				if(month==2 && day>28) //for febury 
					continue;
				if(month ==4 ||month==6 || month==9|| month==11)
					continue; //for april, june, september,november
				
				switch(month)
				{
				case 1: System.out.println("January:date"+day);
				break;
				case 2: System.out.println("February:date"+day);
				break;
				case 3: System.out.println("March:date"+day);
				break;
				case 4: System.out.println("April:date"+day);
				break;
				case 5: System.out.println("May:date"+day);
				break;
				case 6: System.out.println("June:date"+day);
				break;
				case 7: System.out.println("July:date"+day);
				break;
				case 8: System.out.println("August:date"+day);
				break;
				case 9: System.out.println("September:date"+day);
				break;
				case 10: System.out.println("October:date"+day);
				break;
				case 11: System.out.println("November:date"+day);
				break;
				case 12: System.out.println("December:date"+day);
				break;
				
				}
			
			}

		}
		
	}
}