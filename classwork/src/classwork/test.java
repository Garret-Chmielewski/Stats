package classwork;

public class test 
{
	public static void main(String[] args)
	{
		example118 test = new example118();
		
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
	}
}
