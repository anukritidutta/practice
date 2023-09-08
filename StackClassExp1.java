import java.util.*;
public class StackClassExp1
{
	public static void main(String args[])
	{
		Stack A = new Stack();
		
		System.out.print("\n\t Value In Object A is :" + A);
		System.out.print("\n\t Value In Object A is :" + A.empty());
		
		A.push(25);
		A.push(23.232);
		A.push('a');
		A.push("Star");
		A.push(false);
		
		System.out.print("\n\t Value In Object A is :" + A);
		System.out.print("\n\t Value In Object A is :" + A.empty());
		
		A.pop();
		System.out.print("\n\t Value In Object A is :" + A);
		
		System.out.print("\n\t Value In Object A is :" + A.peek());
		System.out.print("\n\t Value In Object A is :" + A.search('a'));
		
		
		
	}
}