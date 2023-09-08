import java.util.*;
public class ArrayListExp1
{
	public static void main(String args[])
	{
		ArrayList A = new ArrayList();	// 10
		ArrayList <Integer>B = new ArrayList<Integer>(15);
		
		System.out.print("\n\tValue in Object A is :" + A);
		System.out.print("\n\tValue in Object B is :" + B);
		
		System.out.print("\n\tSize of Object A is :" + A.size());
		
		for(int i=1;i<=15;i++) B.add(i);
		System.out.print("\n\tValue in Object B is :" + B);
		A.add(23);
		A.add(23.32);
		A.add('g');
		A.add("Star");
		A.add(false);
		System.out.print("\n\tValue in Object A is :" + A);
		System.out.print("\n\tSize of Object A is :" + A.size());
		
		A.add(3,"mohan");
		System.out.print("\n\tValue in Object A is :" + A);
		
		A.set(2,777);
		System.out.print("\n\tValue in Object A is :" + A);
		
		A.remove(1);
		System.out.print("\n\tValue in Object A is :" + A);
		
		System.out.print("\n\tValue in Object A is :" + A.get(3));
	}
}