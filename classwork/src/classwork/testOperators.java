package classwork;

import java.math.BigInteger;
import java.util.ArrayList;

public class testOperators  
{
	public static void main(String[] args) 
	{
		SetOperations test = new SetOperations(); 
		
int[] mySampleNumbers = {1,2,3,4,5,6,7,8,9};
		
		double storermean = test.findMean(mySampleNumbers);
		
		double storemedian = test.findMedian(mySampleNumbers);
		
		double storemode = test.findMode(mySampleNumbers);
		
		double findVariance = test.findVariance(mySampleNumbers);
		
		double findStandardDiviation = test.findStandardDiviation(mySampleNumbers);
		
		System.out.println("The average is:"+ storermean);
		
		System.out.println("the median is:" + storemedian);
		
		System.out.println("the mode is:" + storemode);
		
		System.out.println("the variance is:" + findVariance);
		
		System.out.println("the Standard Diviation is:" + findStandardDiviation);
		
		
ArrayList<String> sample = new ArrayList<>();
		
		sample.add("1");
		sample.add("2");
		sample.add("3");
		sample.add("4");
		sample.add("5");
		
		ArrayList<String> other  = new ArrayList<>() ;
	
		other.add("2");
		other.add("4");
		other.add("6");
		
		ArrayList<String> findintersection = test.intersection(sample,other); 
		
		ArrayList<String> findUnion = test.union(sample,other);
		
		ArrayList<String> findcomp = test.complement(sample,other);
		
		int findfactorial =test.factorial(5);
		
		BigInteger findfact = test.factor(BigInteger.valueOf(3));
		
		int fiindpermutation = test.permutaion(7,3);
		
		int findcombination = test.combination(7,3);
		
		Boolean findindependency = test.isIndependent(.6,.2,.5,.8,.9);
		
		System.out.println("the intersection of the lists is " + findintersection);
	
		System.out.println("the union of the lists is " + findUnion );
		
		System.out.println("the complement of the list is " + findcomp );
		
		System.out.println("the factorial is equal to: " + findfactorial);
		
		System.out.println("the factorial is equal to: " + findfact);
		
		System.out.println("the permutaions of these numbers " + fiindpermutation );
		
		System.out.println("the combinations of these numbers " + findcombination );
		
		System.out.println("is the statment Independent: " + findindependency );
		
		double findbio =test.BinomialProb(.8,4,2);
		
		System.out.println("the Binomial Probaility of these numbers is: " + findbio );
		
		
	}
}
