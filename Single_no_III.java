class Solution {
    public int[] singleNumber(int[] nums) {
       Set<Integer> set=new HashSet<>();
        int arr[]=new int[2];
       int i,n=nums.length,k=0;
        for(i=0;i<n;i++){
            if(set.contains(nums[i])){
                set.remove(nums[i]);
            }
            else
                set.add(nums[i]);
        }
        for (Integer it: set) {
          arr[k++] = it;
}
        return arr;
    }
}
