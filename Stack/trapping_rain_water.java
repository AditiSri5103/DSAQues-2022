package Stack;

public class trapping_rain_water {
    class Solution {
        public int trap(int[] height) {
         int left[]=new int[height.length];
            int right[]=new int[height.length];
            int n=height.length;
            int i,water=0;
            int max1=height[0];
              int max2=height[n-1];
            left[0]=height[0];
            right[n-1]=height[n-1];
            for(i=1;i<n;i++){
                if(height[i]>max1)
                {
                    max1=height[i];
                    left[i]=height[i];
                }
                else
                     left[i]=max1;
            }
            for(i=n-2;i>=0;i--){
                if(height[i]>max2)
                {
                    max2=height[i];
                    right[i]=height[i];
                }
                else
                     right[i]=max2;
            }
            for(i=0;i<n;i++){
                water+=Math.min(left[i],right[i])-height[i];
            }
            /*for(i=0;i<n;i++){
                System.out.print(left[i]+"   ");
            }
              System.out.println();
             for(i=0;i<n;i++){
                System.out.print(right[i]+"   ");
            }*/
            return water;
        }
    }
}
