package ISA_April;

public class product_except_self {
	public static void main(String args[]) {
        int a[]={2,3,4,5,6};
       int ans[] =P_E_Self(a);
       for(int i=0;i<ans.length;i++)
      System.out.print(ans[i]+" ");
       
    
        
    }
    public static int [] P_E_Self(int a[]){
        int n=a.length;
        int left[]=new int[n];
        int right[]=new int [n];
      
      left[0]=1;
      //product of element to left of it
      for(int i=1;i<n;i++){
          left[i]=left[i-1]*a[i-1];
      }

      //product of element to right of it
      right[n-1]=1;
      for(int i=n-2;i>=0;i--){
          right[i]=right[i+1]*a[i+1];
      }
      int ans[]=new int [n];
      for(int i=0;i<n;i++){
          ans[i]=left[i]*right[i];
      }
      
      return ans;


    }
}
