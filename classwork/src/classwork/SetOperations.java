package classwork;

import java.util.ArrayList;
import java.math.BigInteger;


public class SetOperations 
{
	/* Chapter 1 coding*/
	
	/**
	 * finds the mean of an array of values
	 * @param userInput array that user puts in
	 * @return
	 */
	public double findMean(int[] userInput)
	{
		double sum=0;
		for(int i=0;i<userInput.length;i++)
		{
			sum = userInput[i] + sum;
			
		}
		
		double result =sum /userInput.length;
		
		return result;
	}
	/**
	 * finds the median of an array of values
	 * @param userInput array that user puts in
	 * @return
	 */
	public double findMedian(int[] userInput)
	{
		double middle = 0;
		for(int i=0;i<userInput.length;i++)
		{
			if(userInput.length%2 ==0)
			{
				middle = userInput[(int) (Math.floor(userInput.length/2)+(Math.ceil(userInput.length/2))/2)];
			}
			else
			{
				middle = userInput[userInput.length/2];
			}
		}
		return middle;
	}
	/**
	 * finds the mode of an array of values
	 * @param userInput array user that user puts in
	 * @return
	 */
	public double findMode(int[] userInput)
	{
		double most =0;
		int totalCount=0;
		for(int i=0;i<userInput.length;i++)
		{
			int count=0;
			for(int q=0;q<userInput.length;q++)
			{
				if(userInput[i] == userInput[q])
				{
					count++;
				}
			}
			if(count> totalCount)
			{
				totalCount=count;
				most =userInput[i];
			}
			
			
		}
		return most;
	}
	/**
	 * finds the variance of an array of values
	 * @param userinput array that user puts in
	 * @return
	 */
	public double findVariance(int[]userinput)
	{
		double total=0;
		double totalSquared =0;
		double totalCount= userinput.length-1;
		double variance;
		double mean = findMean(userinput);
		
		
		for(double value : userinput)
		{
			total += value;
			totalSquared += Math.pow(value-mean, 2);
			
		}
		variance =(1/totalCount) * totalSquared;
		
		return variance;
	}
	/**
	 * finds the Standard deviation of an array of values
	 * @param userinput array that user puts in
	 * @return
	 */
	public double findStandardDiviation(int[]userinput)
	{	
		double SD = findVariance(userinput);
		SD = Math.sqrt(SD);
				
		return SD;
	}
	
	/* Chapter 2 coding*/
	
	/**
	 * finds the factorial of a value put into the function
	 * @param n value that user inputs
	 * @return
	 */
	public int factorial(int n) {
	      int fact = 1;
	      int i = 1;
	      while(i <= n) {
	         fact = fact * i;
	         i++;
	      }
	      return fact;
	   }
	
	/**
	 * find the permutations between two numbers 
	 * @param n one integer that the user selected 
	 * @param r another integer that the user selected 
	 * @return
	 */
	public int permutaion(int n, int r)
	{
		int per=factorial(n) / factorial(n-r);
		return per;
	}
	/**
	 * find the combinations between two numbers 
	 * @param n one integer that the user selected 
	 * @param r another integer that the user selected 
	 * @return
	 */
	public int combination(int n, int r)
	{
		int com =factorial(n) / (factorial(r) * factorial(n-r));
		return com;
	}
	/**
	 * finds the intersections between 2 arrayLists 
	 * @param sample one ArrayList that the user inputs
	 * @param other another ArrayList that the user inputs
	 * @return
	 */
	public ArrayList<String> intersection(ArrayList<String> sample, ArrayList<String> other)
	{
		ArrayList<String> intersection = new ArrayList<>();
		
		for(int i=0;i<sample.size();i++)
		{
			for(int j=0; j < other.size();j++)
			{
				if(sample.get(i).equals(other.get(j)) )
				{
					intersection.add(sample.get(i));
					
				}
			}
		}
		return intersection;
				
		
	}
	/**
	 * finds the union between 2 arrayLists 
	 * @param sample one ArrayList that the user inputs
	 * @param other another ArrayList that the user inputs
	 * @return
	 */
	public ArrayList<String> union(ArrayList<String> sample, ArrayList<String> other)
	{
		ArrayList<String> union = new ArrayList<>();
		
		for(int i =0; i< sample.size(); i++ )
		{
			union.add(sample.get(i));
		}
		
		for(int j=0; j< other.size(); j++ )
		{
				if(!union.contains(other.get(j)))
				{
					union.add(other.get(j));
				}
		}
		return union;
	}
	
	/**
	 * finds the complement between 2 arrayLists 
	 * @param sample one ArrayList that the user inputs
	 * @param other another ArrayList that the user inputs
	 * @return
	 */
	public ArrayList<String> complement(ArrayList<String> sample, ArrayList<String> other)
	{
		ArrayList<String> comp = new ArrayList<>();
		
		for(int j=0; j< other.size(); j++ )
		{
			comp.add(other.get(j));
		}
		
		for(int i =0; i< sample.size(); i++ )
		{
			for(int k=0; k< comp.size(); k++ )
			{
				if(sample.get(i)== comp.get(k))
				{
					comp.remove(k);
				}
			}
		}
		return comp;
	}
	
