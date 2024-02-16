package classwork;

import java.util.ArrayList;

public class example118 
{
	
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
	
	public double findStandardDiviation(int[]userinput)
	{	
		double SD = findVariance(userinput);
		SD = Math.sqrt(SD);
				
		return SD;
	}
}
