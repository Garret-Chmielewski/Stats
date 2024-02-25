package classwork;

import java.util.ArrayList;
import java.math.BigInteger;


public class SetOperations 
{
	/* Chapter 1 coding*/
	
	/**
	 * 
	 * @param userInput
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
	 * 
	 * @param userInput
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
	 * 
	 * @param userInput
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
	 * 
	 * @param userinput
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
	 * 
	 * @param userinput
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
	 * 
	 * @param n
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
	 * 
	 * @param n
	 * @param r
	 * @return
	 */
	public int permutaion(int n, int r)
	{
		int per=factorial(n) / factorial(n-r);
		return per;
	}
	/**
	 * 
	 * @param n
	 * @param r
	 * @return
	 */
	public int combination(int n, int r)
	{
		int com =factorial(n) / (factorial(r) * factorial(n-r));
		return com;
	}
	/**
	 * 
	 * @param sample
	 * @param other
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
	 * 
	 * @param sample
	 * @param other
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
	 * 
	 * @param sample
	 * @param other
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
	 *
	 * @param d
	 * @param e
	 * @param A_given_B
	 * @param B_given_A
	 * @param U
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
	 * 
	 * @param n
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
	 * 
	 * @param p
	 * @param n
	 * @param y
	 * @return
	 */
	public double BinomialProb(double p, int t, int s )
	{
		double q = 1-p;
		double result = combination(t,s)* Math.pow(p, s) * Math.pow(q, (t-s));
		
	return result;
	}
}
