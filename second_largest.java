package chandriki2;

public class second_largest {
	 
	    public static int[] getSecondOrderElements(int n, int []a) {
	        int[] res=new int[2];
	        int largest=a[0];
	        int slargest=-1;
	        int smallest=a[0];
	        int ssmallest=10000;
	        for(int i=0;i<n;i++)
	        {
	            if(a[i]>largest)
	            {
	                slargest=largest;
	                largest=a[i];
	            }
	            else if(a[i]<largest && a[i]>slargest)
	            {
	                slargest=a[i];
	            }

	        }
	        for(int j=0;j<n;j++)
	        {
	            if(a[j]<smallest)
	            {
	                ssmallest=smallest;
	                smallest=a[j];
	            }
	            else if(a[j]>smallest && a[j]<ssmallest)
	            {
	                ssmallest=a[j];
	            }
	        }
	        res[0]=slargest;
	        res[1]=ssmallest;
	         return  res;
	    }
	   
	}


