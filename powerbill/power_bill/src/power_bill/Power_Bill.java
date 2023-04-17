package power_bill;
import java.util.Scanner;
public class Power_Bill {
	//power bill calculator
public static void main(String args[])
{
	//getting the units from the user
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of units");
	int units=sc.nextInt();
	//calculating the units within 50 to 100
	if((units>=0)&&(units<=100))
	{
		if(units<=50)
		{
			float cal=(float)(units*1.45);
			System.out.println("The power consumed for the "+units+" units is:"+cal);
		}
		else
		{
			int sub=units-50;
			float cal=(float)(50*1.45+sub*2.60);
			System.out.println("The power consumed for the "+units+" units is:"+ cal);
			
		}
	}
	else if((units>100) && (units<=200))
	{
		int sub=units-100;
		float cal=(float)(100*1.45+sub*2.60+sub*4.30);
		System.out.println("The power consumed for "+units+" units is:"+cal);	
	}
	else if(units>200) 
	{
		if(units>200 && units<=300)
		{
			int sub=units-200;
			System.out.println("The power consumed for the "+units+" units is:"+(200*5+sub*7.20));
		}
		else if(units>300 && units<=400)
		{
			int sub=units-300;
			System.out.println("The power consumed for the "+units+" units is:"+(200*5+100*7.20+sub*8.50));
		}
		else if(units>400 && units<=800)
		{
			int sub=units-400;
			System.out.println("the power consumed for the "+units+" units is:"+(200*5+100*7.20+100*8.50+sub*9));
		}
		else
		{
			int sub=units-800;
			System.out.println("The power consumed for the "+units+" units is:"+(200*5+100*7.20+100*8.50+400*9+sub*9.5));
		}
	}
		else 
		{
			System.out.println("Please enter the positive units");
		}
	}
	
	
	
}


