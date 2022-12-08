class Solution {
    private int left(int[] nums, int target){
        int l=0,h=nums.length-1,mid,ind=-1;
        while(l<=h){
            mid=(l+h)/2;
            if(nums[mid]>target)
            h=mid-1;
            else if(nums[mid]<target)
            l=mid+1;
            else{
                ind=mid;
                h=mid-1;
            }
        }
        return ind;
    }
    private int right(int[] nums, int target){
        int l=0,h=nums.length-1,mid,ind=-1;
        while(l<=h){
            mid=(l+h)/2;
            if(nums[mid]>target)
            h=mid-1;
            else if(nums[mid]<target)
            l=mid+1;
            else{
                ind=mid;
                l=mid+1;
            }
        }
        return ind;
    }
    public int[] searchRange(int[] nums, int target) {
        int ar[]=new int[2];
        int a=left(nums,target);
        int b=right(nums,target);
        ar[0]=a;
        ar[1]=b;
        return ar;
    }
}
