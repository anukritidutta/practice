import java.util.*;
public class VectorClassExp1
{
	public static void main(String args[])
	{
		Vector A = new Vector();		// 10
		Vector B = new Vector(15);
		Vector C = new Vector(20,3);		// size,increment factor
		
		System.out.print("\n\tValue In Object A is :" + A);
		System.out.print("\n\tValue In Object B is :" + B);
		System.out.print("\n\tValue In Object C is :" + C);
		
		A.addElement(12);
		A.addElement(122.121);
		A.addElement('g');
		A.addElement("sumit");
		A.addElement(false);
		System.out.print("\n\tValue In Object A is :" + A);
		System.out.print("\n\tSize of Object A is :" + A.size());
		System.out.print("\n\tCapacity of Object A is :" + A.capacity());
		
		A.insertElementAt("mukesh",3);
		System.out.print("\n\tValue In Object A is :" + A);
		A.setElementAt("mukesh",0);
		System.out.print("\n\tValue In Object A is :" + A);
		
		A.removeElementAt(0);
		System.out.print("\n\tValue In Object A is :" + A);
		
		System.out.print("\n\tEleemnt At This is Postion :" + A.elementAt(2));
		
		System.out.print("\n\tValue In Object A is :" + A.indexOf('g'));
		System.out.print("\n\tValue In Object A is :" + A.lastIndexOf(false));
		
		for(int i=1;i<=16;i++)
		{
			B.addElement(i);
		}
		System.out.print("\n\tvalue Of Object B is :" + B);
		System.out.print("\n\tSize Of Object B is :" + B.size());
		System.out.print("\n\tCapacity Of Object B is :" + B.capacity());
		
		System.out.print("\n\tFirst Element Of Object B is :" + B.firstElement());
		System.out.print("\n\tLast Element Of Object B is :" + B.lastElement());
		
		C.setSize(8);
		System.out.print("\n\t Size Of Object C is :" + C.size());
		System.out.print("\n\t Capacity Of Object C is :" + C.capacity());
		
		C.ensureCapacity(28);
		System.out.print("\n\t Size Of Object C is :" + C.size());
		System.out.print("\n\t Capacity Of Object C is :" + C.capacity());
		
		Enumeration eObj = A.elements();
		
		A.addElement(2332);
		A.addElement("Anil");
		
		
		while(eObj.hasMoreElements())
		{
			System.out.print("\n\t" + eObj.nextElement());
		}
	}
}










