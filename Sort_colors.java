class Solution {
    public void sortColors(int[] nums) {
       int i,n=nums.length,zero=0,one=0,two=0,k=0,c=0;
        for(i=0;i<n;i++){
            if(nums[i]==0)
                zero++;
            else if(nums[i]==1)
                one++;
            else if(nums[i]==2)
                two++;
        }
        while(c<zero){
            nums[k++]=0;
            c++;
        }
        c=0;
        while(c<one){
            nums[k++]=1;
            c++;
        }
        c=0;
        while(c<two){
            nums[k++]=2;
            c++;
        }
        
    }
}