	/**
	 * Determines if a statement is independent or not.
	 * @param A probability of event A happening
	 * @param B probability of event B happening
	 * @param A_given_B probability of A happening given B
	 * @param B_given_A probability of B happening given A
	 * @param U the probability of the Union of A and B
	 * @return
	 */
	public Boolean isIndependent(double A, double B, double A_given_B, double B_given_A, double U)
	{
		Boolean independent =false;
		
		double u = A*B;
		
		if(A_given_B == A)
		{
			independent =true;
		}
		else if(B_given_A== B)
		{
			independent =true;
		}
		else if(U == u)
		{
			independent =true;
		}
		return independent;
	}
	
	/**
	 * finds factorial using BigInteger class
	 * @param n value the user inputs 
	 * @return
	 */
	public BigInteger factor(BigInteger n)
	{
		if (n.equals(BigInteger.ZERO))
		{
			return BigInteger.ONE;
		}
			
		
		BigInteger result = BigInteger.ONE;
			
		
		for (BigInteger i = BigInteger.ONE; i.compareTo(n) <= 0; i = i.add(BigInteger.ONE))
		{
			
			result = result.multiply(i);
		}
			
		
		return result;
	}
	
	/* Chapter 3 coding*/
	
	/**
	 * finds the binomial distribution probability 
	 * @param p probability of success at a given event
	 * @param t total number of trials
	 * @param s the number of successful trials 
	 * @return
	 */
	public double BinomialProb(double p, int t, int s )
	{
		double q = 1-p;
		double result = combination(t,s)* Math.pow(p, s) * Math.pow(q, (t-s));
		
	return result;
	}
	
	/**
	 * finds the expected value of a binomial distribution 
	 * @param p probability of success
	 * @param t total number of trials
	 * @return
	 */
	public double findExpectedBio(double p, int t)
	{
		double expected = t * p;
		return expected;
	}
	
	/**
	 * finds the Standard deviation value of a binomial distribution 
	 * @param p probability of success
	 * @param t total number of trials
	 * @return
	 */
	public double findvarianceBio(double p, int t)
	{
		double variance= (t * p) * (1-p);
		return variance;
	}
	/**
	 * finds the Geometric distribution probability
	 * @param p probability of success at a given event
	 * @param t the total number of trials
	 * @return
	 */
	public double GeoProb(double p, int t)
	{
		double q = 1-p;
		double result = Math.pow(q,t-1)* p;
		return result;
		
	}
	
	/**
	 * finds the expected Geometric distribution
	 * @param p probability of success
	 * @return
	 */
	public double indExpectedGeo(double p)
	{
		double expected =1/p;
		return expected;
	}
	
	/**
	 * finds the standard deviation Geometric distribution
	 * @param p 
	 * @return
	 */
	public double findvarianceGeo(double p)
	{
		double variance= (1-p)/Math.pow(p, 2);
		return variance;
	}
	
	/**
	 * find the Hypergeometric distribution probability
	 * @param N Total population for the event
	 * @param r the values of interest for and event
	 * @param n sample of the total population
	 * @param y the number of the section we are interested in 
	 * @return
	 */
	public double HypProb(int N, int r, int n, int y)
	{
		double top = combination(r,y) * combination(N-r,n-y);
		double bottem =combination(N,n);
		double result = top/bottem;
		return result;
	}
	
	/**
	 * finds the expected value of Hypergeometric distribution
	 * @param n sample of population
	 * @param r the section we are interested in 
	 * @param N The population for the event
	 * @return
	 */
	public double findExpectedhyp(double n, double r, double N)
	{
		double expected = (n*r)/N;
		return expected;
	}
	
	/**
	 * finds the Standard Deviation value of Hypergeometric distribution
	 * @param n sample of population
	 * @param r the section we are interested in 
	 * @param N The population for the event
	 * @return
	 */
	public double findvariancehyp(double n, double r, double N)
	{
		double first = r/N;
		double second = (N-r)/N;
		double third = (N-n)/(N-1);
		double variance= first * second * third;
		return variance;
	}
	
	/**
	 * finds the Negative Binomial Probability Distribution
	 * @param y total number of trials
	 * @param r number of successful trials
	 * @param p probability of success
	 * @return
	 */
	public double negativeBio(int y, int r, double p)
	{
		double q=1-p;
		double total= combination(y-1,r-1)* Math.pow(p, r) * Math.pow(q, (y-r));
		return total;
	}
	
	/**
	 * finds the expected Negative Binomial Probability 
	 * @param r number of successful trials
	 * @param p probability of success
	 * @return
	 */
	public double findexpectedNegativeBio(int r,double p)
	{
		double expected =r/p;
		return expected;
	}
	
	/**
	 * finds the Standard deviation Negative Binomial Probability 
	 * @param r number of successful trials
	 * @param p probability of success
	 * @return
	 */
	public double findvarianceNegativeBio(double r, double p)
	{
		double num = r*(1-p);
		double dem = Math.pow(p, 2);
		double variance = num/dem;
		return variance;
	}

}
