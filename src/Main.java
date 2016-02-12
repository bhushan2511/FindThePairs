
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Given an integer array find all combination of pair of number which sums up to given sum, 
		 * if used once the same number cannot be used again */
		
					
		int [] a = { 1,2,3,4,4,5,6,6,6,6,5};
		int sum=10;		
		SumOfTwoNumbers findpairs =new SumOfTwoNumbers();
		findpairs.identifyPairs(a, sum);
		
		
	}

}
