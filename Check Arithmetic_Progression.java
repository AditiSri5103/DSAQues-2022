class Solution
{
    boolean checkIsAP(int arr[] ,int n)
    {
       Arrays.sort(arr);
       int diff=arr[1]-arr[0];
       for(int i=1;i<n-1;i++){
           if((arr[i]+diff)!=arr[i+1])
           return false;
       }
        return true;

    
    }
}
