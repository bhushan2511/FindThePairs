import java.util.HashMap;
import java.util.HashSet;

public class SumOfTwoNumbers {
	
	public void identifyPairs(int [] a,int sum)
	{
		HashSet<Integer> uniqueNum= new HashSet<Integer> ();
		HashMap<Integer,Integer> pairs = new HashMap<Integer,Integer> ();
		
		//o(n) is complexity, if we don't use uniqueNum then the same pair will repeat as many times as it is in the array
		for(int i=0;i<a.length;i++)
		{
			if(!uniqueNum.contains(a[i]) && pairs.containsKey(a[i]))
			{
	
				if(sum-a[i]==pairs.get(a[i]))
				{
					System.out.println("Pairs: " + a[i] + " " + (sum-a[i]));
					uniqueNum.add(a[i]);
					
				}
				
			}
			else if(!pairs.containsKey(sum-a[i]))
			{
				pairs.put(sum-a[i],a[i]);
			}
		}
	}

}
