import java.util.*;

 interface Mathematics
{
	public int add(int a,int b);
	
}
public class ThreadLamda 
{
	public static void main(String[] args)
			{
		Runnable r=()->
		{
			for(int i=0;i<=10;i++)
				System.out.println(i);
		};
		Thread t=new Thread(r);
		t.start();
			Mathematics run=(a,b)->a+b;
			
			System.out.println(run.add(10, 10));
			System.out.println(run.add(876, 765));
			
		
			}
		
			
			
	

}
