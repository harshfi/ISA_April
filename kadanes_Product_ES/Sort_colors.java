package ISA_April;

public class Sort_colors {
	public static void main(String args[]) {
        int a[]={2,0,2,1,1,0,1};
         sort(a);
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
	public static void sort(int a[])
    {
		 int s=0;
	        int i=0;
	        int e=a.length-1;
	        while(i<=e){


	            if(a[i]==0){
	                int temp=a[s];
	                a[s]=a[i];
	                a[i]=temp;
	                s++;
	                i++;
	            }
	            else if(a[i]==2){
	                int temp=a[e];
	                a[e]=a[i];
	                a[i]=temp;
	                e--;
	            }
	            else{
	                i++;
	            }
	        }

        
      }

	 
}
	    
	   