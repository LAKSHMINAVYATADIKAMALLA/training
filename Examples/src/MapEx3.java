import java.util.*;
public class MapEx3
{
	public static void main(String[] args)
	{
		HashMap<Integer,Integer>stats= new HashMap<Integer,Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of enteries..");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("enter the year");
			int year=sc.nextInt();
			System.out.println("enter the number of admissions..");
			int noa=sc.nextInt();
			stats.put(year, noa);
		}
		Set Keys=stats.entrySet();
		Iterator itr=Keys.iterator();
		int max=0;
		int tyear=0;
		int temp=0;
		while(itr.hasNext())
		{
			Map.Entry entry=(Map.Entry)itr.next();
		    temp=(Integer) entry.getValue();
			if(temp>max)
			{
				max=temp;
				tyear =(Integer)entry.getKey();
			}
		
	    }
		System.out.println("the details of maximum admission are: ");
		System.out.println("Year:"+tyear+"number of admission are"+temp);

}
}
