import java.util.*;
class climbing_stairs {
    Map<Integer,Integer> map=new HashMap<>();
     public int rec(int n){
       if(map.containsKey(n))
       return map.get(n);
       if(n==0||n==1)
       return 1; 
       else{
          int left=rec(n-1);
          int right=rec(n-2);
           int s= left+right;
           map.put(n,s);
           return s;
       }   
     }
     public int climbStairs(int n) {
       return (rec(n));
     }
 }
 