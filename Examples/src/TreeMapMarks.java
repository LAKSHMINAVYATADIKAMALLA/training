
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
class list
{
	
}
/*class UseMainCode
{
	public static Map increaseSalaries(int n,HashMap<Integer,Integer>h1)
	{
		HashMap<Integer,Integer> op=new HashMap<Integer,Integer>();
		Set keys=h1.keySet();
		Iterator itr=keys.iterator();
		while(itr.hasNext())
		{
			int id=(int) itr.next();
			String s=h1.get(id);
			if(s.equals("manager"))
			{
				int newsal=h1.get(id)+5000;
				op.put(id,newsal);
			}
			
		}
		return op;
	}
	
}
*/

public class TreeMapMarks 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		 int sum;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of Students");
		int n=sc.nextInt();
		TreeMap<Integer, Integer> t = new TreeMap<Integer, Integer>();
		
		for(int i=0;i<n;i++)
		{
			int id=sc.nextInt();
			int marks=sc.nextInt();
			t.put(id, marks);
			
		}
		System.out.println(t);
		
		
		System.out.println("Lowest key is: " + t. lowerEntry(1)); 
	}

}
