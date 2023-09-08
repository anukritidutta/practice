import java.util.*;
public class DateClassExp1
{
	public static void main(String args[]){
	
		Date A = new Date();
		System.out.print("\n\tCurrent Date And Time Is :" + A);
		
		Date B = new Date(123,6,20);
		
		System.out.print("\n\tDate In Object B is :" + B);
		
		Date C = new Date(120,5,12,5,30,60);
		System.out.print("\n\tDate In Object C is :" + C);
		
		Date D = new Date("5 july 2023");
		System.out.print("\n\tDate In Object D is :" + D);
		
		System.out.print("\n\tYear Is :" + D.getYear());
		System.out.print("\n\tMonth Is :" + D.getMonth());
		System.out.print("\n\tDay Is :" + D.getDate());
	}
}