package ISA_April;
public class Kadanes_Algo {
	 public static void main(String args[]) {
	        int a[]={-3,-4,-5,-1,-2};
	        int max= -100000;
	        int sum=0;
	        for(int i=0;i<a.length;i++){

	            sum=sum+a[i];

	            max=Math.max(sum,max);

	            if(sum<0) sum=0;
	        }
	        System.out.println(max);
	    
	        
	    }

}
