package power_bill;
import java.util.Scanner;
public class Pizza_Class2 {
	
	private int size_of_pizza;
	private int no_of_toppings;
	private String pizza_name;
	public Pizza_Class2()
	{
		this.size_of_pizza=size_of_pizza;
		this.no_of_toppings=no_of_toppings;
	}
	public int getPizza() 
	{
		return size_of_pizza;
	}
	public void setPizza(int size_of_pizza)
	{
		this.size_of_pizza=size_of_pizza;
	}
	public int getToppings() 
	{
		return no_of_toppings;
	}
	public void setToppings(int no_of_toppings)
	{
		this.no_of_toppings=no_of_toppings;
	}
	public String getName() 
	{
		return  pizza_name;
	}
	public void setName(String pizza_name)
	{
		this. pizza_name= pizza_name;
	}
	public void calculate_cost()
	{
		
		Scanner sc=new Scanner(System.in);
		int total_cost=0;
		int medium=50;
		int large=100;
		System.out.println("Enter the Size of the Pizza");
		Scanner s1=new Scanner(System.in);
		int choice=s1.nextInt();
		
		
		
		
		
	}
	private void getDescription()
	{
		System.out.println("<--------------------------------Pizaa Menu----------------------------------------->");
		System.out.println("     ");
		System.out.println("     ");
		System.out.println("Veg-Pizaa Menu");
		System.out.println(" ");
		System.out.println("1.Margherita Pizza  ");
		System.out.println("2.Mushroom Pizza  ");
		System.out.println("3.Framhouse Pizza   ");
		System.out.println("4.Double Cheese Margherita Pizza");
		System.out.println("5.Peppy Panner Pizza ");
		System.out.println("6.Veg-Extra Vaganza Pizza ");
		System.out.println("     ");
		System.out.println("     ");
		System.out.println("Non-Veg Pizza");
		System.out.println(" ");
		System.out.println("1.Jerked Chicken Pizza");
		System.out.println("2.Classic Chicken Pizza ");
		System.out.println("3.BBQ Chicken Pizza");
		System.out.println("4.Meat Lover Pizza");
		System.out.println("5.Mutton Keema Pizza ");
		System.out.println("6.Gamberi Pizza");
	}
	public static void main(String args[])
	{
		Pizza_Class2 pc=new Pizza_Class2();
		Scanner sc=new Scanner(System.in);
		pc.getDescription();
	}
	
	

}
