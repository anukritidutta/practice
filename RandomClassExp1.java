import java.util.*;
public class RandomClassExp1
{
	public static void main(String args[])
	{
		Random A = new Random(20);
		
		System.out.print("\n\tValue in Object A is :" + A);
		
		System.out.print("\n\tInteger Random Value is :" + A.nextInt());
		System.out.print("\n\tFloat Random  value is:" + A.nextFloat());
		System.out.print("\n\tLong Random Value Is  :" + A.nextLong());
		System.out.print("\n\tDouble Random Value Is  :" + A.nextDouble());
		
		System.out.print("\n\tInteger Random Value is :" + A.nextInt(10));	// seed
	}
}