package classwork;

import java.math.BigInteger;
import java.util.ArrayList;

public class testOperators  
{
	public static void main(String[] args) 
	{
		SetOperations test = new SetOperations(); 
		
int[] mySampleNumbers = {1,2,3,4,5,6,7,8,9};
		
	/*
	 * Chapter 1  
	 */

		double storermean = test.findMean(mySampleNumbers);
		
		double storemedian = test.findMedian(mySampleNumbers);
		
		double storemode = test.findMode(mySampleNumbers);
		
		double findVariance = test.findVariance(mySampleNumbers);
		
		double findStandardDiviation = test.findStandardDiviation(mySampleNumbers);
		
		System.out.println("Chapter 1");
		
		System.out.println("The average is:"+ storermean);
		
		System.out.println("the median is:" + storemedian);
		
		System.out.println("the mode is:" + storemode);
		
		System.out.println("the variance is:" + findVariance);
		
		System.out.println("the Standard Diviation is:" + findStandardDiviation);
		
		System.out.println();
		
		/*
		 * Chapter 2
		 */
		
		
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
		
		BigInteger findfact = test.factor(BigInteger.valueOf(5));
		
		int fiindpermutation = test.permutaion(7,3);
		
		int findcombination = test.combination(7,3);
		
		Boolean findindependency = test.isIndependent(.6,.2,.5,.8,.9);
		
		System.out.println("Chapter 2");
		
		System.out.println("the intersection of the lists is " + findintersection);
	
		System.out.println("the union of the lists is " + findUnion );
		
		System.out.println("the complement of the list is " + findcomp );
		
		System.out.println("the factorial is equal to: " + findfactorial);
		
		System.out.println("the factorial (using Big Int)is equal to: " + findfact);
		
		System.out.println("the permutaions of these numbers " + fiindpermutation );
		
		System.out.println("the combinations of these numbers " + findcombination );
		
		System.out.println("is the statment Independent: " + findindependency );
		
		System.out.println();
		
		/*
		 * Chapter 3  
		 */
		
		double success = .8;
		
		double findbio =test.BinomialProb(success,4,2);
		
		double findexpected = test.findExpectedBio(success,4); 
		
		double findvariance = test.findvarianceBio(success,4);
		
		double findgeo =test.GeoProb(success,5);
		
		double findexpectedgeo = test.indExpectedGeo(success); 
		
		double findvariancegeo = test.findvarianceGeo(success);
		
		double findhyp = test.HypProb(10,5,4,0);
		
		double findexpectedhyp = test.findExpectedhyp(10,5,4); 
		
		double findvariancehyp = test.findvariancehyp(10,5,4);
		
		double findNegativeBio = test.negativeBio(5,3,.2);
		
		double findexbectedNegative = test.findexpectedNegativeBio(3,.2); 
		
		double findvarianceNegativeBio = test.findvarianceNegativeBio(3,.2);
		
		System.out.println("Chapter 3");
		
		System.out.println("the Binomial Probaility of these numbers is: " + findbio );
		
		System.out.println("the expected Binomial Probaility of these numbers is: " + findexpected );
		
		System.out.println("the variance of this Binomial Probaility of these numbers is: " + findvariance );
		
		System.out.println("the Geometric Probaility of these numbers is: " + findgeo );
		
		System.out.println("the expected Geometric Probaility of these numbers is: " + findexpectedgeo );
		
		System.out.println("the variance of this Geometric Probaility of these numbers is: " + findvariancegeo);
		
		System.out.println("the Hypergeometric Probaility of these numbers is: " + findhyp );
		
		System.out.println("the expected Hypergeometric Probaility of these numbers is: " + findexpectedhyp );
		
		System.out.println("the variance of this HypergeometricProbaility of these numbers is: " + findvariancehyp);
		
		System.out.println("the negative Binomial Probaility of these numbers is: " + findNegativeBio );
		
		System.out.println("the expected negative Binomial Probaility of these numbers is: " + findexbectedNegative);
		
		System.out.println("the expected negative Binomial Probaility of these numbers is: " + findvarianceNegativeBio);
	}
}
