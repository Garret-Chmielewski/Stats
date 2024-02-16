package classwork;

import java.util.ArrayList;

public class testOperators  
{
	public static void main(String[] args) 
	{
		SetOperations test = new SetOperations(); 
		
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
		
		int fiindpermutation = test.permutaion(7,3);
		int findcombination = test.combination(7,3);
		Boolean findindependency = test.isIndependent(.6,.2,.5,.8,.9);
		
		System.out.println("the intersection of the lists is " + findintersection);
	
		System.out.println("the union of the lists is " + findUnion );
		
		System.out.println("the complement of the list is " + findcomp );
		
		System.out.println("the permutaions of these numbers " + fiindpermutation );
		
		System.out.println("the combinations of these numbers " + findcombination );
		
		System.out.println("is the statment Independent: " + findindependency );
	}
}
