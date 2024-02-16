package classwork;

import java.util.ArrayList;


public class SetOperations 
{
	/**
	 * 
	 * @param n
	 * @return
	 */
	static int factorial(int n) {
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
	
	
}
