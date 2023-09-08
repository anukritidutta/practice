import java.util.*;
public class hashTableExp1
{
	public static void main(String args[]){
		
		Hashtable A = new Hashtable();	//16
		Hashtable B = new Hashtable(10);	//10
		
		Hashtable C = new Hashtable(10,.80f);	// capacity, loading capacity
		
		System.out.print("\n\t Value in Object A Is :" + A);
		System.out.print("\n\t Value in Object B Is :" + B);
		System.out.print("\n\t Value in Object C Is :" + C);
		
		
		A.put("A",12);	// A.put(key,value)
		A.put("B",12.21);
		A.put("C","Mukesh");
		A.put("D",'k');
		A.put("E",false);
		System.out.print("\n\t Value in Object A Is :" + A);
		System.out.print("\n\t Value in Object A Is :" + A.size());
		System.out.print("\n\t Value in Object A Is :" + A.get("D"));
		
		Enumeration kys = A.keys();
		Enumeration value = A.elements();
		
		while(kys.hasMoreElements())
		{
			String k = (String)kys.nextElement();
			System.out.print("\n\t" + k + "==> " + A.get(k));
		}
		
		System.out.print("\n\tValue In A Object is : " + A.containsKey("D"));
		System.out.print("\n\tValue In A Object is : " + A.containsValue("anil"));
	}
}









