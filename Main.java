package com.kce.bean;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;
public class Main {
 public static void main(String args[])
 {
	 MenuCard.Display();
	 Add a=new Add();
	 a.addToOrder();
	 a.Display();
	 a.bill();
 }
 public List<OrderedFood> getList(){
	 System.out.println("Enter the customer name");
	 Scanner sc=new Scanner(System.in);
	 String name=sc.nextLine();
	 System.out.println("Enter  0 to end the Order or 1-11");
	String num=sc.nextLine();
	Map<String,Integer> m=new LinkedHashMap<>();
	String fn="";
	int q;
	 while(!num.equals("0"))
	 {
		 switch(num)
		 {
		 case "1":
			  fn="Parotta";
			 System.out.println("Enter the quantity for "+fn);
			  q=sc.nextInt();
			 m.put(fn,q);
			 break;
		 case "2":
			 fn="Idli";
			 System.out.println("Enter the quantity for "+fn);
			 q=sc.nextInt();
			 m.put(fn,q);
			 break;
		 case "3":
			 fn="Plain Dosa";
			 System.out.println("Enter the quantity for "+fn);
			 q=sc.nextInt();
			 m.put(fn,q);
			 break;
		 case "4":
			 fn="Masal Dosa";
			 System.out.println("Enter the quantity for "+fn);
			 q=sc.nextInt();
			 m.put(fn,q);
			 break;
		 case "5":
			 fn="Podi Dosa";
			 System.out.println("Enter the quantity for "+fn);
			 q=sc.nextInt();
			 m.put(fn,q);
			 break;
		 case "6":
			 fn="Kari Dosa";
			 System.out.println("Enter the quantity for "+fn);
			 q=sc.nextInt();
			 m.put(fn,q);
			 break;
		 case "7":
			 fn="Poori";
			 System.out.println("Enter the quantity for "+fn);
			 q=sc.nextInt();
			 m.put(fn,q);
			 break;
		 case "8":
			 fn="Chappathi";
			 System.out.println("Enter the quantity for "+fn);
			 q=sc.nextInt();
			 m.put(fn,q);
			 break;
		 case "9":
			 fn="Mushroom(veg)";
			 System.out.println("Enter the quantity for "+fn);
			 q=sc.nextInt();
			 m.put(fn,q);
			 break;
		 case "10":
			 fn="Chettinad (Non-veg)";
			 System.out.println("Enter the quantity for "+fn);
			 q=sc.nextInt();
			 m.put(fn,q);
			 break;
		 case "11":
			 fn="Chicken Biriyani";
			 System.out.println("Enter the quantity for "+fn);
			 q=sc.nextInt();
			 m.put(fn,q);
			 break;
		 default:
			 try {
			throw new MissingException();
			 }
			 catch(Exception e)
			 {
				 System.out.println(e);
			 }
			}
		 System.out.println("Enter the 0 to end the Order or 1-11 to continue");
		 sc.nextLine();
         num=sc.nextLine();
	}
	 System.out.println("Name of the customer is : "+name);
	 ArrayList<OrderedFood>al=new ArrayList<>();
	for(Map.Entry<String,Integer> entry:m.entrySet())
	 {
		 al.add(new OrderedFood(entry.getKey(),entry.getValue()));
	 }
	return al;
 }
}